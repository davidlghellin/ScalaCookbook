package es.david.cap01

object String013
{
  /**
   * Problema:
   * 	Ahora quieres dividir un String en varias partes, por un separador como por ejemplo en un csv
   */
  
  // la forma tipica es usar el split(" ") que nos devuelve los datos en forma de array
  val s = "Hola mundo"                            //> s  : String = Hola mundo
  s.split(" ").foreach(println)                   //> Hola
                                                  //| mundo
  
  s.split(" ").map(_ .toUpperCase()).foreach(println)
                                                  //> HOLA
                                                  //| MUNDO
  
  // podemos usar expresiones regulares para usar split
  
  // split esta sobrecargado y lo podemos usar con caracteres
  s.split(' ').foreach(println)                   //> Hola
                                                  //| mundo
}