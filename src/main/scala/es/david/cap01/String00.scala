package es.david.cap01

import scala.collection.immutable.StringOps

object String00 extends App 
{
  // asignacion de variable inmutable
  val s = "hola mundo"
  println(s)
  
  s.length()
  println(s.length())
  
  // concatenar Strings '+'
  val c = "Hola " + "concatenada"
  println(c)
  
  
  "Hola".foreach(println)
  
  // como tenemos muchos metodos disponibles para colecciones
  println("Hola mundo".filter(_ !='l'))
  
  println("scala".drop(2).take(2).capitalize)
}
