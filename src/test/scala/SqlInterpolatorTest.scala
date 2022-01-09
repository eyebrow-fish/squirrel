package fish.eyebrow.squirrel

import Sql._

import Param._
import org.scalatest.flatspec.AnyFlatSpec

class SqlInterpolatorTest extends AnyFlatSpec {
  implicit val ctx: Ctx = Ctx()(null, null)

  "sql strings" should "interpolate ToStringFrags" in {
    val string: String = "hi"
    val short: Short = 255
    val int: Int = 888
    val long: Long = 9999
    val double: Double = 123.2
    val float: Float = 123.3F
    val boolean: Boolean = true
    val char: Char = 'a'
    val byte: Byte = 1
    val query = sql"""SELECT * FROM SomeTable WHERE string = $string AND short = $short AND int = $int AND long = $long AND double = $double AND float = $float AND boolean = $boolean AND byte = $byte AND char = $char"""

    assert(query.sql == """SELECT * FROM SomeTable WHERE string = ? AND short = ? AND int = ? AND long = ? AND double = ? AND float = ? AND boolean = ? AND byte = ? AND char = ?""")
    assert(query.parameters == Seq(
      StringParam(string),
      ShortParam(short),
      IntParam(int),
      LongParam(long),
      DoubleParam(double),
      FloatParam(float),
      BooleanParam(boolean),
      ByteParam(byte),
      StringParam(char.toString),
    ))
  }

  "sql strings" should "interpolate StringFrag" in {
    val string = "TheWorstTable"
    val query = sql"""DROP TABLE $string"""

    assert(query.sql == "DROP TABLE ?")
    assert(query.parameters == Seq(StringParam("TheWorstTable")))
  }
}
