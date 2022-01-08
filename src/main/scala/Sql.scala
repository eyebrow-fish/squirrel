package fish.eyebrow.squirrel

object Sql {
  implicit class SqlInterpolator(val sc: StringContext) extends AnyVal {
    def sql(args: Frag*)(implicit ctx: Ctx): SqlQuery = {
      SqlQuery.fromSqlString(sc.parts
        .zipLeft(args)
        .flatMap(t => t._1 :: t._2.map(_.str) ?? "" :: Nil)
        .mkString)
    }
  }

  sealed trait Frag {
    def str: String
  }
  object Frag {
    trait ToStringFrag[T] extends Frag {
      def x: T
      def str: String = x.toString
    }

    case class StringFrag(str: String) extends Frag
    case class ShortFrag(x: Short) extends ToStringFrag[Short]
    case class IntFrag(x: Int) extends ToStringFrag[Int]
    case class LongFrag(x: Long) extends ToStringFrag[Long]
    case class DoubleFrag(x: Double) extends ToStringFrag[Double]
    case class FloatFrag(x: Float) extends ToStringFrag[Float]
    case class BooleanFrag(x: Boolean) extends ToStringFrag[Boolean]
    case class ByteFrag(x: Byte) extends ToStringFrag[Byte]
    case class CharFrag(x: Char) extends Frag {
      def str: String = s"'$x'"
    }
  }
}
