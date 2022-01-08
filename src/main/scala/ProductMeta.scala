package fish.eyebrow.squirrel

sealed trait ProductMeta[P <: Product] {
  def ofObjects(objs: List[Object]): P
}

object ProductMeta {
  class Product1Meta[
    T1 : Mapper,
    P <: Product1[T1],
  ](apply: T1 => P) extends ProductMeta[P] {
    override def ofObjects(objs: List[Object]): P = {
      apply(
        implicitly[Mapper[T1]].map(objs.head),
      )
    }
  }

  class Product2Meta[
    T1 : Mapper,
    T2 : Mapper,
    P <: Product2[T1, T2],
  ](apply: (T1, T2) => P) extends ProductMeta[P] {
    override def ofObjects(objs: List[Object]): P = {
      apply(
        implicitly[Mapper[T1]].map(objs.head),
        implicitly[Mapper[T2]].map(objs(1)),
      )
    }
  }

  class Product3Meta[
    T1 : Mapper,
    T2 : Mapper,
    T3 : Mapper,
    P <: Product3[T1, T2, T3],
  ](apply: (T1, T2, T3) => P) extends ProductMeta[P] {
    override def ofObjects(objs: List[Object]): P = {
      apply(
        implicitly[Mapper[T1]].map(objs.head),
        implicitly[Mapper[T2]].map(objs(1)),
        implicitly[Mapper[T3]].map(objs(2)),
      )
    }
  }

  class Product4Meta[
    T1 : Mapper,
    T2 : Mapper,
    T3 : Mapper,
    T4 : Mapper,
    P <: Product4[T1, T2, T3, T4],
  ](apply: (T1, T2, T3, T4) => P) extends ProductMeta[P] {
    override def ofObjects(objs: List[Object]): P = {
      apply(
        implicitly[Mapper[T1]].map(objs.head),
        implicitly[Mapper[T2]].map(objs(1)),
        implicitly[Mapper[T3]].map(objs(2)),
        implicitly[Mapper[T4]].map(objs(3)),
      )
    }
  }
}
