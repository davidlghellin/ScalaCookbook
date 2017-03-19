package es.david.cap01

object String011
{
  // ahora vamos a comparar las cadenas de caracteres
  
  val s1 = "Hola"                                 //> s1  : String = Hola
  val s2 = "Hola"                                 //> s2  : String = Hola
  val s3 = "H" + "ola"                            //> s3  : String = Hola
  
  println(s1 == s2)                               //> true
  println(s1 == s3)                               //> true
  
  // ahora miraremos que podemos comparar con un valor nulos y no lanza NullPointerException
  val s4 = null                                   //> s4  : Null = null
  println(s1 == s4)                               //> false
  
  val s5 = "hola"                                 //> s5  : String = hola

  // si quieres comparar dos cadenas que no distinga mayuscaulas, puedes pasar todo a mayusculas
  println(s1 == s5)  //falso                      //> false
  println(s1.toUpperCase() == s5.toUpperCase())  //verdadero
                                                  //> true
  // tambien se puede comparar como en java
  println(s1.equalsIgnoreCase(s5))        //verdadero
                                                  //> true
  
  // definicion de String explicitamente
  val s6 : String = null                          //> s6  : String = null
}