package fish.eyebrow.squirrel

trait Mapper[T] {
  def map(obj: Object): T
}

object Mapper {
  implicit object StringMapper extends Mapper[String] {
    override def map(obj: Object): String = {
      obj.toString
    }
  }
}
