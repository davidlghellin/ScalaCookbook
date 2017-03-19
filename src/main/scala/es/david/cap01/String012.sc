package es.david.cap01

object String012
{
  // vamos a crear cadenas con multilineas, estas tendran el mismo formato y separacion que escribas
  val foo = """Esto es una
    cadena Multilinea
    en Scala"""                                   //> foo  : String = Esto es una
                                                  //|     cadena Multilinea
                                                  //|     en Scala
  print(foo)                                      //> Esto es una
                                                  //|     cadena Multilinea
                                                  //|     en Scala
  
  println()                                       //> 
  println()                                       //> 
  
  // ahora con el '|' y 'stripMargin' no habra el espacio de margen y todo estara en el mismo nivel
  val bar = """Esto es una
        |multilinea a distinto nivel""".stripMargin
                                                  //> bar  : String = Esto es una
                                                  //| multilinea a distinto nivel
  print(bar)                                      //> Esto es una
                                                  //| multilinea a distinto nivel
  
  println()                                       //> 
  println()                                       //> 
  
  // ahora especificiremos el caracter para que trabaje igual que antes
  val bob = """Esto es una
        #multilinea a distinto nivel""".stripMargin('#')
                                                  //> bob  : String = Esto es una
                                                  //| multilinea a distinto nivel
  print(bob)                                      //> Esto es una
                                                  //| multilinea a distinto nivel
  
  println()                                       //> 
  println()                                       //> 
  
  // ahora reemplezaremos ademas el salto de linea por el espacio
  val alice = """Esto es una
        #multilinea al mismo nivel""".stripMargin('#').replaceAll("\n", " ")
                                                  //> alice  : String = Esto es una multilinea al mismo nivel
  print(alice)
}