package es.david.cap01

import scala.collection.immutable.StringOps

object String00
{
  // asignacion de variable inmutable
  val s = "hola mundo"                            //> s  : String = hola mundo
  println(s)                                      //> hola mundo
  
  s.length()                                      //> res0: Int = 10
  println(s.length())                             //> 10
  
  // concatenar Strings '+'
  val c = "Hola " + "concatenada"                 //> c  : String = Hola concatenada
  println(c)                                      //> Hola concatenada
  
  
  "Hola".foreach(println)                         //> H
                                                  //| o
                                                  //| l
                                                  //| a
  
  // como tenemos muchos metodos disponibles para colecciones
  println("Hola mundo".filter(_ !='l'))           //> Hoa mundo
  
  println("scala".drop(2).take(2).capitalize)     //> Al
}