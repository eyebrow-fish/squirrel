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
          val size = resultSet.getMetaData.getColumnCount
          implicitly[ProductMeta[T]].ofObjects {
            (0 to size).map(resultSet.getObject).toList
          }
        }
        results.result()
      }
    })
  }
}

object SqlQuery {
  def fromSqlString(sql: String)(implicit ctx: Ctx): SqlQuery = {
    new SqlQuery(sql)
  }
}
