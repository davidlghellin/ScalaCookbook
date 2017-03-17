package es.david.cap01

object String012 extends App
{
  // vamos a crear cadenas con multilineas, estas tendran el mismo formato y separacion que escribas
  val foo = """Esto es una 
    cadena Multilinea
    en Scala"""
  print(foo)
  
  println()
  println()
  
  // ahora con el '|' y 'stripMargin' no habra el espacio de margen y todo estara en el mismo nivel
  val bar = """Esto es una 
        |multilinea a distinto nivel""".stripMargin
  print(bar)
  
  println()
  println()
  
  // ahora especificiremos el caracter para que trabaje igual que antes
  val bob = """Esto es una 
        #multilinea a distinto nivel""".stripMargin('#')
  print(bob)   
  
  println()
  println()
  
  // ahora reemplezaremos ademas el salto de linea por el espacio
  val alice = """Esto es una 
        #multilinea al mismo nivel""".stripMargin('#').replaceAll("\n", " ")
  print(alice)
}