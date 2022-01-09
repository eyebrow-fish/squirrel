package fish.eyebrow.squirrel

import scala.language.implicitConversions

trait FragConversions {
  import FragParam._

  implicit def stringFrag(str: String): StringFrag = StringFrag(str)
  implicit def shortFrag(x: Short): ShortFrag = ShortFrag(x)
  implicit def intFrag(x: Int): IntFrag = IntFrag(x)
  implicit def longFrag(x: Long): LongFrag = LongFrag(x)
  implicit def doubleFrag(x: Double): DoubleFrag = DoubleFrag(x)
  implicit def floatFrag(x: Float): FloatFrag = FloatFrag(x)
  implicit def booleanFrag(x: Boolean): BooleanFrag = BooleanFrag(x)
  implicit def byteFrag(x: Byte): ByteFrag = ByteFrag(x)
  implicit def charFrag(x: Char): CharFrag = CharFrag(x)
}
