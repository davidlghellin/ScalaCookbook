package es.david.cap06

object Objetos07 {

  // quieres que las funciones, campos y demas esten disponibles a nivel de paquete o clases
  // para ello usaremos el package.scala en el paquete donde queramos tener acceso
  
  
  echo("Hello, world")                            //> Hello, world
  echo(MAGIC_NUM)                                 //> 42
  echo(Margin.LEFT)                               //> LEFT

  // use our MutableMap type (scala.collection.mutable.Map)
  val mm = MutableMap("name" -> "Al")             //> mm  : scala.collection.mutable.Map[String,String] = Map(name -> Al)
  mm += ("password" -> "123")                     //> res0: es.david.cap06.Objetos07.mm.type = Map(name -> Al, password -> 123)
  for ((k, v) <- mm) printf("key: %s, value: %s\n", k, v)
                                                  //> key: name, value: Al
                                                  //| key: password, value: 123
}