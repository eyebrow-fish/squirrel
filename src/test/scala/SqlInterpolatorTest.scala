package fish.eyebrow.squirrel

import Sql._

import org.scalatest.flatspec.AnyFlatSpec

class SqlInterpolatorTest extends AnyFlatSpec {
  implicit val ctx: Ctx = Ctx()(null, null)

  "sql strings" should "interpolate ToStringFrags" in {
    val short: Short = 255
    val int: Int = 888
    val long: Long = 9999
    val double: Double = 123.2
    val float: Float = 123.3F
    val boolean: Boolean = true
    val char: Char = 'a'
    val byte: Byte = 1
    val sqlStr =
      sql"""SELECT * FROM SomeTable
            WHERE short = $short
              AND int = $int
              AND long = $long
              AND double = $double
              AND float = $float
              AND boolean = $boolean
              AND char = $char
              AND byte = $byte""".raw.stripMargin

    assert(sqlStr ==
      """SELECT * FROM SomeTable
         WHERE short = 255
           AND int = 888
           AND long = 9999
           AND double = 123.2
           AND float = 123.3
           AND boolean = true
           AND char = 'a'
           AND byte = 1""".stripMargin)
  }

  "sql strings" should "interpolate StringFrag" in {
    val string = "TheWorstTable"
    val sqlStr = sql"""DROP TABLE $string""".raw

    assert(sqlStr == "DROP TABLE TheWorstTable")
  }
}
