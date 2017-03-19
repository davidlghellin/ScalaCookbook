package es.david.cap03

object EstructurasControl16 {

  // capturar una o mas excepciones
  val s = "Foo"                                   //> s  : String = Foo
  try {
    val i = s.toInt
  } catch {
    case e: Exception => e.printStackTrace
  }                                               //> java.lang.NumberFormatException: For input string: "Foo"
                                                  //| 	at java.lang.NumberFormatException.forInputString(NumberFormatException.
                                                  //| java:65)
                                                  //| 	at java.lang.Integer.parseInt(Integer.java:580)
                                                  //| 	at java.lang.Integer.parseInt(Integer.java:615)
                                                  //| 	at scala.collection.immutable.StringLike$class.toInt(StringLike.scala:27
                                                  //| 2)
                                                  //| 	at scala.collection.immutable.StringOps.toInt(StringOps.scala:29)
                                                  //| 	at es.david.cap03.EstructurasControl16$$anonfun$main$1.apply$mcV$sp(es.d
                                                  //| avid.cap03.EstructurasControl16.scala:8)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at es.david.cap03.EstructurasControl16$.main(es.david.cap03.EstructurasC
                                                  //| ontrol16.scala:3)
                                                  //| 	at es.david.cap
                                                  //| Output exceeds cutoff limit.

  try {
    val i = s.toInt
  } catch {
    case _: Throwable => println("exception ignored")
  }                                               //> exception ignored

  // nothing required here
  def toInt(s: String): Option[Int] = {
    try {
      Some(s.toInt)
    } catch {
      case e: Exception => throw e
    }
  }                                               //> toInt: (s: String)Option[Int]
}