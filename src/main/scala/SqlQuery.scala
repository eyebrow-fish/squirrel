package fish.eyebrow.squirrel

import cats.effect.IO

import scala.concurrent.Future

class SqlQuery(val raw: String)(implicit ctx: Ctx) {
  import ctx._

  def query[T <: Product : ProductMeta]: IO[List[T]] = {
    IO.fromFuture(IO {
      Future(connection.prepareStatement(raw).executeQuery()).map { resultSet =>
        val results = List.newBuilder[T]
        while (resultSet.next()) {
          val metaData = resultSet.getMetaData
          val size = metaData.getColumnCount
          results += implicitly[ProductMeta[T]].ofObjects {
            (1 to size).map { i =>
              metaData.getColumnName(i) -> resultSet.getObject(i)
            }.toMap
          }
        }
        results.result()
      }
    })
  }

  def update: IO[Boolean] = {
    IO.fromFuture(IO {
      Future(connection.prepareStatement(raw).execute())
    })
  }
}

object SqlQuery {
  def fromSqlString(sql: String)(implicit ctx: Ctx): SqlQuery = {
    new SqlQuery(sql)
  }
}
