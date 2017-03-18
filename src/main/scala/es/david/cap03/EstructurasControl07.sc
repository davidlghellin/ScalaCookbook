package es.david.cap03

object EstructurasControl07 {
  //estructura como swich en java
  val i = 5                                       //> i  : Int = 5
  i match {
    case 1 => println("lunes")
    case 2 => println("martes")
    case 3 => println("miercoles")
    case 4 => println("jueves")
    case 5 => println("viernes")
  }                                               //> viernes
  val dia = i match {
    case 1 => "lunes"
    case 2 => "martes"
    case 3 => "miercoles"
    case 4 => "jueves"
    case 5 => "viernes"
    case 5 => "viernes"
    case 6 => "sabado"
    case 7 => "domingo"
    case _ => "día raro: "
  }                                               //> dia  : String = viernes

  for (e <- 1 to 7) e match {
    case 1   => println("lunes")
    case 2   => println("martes")
    case 3   => println("miercoles")
    case 4   => println("jueves")
    case 5   => println("viernes")
    case who => println("Caso no controlado: " + who.toString)
  }                                               //> lunes
                                                  //| martes
                                                  //| miercoles
                                                  //| jueves
                                                  //| viernes
                                                  //| Caso no controlado: 6
                                                  //| Caso no controlado: 7
  // cuando usemos el swich es mejor usar la anotacion
  val j = 1                                       //> j  : Int = 1
  val x = (j: @scala.annotation.switch) match {
    case 1 => "One"
    case 2 => "Two"
    case _ => "Other"
  }                                               //> x  : String = One

  // como podemos ver el match es mas poderoso que swich, ya que recibe cualquier objeto
  def getClassAsString(x: Any): String = x match {
    case s: String => s + " es un String"
    case i: Int    => "Int"
    case f: Float  => "Float"
    case _         => "Desconocido"
  }                                               //> getClassAsString: (x: Any)String
  println(getClassAsString(2))                    //> Int
  println(getClassAsString(2.0f))                 //> Float
  println(getClassAsString(2.0))                  //> Desconocido
  println(getClassAsString("hola"))               //> hola es un String
}