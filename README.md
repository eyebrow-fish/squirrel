# squirrel

**sq**uirre**l** is a simple SQL library for Scala written with the idea of being compatible with `cats`
based projects. All executions leverage the `IO` Monad.

# example usage

Some simple [Ctx](src/main/scala/Ctx.scala) setup:
```scala
DriverManager.registerDriver(new JDBC)
implicit val ctx: Ctx = Ctx()(
  DriverManager.getConnection("jdbc:sqlite:test.db", "test", "password"),
  ExecutionContext.global,
)
```
The following snippet is stolen from a [QueryTest](./src/test/scala/QueryTest.scala):
```scala
// Might be good to setup a case class and it's "Meta".
case class Person(id: Int, firstName: String, lastName: String)
implicit val personMeta: ProductMeta[Person] = productMeta(Person)

// The actual query being executed.
sql"""insert into PersonTable(firstName, lastName) values
     ("Alexander", "Johnston"),
     ("Oliver", "Ruecker Johnston"),
     ("Larissa", "Ruecker")
     """.update.unsafeRunSync()

// Our result and some assertions.
val result = sql"select * from PersonTable where id > 1".query[Person].unsafeRunSync()

assert(result.head == Person(2, "Oliver", "Ruecker Johnston"))
assert(result.last == Person(3, "Larissa", "Ruecker"))
```