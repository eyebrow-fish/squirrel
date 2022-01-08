package fish.eyebrow.squirrel

import java.sql.Connection
import scala.concurrent.ExecutionContext

case class Ctx()(
  implicit val connection: Connection,
  implicit val executionContext: ExecutionContext,
)
