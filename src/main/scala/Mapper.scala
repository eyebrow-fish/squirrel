package fish.eyebrow.squirrel

trait Mapper[T] {
  def map(obj: Object): T
}

object Mapper {
  trait InstanceOfMapper[T] extends Mapper[T] {
    override def map(obj: Object): T = {
      obj.asInstanceOf[T]
    }
  }

  implicit object StringMapper extends InstanceOfMapper[String]
  implicit object IntMapper extends InstanceOfMapper[Int]
  implicit object LongMapper extends InstanceOfMapper[Long]
}
