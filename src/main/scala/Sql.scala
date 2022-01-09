package fish.eyebrow.squirrel

object Sql {
  implicit class SqlInterpolator(val sc: StringContext) extends AnyVal {
    def sql(args: Frag[_]*)(implicit ctx: Ctx): SqlQuery = {
      val sql = sc.parts.mkString("?")
      new SqlQuery(sql, args.map(_.param))
    }
  }

  trait Frag[T] {
    def param: Param[T]
  }
  object Frag {
    case class StringFrag(str: String) extends Frag[String] {
      override def param: Param[String] = Param.StringParam(str)
    }
    case class ShortFrag(short: Short) extends Frag[Short] {
      override def param: Param[Short] = Param.ShortParam(short)
    }
    case class IntFrag(x: Int) extends Frag[Int] {
      override def param: Param[Int] = Param.IntParam(x)
    }
    case class LongFrag(x: Long) extends Frag[Long] {
      override def param: Param[Long] = Param.LongParam(x)
    }
    case class DoubleFrag(x: Double) extends Frag[Double] {
      override def param: Param[Double] = Param.DoubleParam(x)
    }
    case class FloatFrag(x: Float) extends Frag[Float] {
      override def param: Param[Float] = Param.FloatParam(x)
    }
    case class BooleanFrag(x: Boolean) extends Frag[Boolean] {
      override def param: Param[Boolean] = Param.BooleanParam(x)
    }
    case class ByteFrag(x: Byte) extends Frag[Byte] {
      override def param: Param[Byte] = Param.ByteParam(x)
    }
    case class CharFrag(char: Char) extends Frag[String] {
      override def param: Param[String] = Param.StringParam(char.toString)
    }
  }
}
