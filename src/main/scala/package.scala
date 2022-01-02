package fish.eyebrow

package object squirrel extends FragConversions {
  private[squirrel] implicit class SeqEx[A](xs: Seq[A]) {
    def zipLeft[B](ys: Seq[B]): Seq[(A, Option[B])] = {
      xs zip ys.map(Some(_)).padTo(xs.size, None)
    }

    def zipRight[B](ys: Seq[B]): Seq[(Option[A], B)] = {
      xs.map(Some(_)).padTo(ys.size, None) zip ys
    }
  }

  private[squirrel] implicit class OptionEx[T](opt: Option[T]) {
    def ??(other: => T): T = opt.getOrElse(other)
  }
}
