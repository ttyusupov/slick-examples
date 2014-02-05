package org.ty
// AUTO-GENERATED Slick data model
/** Stand-alone Slick data model for immediate use */
object Tables extends {
  val profile = scala.slick.driver.MySQLDriver
} with Tables

/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.) */
trait Tables {
  val profile: scala.slick.driver.JdbcProfile
  import profile.simple._
  import scala.slick.model.ForeignKeyAction
  import scala.slick.collection.heterogenous._
  import scala.slick.collection.heterogenous.syntax._
  import scala.slick.jdbc.{GetResult => GR}
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  
  /** Row type of table Test */
  type TestRow = HCons[Long,HCons[Long,HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[String,HCons[Int,HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Long],HCons[String,HCons[Option[Long],HCons[Option[Long],HCons[Option[Int],HCons[Option[Int],HCons[Option[String],HCons[Option[Boolean],HCons[Boolean,HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Boolean,HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Long],HCons[Option[String],HCons[Option[String],HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** GetResult implicit for fetching TestRow objects using plain SQL queries */
  implicit def GetResultTestRow(implicit e0: GR[Boolean], e1: GR[Long], e2: GR[Int], e3: GR[java.sql.Timestamp], e4: GR[String]): GR[TestRow] = GR{
    prs => import prs._
    <<[Long] :: <<[Long] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<[String] :: <<[Int] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Long] :: <<[String] :: <<?[Long] :: <<?[Long] :: <<?[Int] :: <<?[Int] :: <<?[String] :: <<?[Boolean] :: <<[Boolean] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<[Boolean] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Long] :: <<?[String] :: <<?[String] :: HNil
  }
  /** Table description of table test. Objects of this class serve as prototypes for rows in queries.
   *  NOTE: The following names collided with Scala keywords and were escaped: class */
  class Test(tag: Tag) extends Table[TestRow](tag, "test") {
    def * = column1 :: column2 :: column3 :: column4 :: column5 :: column6 :: column7 :: column8 :: column9 :: column10 :: column11 :: column12 :: column13 :: column14 :: column15 :: column16 :: column17 :: column18 :: column19 :: column20 :: column21 :: column22 :: column23 :: column24 :: column25 :: column26 :: column27 :: column28 :: column29 :: column30 :: column31 :: column32 :: column33 :: column34 :: column35 :: column36 :: column37 :: column38 :: column39 :: column40 :: column41 :: column42 :: column43 :: column44 :: column45 :: column46 :: column47 :: column48 :: column49 :: column50 :: column51 :: column52 :: column53 :: column54 :: column55 :: column56 :: column57 :: column58 :: column59 :: column60 :: column61 :: column62 :: column63 :: column64 :: column65 :: column66 :: column67 :: column68 :: column69 :: column70 :: column71 :: column72 :: column73 :: column74 :: column75 :: column76 :: column77 :: column78 :: column79 :: column80 :: column81 :: column82 :: column83 :: column84 :: column85 :: column86 :: column87 :: column88 :: column89 :: HNil
    
    val column1: Column[Long] = column[Long]("column1", O.AutoInc, O.PrimaryKey)
    val column2: Column[Long] = column[Long]("column2")
    val column3: Column[Option[String]] = column[Option[String]]("column3")
    val column4: Column[Option[String]] = column[Option[String]]("column4")
    val column5: Column[Option[String]] = column[Option[String]]("column5")
    val column6: Column[Option[String]] = column[Option[String]]("column6")
    val column7: Column[Option[String]] = column[Option[String]]("column7")
    val column8: Column[Option[String]] = column[Option[String]]("column8")
    val column9: Column[Option[String]] = column[Option[String]]("column9")
    val column10: Column[Option[String]] = column[Option[String]]("column10")
    val column11: Column[Option[String]] = column[Option[String]]("column11")
    val column12: Column[Option[String]] = column[Option[String]]("column12")
    val column13: Column[Option[String]] = column[Option[String]]("column13")
    val column14: Column[Option[String]] = column[Option[String]]("column14")
    val column15: Column[Option[String]] = column[Option[String]]("column15")
    val column16: Column[Option[String]] = column[Option[String]]("column16")
    val column17: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("column17")
    val column18: Column[Option[String]] = column[Option[String]]("column18")
    val column19: Column[Option[String]] = column[Option[String]]("column19")
    val column20: Column[Option[String]] = column[Option[String]]("column20")
    val column21: Column[Option[String]] = column[Option[String]]("column21")
    val column22: Column[Option[String]] = column[Option[String]]("column22")
    val column23: Column[Option[String]] = column[Option[String]]("column23")
    val column24: Column[Option[String]] = column[Option[String]]("column24")
    val column25: Column[Option[String]] = column[Option[String]]("column25")
    val column26: Column[Option[String]] = column[Option[String]]("column26")
    val column27: Column[Option[String]] = column[Option[String]]("column27")
    val column28: Column[Option[String]] = column[Option[String]]("column28")
    val column29: Column[Option[String]] = column[Option[String]]("column29")
    val column30: Column[Option[String]] = column[Option[String]]("column30")
    val column31: Column[Option[String]] = column[Option[String]]("column31")
    val column32: Column[Option[String]] = column[Option[String]]("column32")
    val column33: Column[String] = column[String]("column33")
    val column34: Column[Int] = column[Int]("column34")
    val column35: Column[Option[String]] = column[Option[String]]("column35")
    val column36: Column[Option[String]] = column[Option[String]]("column36")
    val column37: Column[Option[String]] = column[Option[String]]("column37")
    val column38: Column[Option[String]] = column[Option[String]]("column38")
    val column39: Column[Option[String]] = column[Option[String]]("column39")
    val column40: Column[Option[String]] = column[Option[String]]("column40")
    val column41: Column[Option[String]] = column[Option[String]]("column41")
    val column42: Column[Option[String]] = column[Option[String]]("column42")
    val column43: Column[Option[String]] = column[Option[String]]("column43")
    val column44: Column[Option[String]] = column[Option[String]]("column44")
    val column45: Column[Option[String]] = column[Option[String]]("column45")
    val column46: Column[Option[String]] = column[Option[String]]("column46")
    val column47: Column[Option[Long]] = column[Option[Long]]("column47")
    val column48: Column[String] = column[String]("column48")
    val column49: Column[Option[Long]] = column[Option[Long]]("column49")
    val column50: Column[Option[Long]] = column[Option[Long]]("column50")
    val column51: Column[Option[Int]] = column[Option[Int]]("column51")
    val column52: Column[Option[Int]] = column[Option[Int]]("column52")
    val column53: Column[Option[String]] = column[Option[String]]("column53")
    val column54: Column[Option[Boolean]] = column[Option[Boolean]]("column54")
    val column55: Column[Boolean] = column[Boolean]("column55")
    val column56: Column[Option[String]] = column[Option[String]]("column56")
    val column57: Column[Option[String]] = column[Option[String]]("column57")
    val column58: Column[Option[String]] = column[Option[String]]("column58")
    val column59: Column[Option[String]] = column[Option[String]]("column59")
    val column60: Column[Option[String]] = column[Option[String]]("column60")
    val column61: Column[Option[String]] = column[Option[String]]("column61")
    val column62: Column[Option[String]] = column[Option[String]]("column62")
    val column63: Column[Option[String]] = column[Option[String]]("column63")
    val column64: Column[Option[String]] = column[Option[String]]("column64")
    val column65: Column[Option[String]] = column[Option[String]]("column65")
    val column66: Column[Option[String]] = column[Option[String]]("column66")
    val column67: Column[Option[String]] = column[Option[String]]("column67")
    val column68: Column[Option[String]] = column[Option[String]]("column68")
    val column69: Column[Option[String]] = column[Option[String]]("column69")
    val column70: Column[Option[String]] = column[Option[String]]("column70")
    val column71: Column[Option[String]] = column[Option[String]]("column71")
    val column72: Column[Option[String]] = column[Option[String]]("column72")
    val column73: Column[Boolean] = column[Boolean]("column73")
    val column74: Column[Option[String]] = column[Option[String]]("column74")
    val column75: Column[Option[String]] = column[Option[String]]("column75")
    val column76: Column[Option[String]] = column[Option[String]]("column76")
    val column77: Column[Option[String]] = column[Option[String]]("column77")
    val column78: Column[Option[String]] = column[Option[String]]("column78")
    val column79: Column[Option[String]] = column[Option[String]]("column79")
    val column80: Column[Option[String]] = column[Option[String]]("column80")
    val column81: Column[Option[String]] = column[Option[String]]("column81")
    val column82: Column[Option[String]] = column[Option[String]]("column82")
    val column83: Column[Option[String]] = column[Option[String]]("column83")
    val column84: Column[Option[String]] = column[Option[String]]("column84")
    val column85: Column[Option[String]] = column[Option[String]]("column85")
    val column86: Column[Option[String]] = column[Option[String]]("column86")
    val column87: Column[Option[Long]] = column[Option[Long]]("column87")
    val column88: Column[Option[String]] = column[Option[String]]("column88")
    val column89: Column[Option[String]] = column[Option[String]]("column89")
    
    val TestFk = foreignKey("FK8510748BD7A111F5", column49 :: HNil, Test)(r => r.column1 :: HNil, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Test */
  lazy val Test = new TableQuery(tag => new Test(tag))

}