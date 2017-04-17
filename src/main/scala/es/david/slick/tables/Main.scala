package es.david.slick.tables

import scala.concurrent._
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

import slick.driver.H2Driver.api._

object Main {
  
  /////////////
  //  tables
  /////////////
  case class Albun(
    artist: String,
    title: String,
    id: Long = 0L)
  class AlbunTable(tag: Tag) extends Table[Albun](tag, "albuns") {
    def artist = column[String]("artist")
    def title = column[String]("title")
    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)

    def * = (artist, title, id) <> (Albun.tupled, Albun.unapply)
  }
  lazy val AlbunTable = TableQuery[AlbunTable]

  /////////////
  //  actions
  /////////////

  val createTableAction = AlbunTable.schema.create

  val insertAlbunsAction =
    AlbunTable ++= Seq(
      Albun("artista 1", "song 1"),
      Albun("artista 2", "song 2"),
      Albun("artista 3", "song 3"))
      
  val selectAlbumsAction = AlbunTable.result
  
  /////////////
  //  Database
  /////////////
  
  //val db = Database.forConfig("scalaxdb")
  val db = Database.forConfig("mydb")
  
  /////////////
  //  go
  /////////////
  def exec[T](action:DBIO[T]):T= 
    Await.result(db.run(action),2 seconds)
    
  def main (args:Array[String]):Unit={
    exec(createTableAction)
    //exec(insertAlbunsAction)
    //exec(selectAlbumsAction).foreach(println)
  }
  
  
}