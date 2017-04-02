package es.david.cap05

object Metodos08 {

  // vamos a decir que nuestro metodo puede lanzar excepciones
  // para ello usaremos la anotacion @throws(tipo[excepcion])
  // si usamos codigo Java podemos usar como en Java
  // pero tenemos que tener en cuenta la filosofia Scala, que no es necesario especificar si lanza la excepion
  def boom {
    throw new Exception
  }                                               //> boom: => Unit
  println("Before boom")                          //> Before boom
  boom                                            //> java.lang.Exception
                                                  //| 	at es.david.cap05.Metodos08$$anonfun$main$1.boom$1(es.david.cap05.Metodo
                                                  //| s08.scala:10)
                                                  //| 	at es.david.cap05.Metodos08$$anonfun$main$1.apply$mcV$sp(es.david.cap05.
                                                  //| Metodos08.scala:13)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at es.david.cap05.Metodos08$.main(es.david.cap05.Metodos08.scala:3)
                                                  //| 	at es.david.cap05.Metodos08.main(es.david.cap05.Metodos08.scala)
  // nunca llegaremos a la siguiente linea
  println("After boom")
}