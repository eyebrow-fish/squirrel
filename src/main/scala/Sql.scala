package fish.eyebrow.squirrel

object Sql {
  implicit class SqlInterpolator(val sc: StringContext) extends AnyVal {
    def sql(args: FragParam[_]*)(implicit ctx: Ctx): SqlQuery = {
      val sql = sc.parts.mkString("?")
      new SqlQuery(sql, args)
    }
  }
}
