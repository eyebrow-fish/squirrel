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

  def productMeta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5) => P): ProductMeta[P] = new Product5Meta(apply)

  def productMeta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6) => P): ProductMeta[P] = new Product6Meta(apply)

  def productMeta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    T7: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6, T7) => P): ProductMeta[P] = new Product7Meta(apply)

  def productMeta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    T7: Mapper,
    T8: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6, T7, T8) => P): ProductMeta[P] = new Product8Meta(apply)

  def productMeta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    T7: Mapper,
    T8: Mapper,
    T9: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6, T7, T8, T9) => P): ProductMeta[P] = new Product9Meta(apply)

  def productMeta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    T7: Mapper,
    T8: Mapper,
    T9: Mapper,
    T10: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) => P): ProductMeta[P] = new Product10Meta(apply)

  def productMeta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    T7: Mapper,
    T8: Mapper,
    T9: Mapper,
    T10: Mapper,
    T11: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) => P): ProductMeta[P] = new Product11Meta(apply)

  def productMeta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    T7: Mapper,
    T8: Mapper,
    T9: Mapper,
    T10: Mapper,
    T11: Mapper,
    T12: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) => P): ProductMeta[P] = new Product12Meta(apply)

  def productMeta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    T7: Mapper,
    T8: Mapper,
    T9: Mapper,
    T10: Mapper,
    T11: Mapper,
    T12: Mapper,
    T13: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13) => P): ProductMeta[P] = new Product13Meta(apply)

  def productMeta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    T7: Mapper,
    T8: Mapper,
    T9: Mapper,
    T10: Mapper,
    T11: Mapper,
    T12: Mapper,
    T13: Mapper,
    T14: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14) => P): ProductMeta[P] = new Product14Meta(apply)

  def productMeta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    T7: Mapper,
    T8: Mapper,
    T9: Mapper,
    T10: Mapper,
    T11: Mapper,
    T12: Mapper,
    T13: Mapper,
    T14: Mapper,
    T15: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15) => P): ProductMeta[P] = new Product15Meta(apply)

  def productMeta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    T7: Mapper,
    T8: Mapper,
    T9: Mapper,
    T10: Mapper,
    T11: Mapper,
    T12: Mapper,
    T13: Mapper,
    T14: Mapper,
    T15: Mapper,
    T16: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16) => P): ProductMeta[P] = new Product16Meta(apply)

  def productMeta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    T7: Mapper,
    T8: Mapper,
    T9: Mapper,
    T10: Mapper,
    T11: Mapper,
    T12: Mapper,
    T13: Mapper,
    T14: Mapper,
    T15: Mapper,
    T16: Mapper,
    T17: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17) => P): ProductMeta[P] = new Product17Meta(apply)

  def productMeta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    T7: Mapper,
    T8: Mapper,
    T9: Mapper,
    T10: Mapper,
    T11: Mapper,
    T12: Mapper,
    T13: Mapper,
    T14: Mapper,
    T15: Mapper,
    T16: Mapper,
    T17: Mapper,
    T18: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18) => P): ProductMeta[P] = new Product18Meta(apply)

  def productMeta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    T7: Mapper,
    T8: Mapper,
    T9: Mapper,
    T10: Mapper,
    T11: Mapper,
    T12: Mapper,
    T13: Mapper,
    T14: Mapper,
    T15: Mapper,
    T16: Mapper,
    T17: Mapper,
    T18: Mapper,
    T19: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19) => P): ProductMeta[P] = new Product19Meta(apply)

  def productMeta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    T7: Mapper,
    T8: Mapper,
    T9: Mapper,
    T10: Mapper,
    T11: Mapper,
    T12: Mapper,
    T13: Mapper,
    T14: Mapper,
    T15: Mapper,
    T16: Mapper,
    T17: Mapper,
    T18: Mapper,
    T19: Mapper,
    T20: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20) => P): ProductMeta[P] = new Product20Meta(apply)

  def productMeta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    T7: Mapper,
    T8: Mapper,
    T9: Mapper,
    T10: Mapper,
    T11: Mapper,
    T12: Mapper,
    T13: Mapper,
    T14: Mapper,
    T15: Mapper,
    T16: Mapper,
    T17: Mapper,
    T18: Mapper,
    T19: Mapper,
    T20: Mapper,
    T21: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21) => P): ProductMeta[P] = new Product21Meta(apply)

  def productMeta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    T7: Mapper,
    T8: Mapper,
    T9: Mapper,
    T10: Mapper,
    T11: Mapper,
    T12: Mapper,
    T13: Mapper,
    T14: Mapper,
    T15: Mapper,
    T16: Mapper,
    T17: Mapper,
    T18: Mapper,
    T19: Mapper,
    T20: Mapper,
    T21: Mapper,
    T22: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22) => P): ProductMeta[P] = new Product22Meta(apply)

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

  class Product5Meta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5) => P) extends ProductMeta[P] {
    override def ofObjects(m: Map[String, Object]): P = {
      val productNames = apply(
        null.asInstanceOf[T1],
        null.asInstanceOf[T2],
        null.asInstanceOf[T3],
        null.asInstanceOf[T4],
        null.asInstanceOf[T5],
      ).productElementNames
      val values = productNames.map(m).toList

      apply(
        implicitly[Mapper[T1]].map(values.head),
        implicitly[Mapper[T2]].map(values(1)),
        implicitly[Mapper[T3]].map(values(2)),
        implicitly[Mapper[T4]].map(values(3)),
        implicitly[Mapper[T5]].map(values(4)),
      )
    }
  }

  class Product6Meta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6) => P) extends ProductMeta[P] {
    override def ofObjects(m: Map[String, Object]): P = {
      val productNames = apply(
        null.asInstanceOf[T1],
        null.asInstanceOf[T2],
        null.asInstanceOf[T3],
        null.asInstanceOf[T4],
        null.asInstanceOf[T5],
        null.asInstanceOf[T6],
      ).productElementNames
      val values = productNames.map(m).toList

      apply(
        implicitly[Mapper[T1]].map(values.head),
        implicitly[Mapper[T2]].map(values(1)),
        implicitly[Mapper[T3]].map(values(2)),
        implicitly[Mapper[T4]].map(values(3)),
        implicitly[Mapper[T5]].map(values(4)),
        implicitly[Mapper[T6]].map(values(5)),
      )
    }
  }

  class Product7Meta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    T7: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6, T7) => P) extends ProductMeta[P] {
    override def ofObjects(m: Map[String, Object]): P = {
      val productNames = apply(
        null.asInstanceOf[T1],
        null.asInstanceOf[T2],
        null.asInstanceOf[T3],
        null.asInstanceOf[T4],
        null.asInstanceOf[T5],
        null.asInstanceOf[T6],
        null.asInstanceOf[T7],
      ).productElementNames
      val values = productNames.map(m).toList

      apply(
        implicitly[Mapper[T1]].map(values.head),
        implicitly[Mapper[T2]].map(values(1)),
        implicitly[Mapper[T3]].map(values(2)),
        implicitly[Mapper[T4]].map(values(3)),
        implicitly[Mapper[T5]].map(values(4)),
        implicitly[Mapper[T6]].map(values(5)),
        implicitly[Mapper[T7]].map(values(6)),
      )
    }
  }

  class Product8Meta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    T7: Mapper,
    T8: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6, T7, T8) => P) extends ProductMeta[P] {
    override def ofObjects(m: Map[String, Object]): P = {
      val productNames = apply(
        null.asInstanceOf[T1],
        null.asInstanceOf[T2],
        null.asInstanceOf[T3],
        null.asInstanceOf[T4],
        null.asInstanceOf[T5],
        null.asInstanceOf[T6],
        null.asInstanceOf[T7],
        null.asInstanceOf[T8],
      ).productElementNames
      val values = productNames.map(m).toList

      apply(
        implicitly[Mapper[T1]].map(values.head),
        implicitly[Mapper[T2]].map(values(1)),
        implicitly[Mapper[T3]].map(values(2)),
        implicitly[Mapper[T4]].map(values(3)),
        implicitly[Mapper[T5]].map(values(4)),
        implicitly[Mapper[T6]].map(values(5)),
        implicitly[Mapper[T7]].map(values(6)),
        implicitly[Mapper[T8]].map(values(7)),
      )
    }
  }

  class Product9Meta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    T7: Mapper,
    T8: Mapper,
    T9: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6, T7, T8, T9) => P) extends ProductMeta[P] {
    override def ofObjects(m: Map[String, Object]): P = {
      val productNames = apply(
        null.asInstanceOf[T1],
        null.asInstanceOf[T2],
        null.asInstanceOf[T3],
        null.asInstanceOf[T4],
        null.asInstanceOf[T5],
        null.asInstanceOf[T6],
        null.asInstanceOf[T7],
        null.asInstanceOf[T8],
        null.asInstanceOf[T9],
      ).productElementNames
      val values = productNames.map(m).toList

      apply(
        implicitly[Mapper[T1]].map(values.head),
        implicitly[Mapper[T2]].map(values(1)),
        implicitly[Mapper[T3]].map(values(2)),
        implicitly[Mapper[T4]].map(values(3)),
        implicitly[Mapper[T5]].map(values(4)),
        implicitly[Mapper[T6]].map(values(5)),
        implicitly[Mapper[T7]].map(values(6)),
        implicitly[Mapper[T8]].map(values(7)),
        implicitly[Mapper[T9]].map(values(8)),
      )
    }
  }

  class Product10Meta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    T7: Mapper,
    T8: Mapper,
    T9: Mapper,
    T10: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) => P) extends ProductMeta[P] {
    override def ofObjects(m: Map[String, Object]): P = {
      val productNames = apply(
        null.asInstanceOf[T1],
        null.asInstanceOf[T2],
        null.asInstanceOf[T3],
        null.asInstanceOf[T4],
        null.asInstanceOf[T5],
        null.asInstanceOf[T6],
        null.asInstanceOf[T7],
        null.asInstanceOf[T8],
        null.asInstanceOf[T9],
        null.asInstanceOf[T10],
      ).productElementNames
      val values = productNames.map(m).toList

      apply(
        implicitly[Mapper[T1]].map(values.head),
        implicitly[Mapper[T2]].map(values(1)),
        implicitly[Mapper[T3]].map(values(2)),
        implicitly[Mapper[T4]].map(values(3)),
        implicitly[Mapper[T5]].map(values(4)),
        implicitly[Mapper[T6]].map(values(5)),
        implicitly[Mapper[T7]].map(values(6)),
        implicitly[Mapper[T8]].map(values(7)),
        implicitly[Mapper[T9]].map(values(8)),
        implicitly[Mapper[T10]].map(values(9)),
      )
    }
  }

  class Product11Meta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    T7: Mapper,
    T8: Mapper,
    T9: Mapper,
    T10: Mapper,
    T11: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) => P) extends ProductMeta[P] {
    override def ofObjects(m: Map[String, Object]): P = {
      val productNames = apply(
        null.asInstanceOf[T1],
        null.asInstanceOf[T2],
        null.asInstanceOf[T3],
        null.asInstanceOf[T4],
        null.asInstanceOf[T5],
        null.asInstanceOf[T6],
        null.asInstanceOf[T7],
        null.asInstanceOf[T8],
        null.asInstanceOf[T9],
        null.asInstanceOf[T10],
        null.asInstanceOf[T11],
      ).productElementNames
      val values = productNames.map(m).toList

      apply(
        implicitly[Mapper[T1]].map(values.head),
        implicitly[Mapper[T2]].map(values(1)),
        implicitly[Mapper[T3]].map(values(2)),
        implicitly[Mapper[T4]].map(values(3)),
        implicitly[Mapper[T5]].map(values(4)),
        implicitly[Mapper[T6]].map(values(5)),
        implicitly[Mapper[T7]].map(values(6)),
        implicitly[Mapper[T8]].map(values(7)),
        implicitly[Mapper[T9]].map(values(8)),
        implicitly[Mapper[T10]].map(values(9)),
        implicitly[Mapper[T11]].map(values(10)),
      )
    }
  }

  class Product12Meta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    T7: Mapper,
    T8: Mapper,
    T9: Mapper,
    T10: Mapper,
    T11: Mapper,
    T12: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) => P) extends ProductMeta[P] {
    override def ofObjects(m: Map[String, Object]): P = {
      val productNames = apply(
        null.asInstanceOf[T1],
        null.asInstanceOf[T2],
        null.asInstanceOf[T3],
        null.asInstanceOf[T4],
        null.asInstanceOf[T5],
        null.asInstanceOf[T6],
        null.asInstanceOf[T7],
        null.asInstanceOf[T8],
        null.asInstanceOf[T9],
        null.asInstanceOf[T10],
        null.asInstanceOf[T11],
        null.asInstanceOf[T12],
      ).productElementNames
      val values = productNames.map(m).toList

      apply(
        implicitly[Mapper[T1]].map(values.head),
        implicitly[Mapper[T2]].map(values(1)),
        implicitly[Mapper[T3]].map(values(2)),
        implicitly[Mapper[T4]].map(values(3)),
        implicitly[Mapper[T5]].map(values(4)),
        implicitly[Mapper[T6]].map(values(5)),
        implicitly[Mapper[T7]].map(values(6)),
        implicitly[Mapper[T8]].map(values(7)),
        implicitly[Mapper[T9]].map(values(8)),
        implicitly[Mapper[T10]].map(values(9)),
        implicitly[Mapper[T11]].map(values(10)),
        implicitly[Mapper[T12]].map(values(11)),
      )
    }
  }

  class Product13Meta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    T7: Mapper,
    T8: Mapper,
    T9: Mapper,
    T10: Mapper,
    T11: Mapper,
    T12: Mapper,
    T13: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13) => P) extends ProductMeta[P] {
    override def ofObjects(m: Map[String, Object]): P = {
      val productNames = apply(
        null.asInstanceOf[T1],
        null.asInstanceOf[T2],
        null.asInstanceOf[T3],
        null.asInstanceOf[T4],
        null.asInstanceOf[T5],
        null.asInstanceOf[T6],
        null.asInstanceOf[T7],
        null.asInstanceOf[T8],
        null.asInstanceOf[T9],
        null.asInstanceOf[T10],
        null.asInstanceOf[T11],
        null.asInstanceOf[T12],
        null.asInstanceOf[T13],
      ).productElementNames
      val values = productNames.map(m).toList

      apply(
        implicitly[Mapper[T1]].map(values.head),
        implicitly[Mapper[T2]].map(values(1)),
        implicitly[Mapper[T3]].map(values(2)),
        implicitly[Mapper[T4]].map(values(3)),
        implicitly[Mapper[T5]].map(values(4)),
        implicitly[Mapper[T6]].map(values(5)),
        implicitly[Mapper[T7]].map(values(6)),
        implicitly[Mapper[T8]].map(values(7)),
        implicitly[Mapper[T9]].map(values(8)),
        implicitly[Mapper[T10]].map(values(9)),
        implicitly[Mapper[T11]].map(values(10)),
        implicitly[Mapper[T12]].map(values(11)),
        implicitly[Mapper[T13]].map(values(12)),
      )
    }
  }

  class Product14Meta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    T7: Mapper,
    T8: Mapper,
    T9: Mapper,
    T10: Mapper,
    T11: Mapper,
    T12: Mapper,
    T13: Mapper,
    T14: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14) => P) extends ProductMeta[P] {
    override def ofObjects(m: Map[String, Object]): P = {
      val productNames = apply(
        null.asInstanceOf[T1],
        null.asInstanceOf[T2],
        null.asInstanceOf[T3],
        null.asInstanceOf[T4],
        null.asInstanceOf[T5],
        null.asInstanceOf[T6],
        null.asInstanceOf[T7],
        null.asInstanceOf[T8],
        null.asInstanceOf[T9],
        null.asInstanceOf[T10],
        null.asInstanceOf[T11],
        null.asInstanceOf[T12],
        null.asInstanceOf[T13],
        null.asInstanceOf[T14],
      ).productElementNames
      val values = productNames.map(m).toList

      apply(
        implicitly[Mapper[T1]].map(values.head),
        implicitly[Mapper[T2]].map(values(1)),
        implicitly[Mapper[T3]].map(values(2)),
        implicitly[Mapper[T4]].map(values(3)),
        implicitly[Mapper[T5]].map(values(4)),
        implicitly[Mapper[T6]].map(values(5)),
        implicitly[Mapper[T7]].map(values(6)),
        implicitly[Mapper[T8]].map(values(7)),
        implicitly[Mapper[T9]].map(values(8)),
        implicitly[Mapper[T10]].map(values(9)),
        implicitly[Mapper[T11]].map(values(10)),
        implicitly[Mapper[T12]].map(values(11)),
        implicitly[Mapper[T13]].map(values(12)),
        implicitly[Mapper[T14]].map(values(13)),
      )
    }
  }

  class Product15Meta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    T7: Mapper,
    T8: Mapper,
    T9: Mapper,
    T10: Mapper,
    T11: Mapper,
    T12: Mapper,
    T13: Mapper,
    T14: Mapper,
    T15: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15) => P) extends ProductMeta[P] {
    override def ofObjects(m: Map[String, Object]): P = {
      val productNames = apply(
        null.asInstanceOf[T1],
        null.asInstanceOf[T2],
        null.asInstanceOf[T3],
        null.asInstanceOf[T4],
        null.asInstanceOf[T5],
        null.asInstanceOf[T6],
        null.asInstanceOf[T7],
        null.asInstanceOf[T8],
        null.asInstanceOf[T9],
        null.asInstanceOf[T10],
        null.asInstanceOf[T11],
        null.asInstanceOf[T12],
        null.asInstanceOf[T13],
        null.asInstanceOf[T14],
        null.asInstanceOf[T15],
      ).productElementNames
      val values = productNames.map(m).toList

      apply(
        implicitly[Mapper[T1]].map(values.head),
        implicitly[Mapper[T2]].map(values(1)),
        implicitly[Mapper[T3]].map(values(2)),
        implicitly[Mapper[T4]].map(values(3)),
        implicitly[Mapper[T5]].map(values(4)),
        implicitly[Mapper[T6]].map(values(5)),
        implicitly[Mapper[T7]].map(values(6)),
        implicitly[Mapper[T8]].map(values(7)),
        implicitly[Mapper[T9]].map(values(8)),
        implicitly[Mapper[T10]].map(values(9)),
        implicitly[Mapper[T11]].map(values(10)),
        implicitly[Mapper[T12]].map(values(11)),
        implicitly[Mapper[T13]].map(values(12)),
        implicitly[Mapper[T14]].map(values(13)),
        implicitly[Mapper[T15]].map(values(14)),
      )
    }
  }

  class Product16Meta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    T7: Mapper,
    T8: Mapper,
    T9: Mapper,
    T10: Mapper,
    T11: Mapper,
    T12: Mapper,
    T13: Mapper,
    T14: Mapper,
    T15: Mapper,
    T16: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16) => P) extends ProductMeta[P] {
    override def ofObjects(m: Map[String, Object]): P = {
      val productNames = apply(
        null.asInstanceOf[T1],
        null.asInstanceOf[T2],
        null.asInstanceOf[T3],
        null.asInstanceOf[T4],
        null.asInstanceOf[T5],
        null.asInstanceOf[T6],
        null.asInstanceOf[T7],
        null.asInstanceOf[T8],
        null.asInstanceOf[T9],
        null.asInstanceOf[T10],
        null.asInstanceOf[T11],
        null.asInstanceOf[T12],
        null.asInstanceOf[T13],
        null.asInstanceOf[T14],
        null.asInstanceOf[T15],
        null.asInstanceOf[T16],
      ).productElementNames
      val values = productNames.map(m).toList

      apply(
        implicitly[Mapper[T1]].map(values.head),
        implicitly[Mapper[T2]].map(values(1)),
        implicitly[Mapper[T3]].map(values(2)),
        implicitly[Mapper[T4]].map(values(3)),
        implicitly[Mapper[T5]].map(values(4)),
        implicitly[Mapper[T6]].map(values(5)),
        implicitly[Mapper[T7]].map(values(6)),
        implicitly[Mapper[T8]].map(values(7)),
        implicitly[Mapper[T9]].map(values(8)),
        implicitly[Mapper[T10]].map(values(9)),
        implicitly[Mapper[T11]].map(values(10)),
        implicitly[Mapper[T12]].map(values(11)),
        implicitly[Mapper[T13]].map(values(12)),
        implicitly[Mapper[T14]].map(values(13)),
        implicitly[Mapper[T15]].map(values(14)),
        implicitly[Mapper[T16]].map(values(15)),
      )
    }
  }

  class Product17Meta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    T7: Mapper,
    T8: Mapper,
    T9: Mapper,
    T10: Mapper,
    T11: Mapper,
    T12: Mapper,
    T13: Mapper,
    T14: Mapper,
    T15: Mapper,
    T16: Mapper,
    T17: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17) => P) extends ProductMeta[P] {
    override def ofObjects(m: Map[String, Object]): P = {
      val productNames = apply(
        null.asInstanceOf[T1],
        null.asInstanceOf[T2],
        null.asInstanceOf[T3],
        null.asInstanceOf[T4],
        null.asInstanceOf[T5],
        null.asInstanceOf[T6],
        null.asInstanceOf[T7],
        null.asInstanceOf[T8],
        null.asInstanceOf[T9],
        null.asInstanceOf[T10],
        null.asInstanceOf[T11],
        null.asInstanceOf[T12],
        null.asInstanceOf[T13],
        null.asInstanceOf[T14],
        null.asInstanceOf[T15],
        null.asInstanceOf[T16],
        null.asInstanceOf[T17],
      ).productElementNames
      val values = productNames.map(m).toList

      apply(
        implicitly[Mapper[T1]].map(values.head),
        implicitly[Mapper[T2]].map(values(1)),
        implicitly[Mapper[T3]].map(values(2)),
        implicitly[Mapper[T4]].map(values(3)),
        implicitly[Mapper[T5]].map(values(4)),
        implicitly[Mapper[T6]].map(values(5)),
        implicitly[Mapper[T7]].map(values(6)),
        implicitly[Mapper[T8]].map(values(7)),
        implicitly[Mapper[T9]].map(values(8)),
        implicitly[Mapper[T10]].map(values(9)),
        implicitly[Mapper[T11]].map(values(10)),
        implicitly[Mapper[T12]].map(values(11)),
        implicitly[Mapper[T13]].map(values(12)),
        implicitly[Mapper[T14]].map(values(13)),
        implicitly[Mapper[T15]].map(values(14)),
        implicitly[Mapper[T16]].map(values(15)),
        implicitly[Mapper[T17]].map(values(16)),
      )
    }
  }

  class Product18Meta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    T7: Mapper,
    T8: Mapper,
    T9: Mapper,
    T10: Mapper,
    T11: Mapper,
    T12: Mapper,
    T13: Mapper,
    T14: Mapper,
    T15: Mapper,
    T16: Mapper,
    T17: Mapper,
    T18: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18) => P) extends ProductMeta[P] {
    override def ofObjects(m: Map[String, Object]): P = {
      val productNames = apply(
        null.asInstanceOf[T1],
        null.asInstanceOf[T2],
        null.asInstanceOf[T3],
        null.asInstanceOf[T4],
        null.asInstanceOf[T5],
        null.asInstanceOf[T6],
        null.asInstanceOf[T7],
        null.asInstanceOf[T8],
        null.asInstanceOf[T9],
        null.asInstanceOf[T10],
        null.asInstanceOf[T11],
        null.asInstanceOf[T12],
        null.asInstanceOf[T13],
        null.asInstanceOf[T14],
        null.asInstanceOf[T15],
        null.asInstanceOf[T16],
        null.asInstanceOf[T17],
        null.asInstanceOf[T18],
      ).productElementNames
      val values = productNames.map(m).toList

      apply(
        implicitly[Mapper[T1]].map(values.head),
        implicitly[Mapper[T2]].map(values(1)),
        implicitly[Mapper[T3]].map(values(2)),
        implicitly[Mapper[T4]].map(values(3)),
        implicitly[Mapper[T5]].map(values(4)),
        implicitly[Mapper[T6]].map(values(5)),
        implicitly[Mapper[T7]].map(values(6)),
        implicitly[Mapper[T8]].map(values(7)),
        implicitly[Mapper[T9]].map(values(8)),
        implicitly[Mapper[T10]].map(values(9)),
        implicitly[Mapper[T11]].map(values(10)),
        implicitly[Mapper[T12]].map(values(11)),
        implicitly[Mapper[T13]].map(values(12)),
        implicitly[Mapper[T14]].map(values(13)),
        implicitly[Mapper[T15]].map(values(14)),
        implicitly[Mapper[T16]].map(values(15)),
        implicitly[Mapper[T17]].map(values(16)),
        implicitly[Mapper[T18]].map(values(17)),
      )
    }
  }

  class Product19Meta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    T7: Mapper,
    T8: Mapper,
    T9: Mapper,
    T10: Mapper,
    T11: Mapper,
    T12: Mapper,
    T13: Mapper,
    T14: Mapper,
    T15: Mapper,
    T16: Mapper,
    T17: Mapper,
    T18: Mapper,
    T19: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19) => P) extends ProductMeta[P] {
    override def ofObjects(m: Map[String, Object]): P = {
      val productNames = apply(
        null.asInstanceOf[T1],
        null.asInstanceOf[T2],
        null.asInstanceOf[T3],
        null.asInstanceOf[T4],
        null.asInstanceOf[T5],
        null.asInstanceOf[T6],
        null.asInstanceOf[T7],
        null.asInstanceOf[T8],
        null.asInstanceOf[T9],
        null.asInstanceOf[T10],
        null.asInstanceOf[T11],
        null.asInstanceOf[T12],
        null.asInstanceOf[T13],
        null.asInstanceOf[T14],
        null.asInstanceOf[T15],
        null.asInstanceOf[T16],
        null.asInstanceOf[T17],
        null.asInstanceOf[T18],
        null.asInstanceOf[T19],
      ).productElementNames
      val values = productNames.map(m).toList

      apply(
        implicitly[Mapper[T1]].map(values.head),
        implicitly[Mapper[T2]].map(values(1)),
        implicitly[Mapper[T3]].map(values(2)),
        implicitly[Mapper[T4]].map(values(3)),
        implicitly[Mapper[T5]].map(values(4)),
        implicitly[Mapper[T6]].map(values(5)),
        implicitly[Mapper[T7]].map(values(6)),
        implicitly[Mapper[T8]].map(values(7)),
        implicitly[Mapper[T9]].map(values(8)),
        implicitly[Mapper[T10]].map(values(9)),
        implicitly[Mapper[T11]].map(values(10)),
        implicitly[Mapper[T12]].map(values(11)),
        implicitly[Mapper[T13]].map(values(12)),
        implicitly[Mapper[T14]].map(values(13)),
        implicitly[Mapper[T15]].map(values(14)),
        implicitly[Mapper[T16]].map(values(15)),
        implicitly[Mapper[T17]].map(values(16)),
        implicitly[Mapper[T18]].map(values(17)),
        implicitly[Mapper[T19]].map(values(18)),
      )
    }
  }

  class Product20Meta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    T7: Mapper,
    T8: Mapper,
    T9: Mapper,
    T10: Mapper,
    T11: Mapper,
    T12: Mapper,
    T13: Mapper,
    T14: Mapper,
    T15: Mapper,
    T16: Mapper,
    T17: Mapper,
    T18: Mapper,
    T19: Mapper,
    T20: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20) => P) extends ProductMeta[P] {
    override def ofObjects(m: Map[String, Object]): P = {
      val productNames = apply(
        null.asInstanceOf[T1],
        null.asInstanceOf[T2],
        null.asInstanceOf[T3],
        null.asInstanceOf[T4],
        null.asInstanceOf[T5],
        null.asInstanceOf[T6],
        null.asInstanceOf[T7],
        null.asInstanceOf[T8],
        null.asInstanceOf[T9],
        null.asInstanceOf[T10],
        null.asInstanceOf[T11],
        null.asInstanceOf[T12],
        null.asInstanceOf[T13],
        null.asInstanceOf[T14],
        null.asInstanceOf[T15],
        null.asInstanceOf[T16],
        null.asInstanceOf[T17],
        null.asInstanceOf[T18],
        null.asInstanceOf[T19],
        null.asInstanceOf[T20],
      ).productElementNames
      val values = productNames.map(m).toList

      apply(
        implicitly[Mapper[T1]].map(values.head),
        implicitly[Mapper[T2]].map(values(1)),
        implicitly[Mapper[T3]].map(values(2)),
        implicitly[Mapper[T4]].map(values(3)),
        implicitly[Mapper[T5]].map(values(4)),
        implicitly[Mapper[T6]].map(values(5)),
        implicitly[Mapper[T7]].map(values(6)),
        implicitly[Mapper[T8]].map(values(7)),
        implicitly[Mapper[T9]].map(values(8)),
        implicitly[Mapper[T10]].map(values(9)),
        implicitly[Mapper[T11]].map(values(10)),
        implicitly[Mapper[T12]].map(values(11)),
        implicitly[Mapper[T13]].map(values(12)),
        implicitly[Mapper[T14]].map(values(13)),
        implicitly[Mapper[T15]].map(values(14)),
        implicitly[Mapper[T16]].map(values(15)),
        implicitly[Mapper[T17]].map(values(16)),
        implicitly[Mapper[T18]].map(values(17)),
        implicitly[Mapper[T19]].map(values(18)),
        implicitly[Mapper[T20]].map(values(19)),
      )
    }
  }

  class Product21Meta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    T7: Mapper,
    T8: Mapper,
    T9: Mapper,
    T10: Mapper,
    T11: Mapper,
    T12: Mapper,
    T13: Mapper,
    T14: Mapper,
    T15: Mapper,
    T16: Mapper,
    T17: Mapper,
    T18: Mapper,
    T19: Mapper,
    T20: Mapper,
    T21: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21) => P) extends ProductMeta[P] {
    override def ofObjects(m: Map[String, Object]): P = {
      val productNames = apply(
        null.asInstanceOf[T1],
        null.asInstanceOf[T2],
        null.asInstanceOf[T3],
        null.asInstanceOf[T4],
        null.asInstanceOf[T5],
        null.asInstanceOf[T6],
        null.asInstanceOf[T7],
        null.asInstanceOf[T8],
        null.asInstanceOf[T9],
        null.asInstanceOf[T10],
        null.asInstanceOf[T11],
        null.asInstanceOf[T12],
        null.asInstanceOf[T13],
        null.asInstanceOf[T14],
        null.asInstanceOf[T15],
        null.asInstanceOf[T16],
        null.asInstanceOf[T17],
        null.asInstanceOf[T18],
        null.asInstanceOf[T19],
        null.asInstanceOf[T20],
        null.asInstanceOf[T21],
      ).productElementNames
      val values = productNames.map(m).toList

      apply(
        implicitly[Mapper[T1]].map(values.head),
        implicitly[Mapper[T2]].map(values(1)),
        implicitly[Mapper[T3]].map(values(2)),
        implicitly[Mapper[T4]].map(values(3)),
        implicitly[Mapper[T5]].map(values(4)),
        implicitly[Mapper[T6]].map(values(5)),
        implicitly[Mapper[T7]].map(values(6)),
        implicitly[Mapper[T8]].map(values(7)),
        implicitly[Mapper[T9]].map(values(8)),
        implicitly[Mapper[T10]].map(values(9)),
        implicitly[Mapper[T11]].map(values(10)),
        implicitly[Mapper[T12]].map(values(11)),
        implicitly[Mapper[T13]].map(values(12)),
        implicitly[Mapper[T14]].map(values(13)),
        implicitly[Mapper[T15]].map(values(14)),
        implicitly[Mapper[T16]].map(values(15)),
        implicitly[Mapper[T17]].map(values(16)),
        implicitly[Mapper[T18]].map(values(17)),
        implicitly[Mapper[T19]].map(values(18)),
        implicitly[Mapper[T20]].map(values(19)),
        implicitly[Mapper[T21]].map(values(20)),
      )
    }
  }

  class Product22Meta[
    T1: Mapper,
    T2: Mapper,
    T3: Mapper,
    T4: Mapper,
    T5: Mapper,
    T6: Mapper,
    T7: Mapper,
    T8: Mapper,
    T9: Mapper,
    T10: Mapper,
    T11: Mapper,
    T12: Mapper,
    T13: Mapper,
    T14: Mapper,
    T15: Mapper,
    T16: Mapper,
    T17: Mapper,
    T18: Mapper,
    T19: Mapper,
    T20: Mapper,
    T21: Mapper,
    T22: Mapper,
    P <: Product,
  ](apply: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22) => P) extends ProductMeta[P] {
    override def ofObjects(m: Map[String, Object]): P = {
      val productNames = apply(
        null.asInstanceOf[T1],
        null.asInstanceOf[T2],
        null.asInstanceOf[T3],
        null.asInstanceOf[T4],
        null.asInstanceOf[T5],
        null.asInstanceOf[T6],
        null.asInstanceOf[T7],
        null.asInstanceOf[T8],
        null.asInstanceOf[T9],
        null.asInstanceOf[T10],
        null.asInstanceOf[T11],
        null.asInstanceOf[T12],
        null.asInstanceOf[T13],
        null.asInstanceOf[T14],
        null.asInstanceOf[T15],
        null.asInstanceOf[T16],
        null.asInstanceOf[T17],
        null.asInstanceOf[T18],
        null.asInstanceOf[T19],
        null.asInstanceOf[T20],
        null.asInstanceOf[T21],
        null.asInstanceOf[T22],
      ).productElementNames
      val values = productNames.map(m).toList

      apply(
        implicitly[Mapper[T1]].map(values.head),
        implicitly[Mapper[T2]].map(values(1)),
        implicitly[Mapper[T3]].map(values(2)),
        implicitly[Mapper[T4]].map(values(3)),
        implicitly[Mapper[T5]].map(values(4)),
        implicitly[Mapper[T6]].map(values(5)),
        implicitly[Mapper[T7]].map(values(6)),
        implicitly[Mapper[T8]].map(values(7)),
        implicitly[Mapper[T9]].map(values(8)),
        implicitly[Mapper[T10]].map(values(9)),
        implicitly[Mapper[T11]].map(values(10)),
        implicitly[Mapper[T12]].map(values(11)),
        implicitly[Mapper[T13]].map(values(12)),
        implicitly[Mapper[T14]].map(values(13)),
        implicitly[Mapper[T15]].map(values(14)),
        implicitly[Mapper[T16]].map(values(15)),
        implicitly[Mapper[T17]].map(values(16)),
        implicitly[Mapper[T18]].map(values(17)),
        implicitly[Mapper[T19]].map(values(18)),
        implicitly[Mapper[T20]].map(values(19)),
        implicitly[Mapper[T21]].map(values(20)),
        implicitly[Mapper[T22]].map(values(21)),
      )
    }
  }
}
