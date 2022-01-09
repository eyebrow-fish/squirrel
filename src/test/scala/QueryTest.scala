package fish.eyebrow.squirrel

import ProductMeta.productMeta
import Sql.SqlInterpolator

import cats.effect.unsafe.implicits.global
import org.scalatest.BeforeAndAfterEach
import org.scalatest.flatspec.AnyFlatSpec
import org.sqlite.JDBC

import java.sql.DriverManager
import scala.concurrent.ExecutionContext

class QueryTest extends AnyFlatSpec with BeforeAndAfterEach {
  DriverManager.registerDriver(new JDBC)
  implicit val ctx: Ctx = Ctx()(
    DriverManager.getConnection("jdbc:sqlite:test.db", "test", "password"),
    ExecutionContext.global,
  )

  case class Person(id: Int, firstName: String, lastName: String)
  implicit val personMeta: ProductMeta[Person] = productMeta(Person)

  "query" should "allow flat case class results" in {
    sql"""insert into PersonTable(firstName, lastName) values("Alexander", "Johnston")""".update.unsafeRunSync()

    val result = sql"select * from PersonTable".query[Person].unsafeRunSync()

    assert(result.head == Person(1, "Alexander", "Johnston"))
  }

  it should "not be dependent on order" in {
    sql"""insert into PersonTable(firstName, lastName) values("Alexander", "Johnston")""".update.unsafeRunSync()

    val result = sql"select lastName, firstName, id from PersonTable".query[Person].unsafeRunSync()

    assert(result.head == Person(1, "Alexander", "Johnston"))
  }

  it should "return multiple results" in {
    sql"""insert into PersonTable(firstName, lastName) values
         ("Alexander", "Johnston"),
         ("Oliver", "Ruecker Johnston"),
         ("Larissa", "Ruecker")
         """.update.unsafeRunSync()

    val result = sql"select * from PersonTable".query[Person].unsafeRunSync()

    assert(result.head == Person(1, "Alexander", "Johnston"))
    assert(result(1) == Person(2, "Oliver", "Ruecker Johnston"))
    assert(result.last == Person(3, "Larissa", "Ruecker"))
  }

  override def beforeEach(): Unit = {
    sql"""create table if not exists PersonTable
         (
             id integer primary key autoincrement,
             firstName varchar(255),
             lastName varchar(255)
         )""".update.unsafeRunSync()
  }

  override def afterEach(): Unit = {
    sql"drop table if exists PersonTable".update.unsafeRunSync()
  }
}
