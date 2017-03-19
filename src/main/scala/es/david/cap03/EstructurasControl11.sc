package es.david.cap03

object EstructurasControl11 {

  // imagina que queremos hacer un match con 2pattern matching"
  // con ello podemos identificar a todos los tipos de clases ....
  def tipoPatter(x: Any): String = x match {
    // constant patterns
    case 0                 => "zero"
    case true              => "true"
    case "hello"           => "you said 'hello'"
    case Nil               => "an empty List"
    // sequence patterns
    case List(0, _, _)     => "a three-element list with 0 as the first element"
    case List(1, _*)       => "a list beginning with 1, having any number of elements"
    case Vector(1, _*)     => "a vector starting with 1, having any number of elements"
    // tuples
    case (a, b)            => s"got $a and $b"
    case (a, b, c)         => s"got $a, $b, and $c"
    // typed patterns
    case s: String         => s"you gave me this string: $s"
    case i: Int            => s"thanks for the int: $i"
    case f: Float          => s"thanks for the float: $f"
    case a: Array[Int]     => s"an array of int: ${a.mkString(",")}"
    case as: Array[String] => s"an array of strings: ${as.mkString(",")}"
    case list: List[_]     => s"thanks for the List: $list"
    case m: Map[_, _]      => m.toString
    //...........................
    case _                 => "Unknown"
  }                                               //> tipoPatter: (x: Any)String

  case class Persona(nombre: String, edad: Int)

  def tipoPersona(p: Persona) = p match {
    case pe @ Persona(first, 22) => s"$pe"
    case _                       => s"$p"
  }                                               //> tipoPersona: (p: es.david.cap03.EstructurasControl11.Persona)String
  println(tipoPersona(new Persona("David", 22)))  //> Persona(David,22)
  println(tipoPersona(new Persona("David", 31)))  //> Persona(David,31)

  // usos de None & Some
  def toInt(s: String): Option[Int] = {
    try {
      Some(Integer.parseInt(s.trim))
    } catch {
      case e: Exception => None
    }
  }                                               //> toInt: (s: String)Option[Int]
  toInt("42") match {
    case Some(i) => println(i)
    case None    => println("No es un Int.")
  }                                               //> 42
  toInt("42.") match {
    case Some(i) => println(i)
    case None    => println("No es un Int.")
  }                                               //> No es un Int.
  // como hemos podido ver , lo que hacemos es encapsular la salida en el Option, si puede  devolvera un Some(NUMERO)
  // en caso de lanzar la excepcion devolvera un None, para que devuelva algo
  println(toInt("33f"))                           //> None

  val lista = List("Hola", null, " mundo", null)  //> lista  : List[String] = List(Hola, null, " mundo", null)
  lista.map(Option(_))                            //> res0: List[Option[String]] = List(Some(Hola), None, Some( mundo), None)
  lista.map(Option(_)).flatMap(x=>x)              //> res1: List[String] = List(Hola, " mundo")
}