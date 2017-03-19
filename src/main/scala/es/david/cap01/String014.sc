package es.david.cap01

object String014
{
  /**
   * Sustitucion de variables como en otros lenguajes
   */
  
  val nombre = "David"                            //> nombre  : String = David
  val edad = 31                                   //> edad  : Int = 31
  val peso = 100.00                               //> peso  : Double = 100.0
  
  
  println(nombre)                                 //> David
  println(edad)                                   //> 31
  println(peso)                                   //> 100.0
  
  // para poder usar las varibles podemos usar la estructura siguiente
  println(s"$nombre tiene $edad y un peso de $peso kg.")
                                                  //> David tiene 31 y un peso de 100.0 kg.
  
  // para poder usar alguna expresion o realizar alguna operacion usaremos ${ }
  println(s"$nombre tendra ${edad +10} y un peso de ${peso - 10} kg.\n")
                                                  //> David tendra 41 y un peso de 90.0 kg.
                                                  //| 
  
  // para poder acceder a los atrivtos de una calse
  val yo = new Estudiante("David", 7.8)           //> yo  : es.david.cap01.Estudiante = Estudiante(David,7.8)
  println(s"El estudiante ${yo.nombre} tiene una nota de ${yo.nota}\n")
                                                  //> El estudiante David tiene una nota de 7.8
                                                  //| 
  
  // podemos usar como en C con el formateo de variables
  println(s"%s tendra %d y un peso de ${peso - 10} kg.\n".format(nombre, edad))
                                                  //> David tendra 31 y un peso de 90.0 kg.
                                                  //| 
  
  printf(s"%s tendra %d y un peso de ${peso - 10} kg.\n".format(nombre, edad))
                                                  //> David tendra 31 y un peso de 90.0 kg.
}
case class Estudiante(nombre: String , nota: Double)