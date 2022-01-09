package fish.eyebrow.squirrel

import cats.effect.IO

import java.sql.PreparedStatement
import scala.concurrent.Future

class SqlQuery(val sql: String, val parameters: Seq[FragParam[_]])(implicit ctx: Ctx) {
  import ctx._

  def query[T <: Product : ProductMeta]: IO[List[T]] = {
    IO.fromFuture(IO {
      Future(preparedStatement.executeQuery()).map { resultSet =>
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
      Future(preparedStatement.execute())
    })
  }

  private def preparedStatement: PreparedStatement = {
    val statement = connection.prepareStatement(sql)
    def doSetT[T](p: FragParam[T], i: Int): Unit = {
      p.setT(statement)(i)
    }

    parameters.zipWithIndex.foreach(t => doSetT(t._1, t._2))
    statement
  }
}
