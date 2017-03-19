package es.david.cap03

object EstructurasControl10 {
  // caso por defecto y evitar la excepcion MatchError
  // podemos usar cualquier nombre de variable o '_'
  2 match {
    case 0    => println("0")
    case 1    => println("1")
    case whoa => println("Valor por defecto: " + whoa)
  }                                               //> Valor por defecto: 2
  2 match {
    case 0 => println("0")
    case 1 => println("1")
    case _ => println("XXX ")
  }                                               //> XXX 
  
  
  // Error por no contemplar los demas casos
  2 match {
    case 0 => println("0")
    case 1 => println("1")
  }                                               //> scala.MatchError: 2 (of class java.lang.Integer)
                                                  //| 	at es.david.cap03.EstructurasControl10$$anonfun$main$1.apply$mcV$sp(es.d
                                                  //| avid.cap03.EstructurasControl10.scala:19)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at es.david.cap03.EstructurasControl10$.main(es.david.cap03.EstructurasC
                                                  //| ontrol10.scala:3)
                                                  //| 	at es.david.cap03.EstructurasControl10.main(es.david.cap03.EstructurasCo
                                                  //| ntrol10.scala)
}