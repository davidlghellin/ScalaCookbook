package es.david.cap01

object String014 extends App
{
  /**
   * Sustitucion de variables como en otros lenguajes
   */
  
  val nombre = "David"
  val edad = 31
  val peso = 100.00
  
  
  println(nombre)
  println(edad)
  println(peso)
  
  // para poder usar las varibles podemos usar la estructura siguiente
  println(s"$nombre tiene $edad y un peso de $peso kg.")
  
  // para poder usar alguna expresion o realizar alguna operacion usaremos ${ }
  println(s"$nombre tendra ${edad +10} y un peso de ${peso - 10} kg.\n")
  
  // para poder acceder a los atrivtos de una calse
  val yo = new Estudiante("David", 7.8)
  println(s"El estudiante ${yo.nombre} tiene una nota de ${yo.nota}\n")
  
  // podemos usar como en C con el formateo de variables
  println(s"%s tendra %d y un peso de ${peso - 10} kg.\n".format(nombre, edad))
}
case class Estudiante(nombre: String , nota: Double)