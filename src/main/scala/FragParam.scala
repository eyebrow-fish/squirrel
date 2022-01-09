package fish.eyebrow.squirrel

import java.sql.PreparedStatement

trait FragParam[T] {
  def x: T
  def setT(stmt: PreparedStatement): Int => Unit
}

object FragParam {
  case class StringFrag(x: String) extends FragParam[String] {
    def setT(stmt: PreparedStatement): Int => Unit = i => stmt.setString(i, x)
  }

  case class ShortFrag(x: Short) extends FragParam[Short] {
    def setT(stmt: PreparedStatement): Int => Unit = i => stmt.setShort(i, x)
  }

  case class IntFrag(x: Int) extends FragParam[Int] {
    def setT(stmt: PreparedStatement): Int => Unit = i => stmt.setInt(i, x)
  }

  case class LongFrag(x: Long) extends FragParam[Long] {
    def setT(stmt: PreparedStatement): Int => Unit = i => stmt.setLong(i, x)
  }

  case class DoubleFrag(x: Double) extends FragParam[Double] {
    def setT(stmt: PreparedStatement): Int => Unit = i => stmt.setDouble(i, x)
  }

  case class FloatFrag(x: Float) extends FragParam[Float] {
    def setT(stmt: PreparedStatement): Int => Unit = i => stmt.setFloat(i, x)
  }

  case class BooleanFrag(x: Boolean) extends FragParam[Boolean] {
    def setT(stmt: PreparedStatement): Int => Unit = i => stmt.setBoolean(i, x)
  }

  case class ByteFrag(x: Byte) extends FragParam[Byte] {
    def setT(stmt: PreparedStatement): Int => Unit = i => stmt.setByte(i, x)
  }

  trait DelegateFragParam[I, O] extends FragParam[I] {
    def delegate: FragParam[O]

    def setT(stmt: PreparedStatement): Int => Unit = { i =>
      delegate.setT(stmt)(i)
    }
  }

  case class CharFrag(x: Char) extends DelegateFragParam[Char, String] {
    override def delegate: FragParam[String] = StringFrag(x.toString)
  }
}