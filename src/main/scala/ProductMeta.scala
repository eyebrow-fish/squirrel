package fish.eyebrow.squirrel

sealed trait ProductMeta[P <: Product] {
  def ofObjects(m: Map[String, Object]): P
}

object ProductMeta {
  /* Overloaded simple constructors for ProductXMetas.
   *Just saves a bit of typing and not much else.
   */

  def productMeta[
    T1: Mapper,
    P <: Product,
  ](apply: T1 => P): ProductMeta[P] = new Product1Meta(apply)

  def productMeta[
    T1: Mapper,
    T2: Mapper,
    P <: Product,
  ](apply: (T1, T2) => P): ProductMeta[P] = new Product2Meta(apply)

  def productMeta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3) => P): ProductMeta[P] = new Product3Meta(apply)

  def productMeta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4) => P): ProductMeta[P] = new Product4Meta(apply)

  /* Actual definitions for ProductXMetas.
   * The backbone of query result mappings.
   */

  class Product1Meta[
    T1: Mapper,
    P <: Product,
  ](apply: T1 => P) extends ProductMeta[P] {
    override def ofObjects(m: Map[String, Object]): P = {
      apply(implicitly[Mapper[T1]].map(m.head))
    }
  }

  class Product2Meta[
    T1: Mapper,
    T2: Mapper,
    P <: Product,
  ](apply: (T1, T2) => P) extends ProductMeta[P] {
    override def ofObjects(m: Map[String, Object]): P = {
      val productNames = apply(
        null.asInstanceOf[T1],
        null.asInstanceOf[T2],
      ).productElementNames
      val values = productNames.map(m).toList

      apply(
        implicitly[Mapper[T1]].map(values.head),
        implicitly[Mapper[T2]].map(values(1)),
      )
    }
  }

  class Product3Meta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3) => P) extends ProductMeta[P] {
    override def ofObjects(m: Map[String, Object]): P = {
      val productNames = apply(
        null.asInstanceOf[T1],
        null.asInstanceOf[T2],
        null.asInstanceOf[T3],
      ).productElementNames
      val values = productNames.map(m).toList

      apply(
        implicitly[Mapper[T1]].map(values.head),
        implicitly[Mapper[T2]].map(values(1)),
        implicitly[Mapper[T3]].map(values(2)),
      )
    }
  }

  class Product4Meta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4) => P) extends ProductMeta[P] {
    override def ofObjects(m: Map[String, Object]): P = {
      val productNames = apply(
        null.asInstanceOf[T1],
        null.asInstanceOf[T2],
        null.asInstanceOf[T3],
        null.asInstanceOf[T4],
      ).productElementNames
      val values = productNames.map(m).toList

      apply(
        implicitly[Mapper[T1]].map(values.head),
        implicitly[Mapper[T2]].map(values(1)),
        implicitly[Mapper[T3]].map(values(2)),
        implicitly[Mapper[T4]].map(values(3)),
      )
    }
  }
}
