package es.david.cap01

object String01 extends App 
{
  // asignacion de variable inmutable
  val s = "hola mundo"
  println(s)
  
  s.length()
  println(s.length())
  
  // concatenar Strings '+'
  val c = "Hola " + "concatenada"
  println(c)
  
  
  s.foreach(println)
}
