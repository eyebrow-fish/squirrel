package fish.eyebrow.squirrel

import scala.language.implicitConversions

trait FragParamConversions {
  import FragParam._

  implicit def stringFrag(x: String): StringFrag = StringFrag(x)
  implicit def shortFrag(x: Short): ShortFrag = ShortFrag(x)
  implicit def intFrag(x: Int): IntFrag = IntFrag(x)
  implicit def longFrag(x: Long): LongFrag = LongFrag(x)
  implicit def doubleFrag(x: Double): DoubleFrag = DoubleFrag(x)
  implicit def floatFrag(x: Float): FloatFrag = FloatFrag(x)
  implicit def booleanFrag(x: Boolean): BooleanFrag = BooleanFrag(x)
  implicit def byteFrag(x: Byte): ByteFrag = ByteFrag(x)
  implicit def charFrag(x: Char): CharFrag = CharFrag(x)

  implicit def optFrag[T](opt: Option[T])(implicit conv: T => FragParam[T]): FragParam[T] = {
    opt match {
      case Some(_) =>
        opt.get
      case None =>
        new NullFrag[T]
    }
  }
}
