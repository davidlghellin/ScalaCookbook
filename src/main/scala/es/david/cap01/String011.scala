package es.david.cap01

object String011 extends App
{
  // ahora vamos a comparar las cadenas de caracteres
  
  val s1 = "Hola"
  val s2 = "Hola"
  val s3 = "H" + "ola"
  
  println(s1 == s2)
  println(s1 == s3)
  
  // ahora miraremos que podemos comparar con un valor nulos y no lanza NullPointerException
  val s4 = null
  println(s1 == s4)  
  
  val s5 = "hola"

  // si quieres comparar dos cadenas que no distinga mayuscaulas, puedes pasar todo a mayusculas 
  println(s1 == s5)  //falso
  println(s1.toUpperCase() == s5.toUpperCase())  //verdadero
  // tambien se puede comparar como en java
  println(s1.equalsIgnoreCase(s5))        //verdadero
  
  // definicion de String explicitamente
  val s6 : String = null
}