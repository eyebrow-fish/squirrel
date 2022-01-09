package fish.eyebrow.squirrel

import java.sql.PreparedStatement

trait Param[T] {
  def addStatementParam(preparedStatement: PreparedStatement, index: Int): Unit
}
object Param {
  case class StringParam(str: String) extends Param[String] {
    override def addStatementParam(preparedStatement: PreparedStatement, index: Int): Unit = {
      preparedStatement.setString(index, str)
    }
  }

  case class ShortParam(str: Short) extends Param[Short] {
    override def addStatementParam(preparedStatement: PreparedStatement, index: Int): Unit = {
      preparedStatement.setShort(index, str)
    }
  }

  case class IntParam(int: Int) extends Param[Int] {
    override def addStatementParam(preparedStatement: PreparedStatement, index: Int): Unit = {
      preparedStatement.setInt(index, int)
    }
  }

  case class LongParam(long: Long) extends Param[Long] {
    override def addStatementParam(preparedStatement: PreparedStatement, index: Int): Unit = {
      preparedStatement.setLong(index, long)
    }
  }

  case class DoubleParam(double: Double) extends Param[Double] {
    override def addStatementParam(preparedStatement: PreparedStatement, index: Int): Unit = {
      preparedStatement.setDouble(index, double)
    }
  }

  case class FloatParam(float: Float) extends Param[Float] {
    override def addStatementParam(preparedStatement: PreparedStatement, index: Int): Unit = {
      preparedStatement.setFloat(index, float)
    }
  }

  case class BooleanParam(boolean: Boolean) extends Param[Boolean] {
    override def addStatementParam(preparedStatement: PreparedStatement, index: Int): Unit = {
      preparedStatement.setBoolean(index, boolean)
    }
  }

  case class ByteParam(byte: Byte) extends Param[Byte] {
    override def addStatementParam(preparedStatement: PreparedStatement, index: Int): Unit = {
      preparedStatement.setByte(index, byte)
    }
  }
}
