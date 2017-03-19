package es.david.cap03

object EstructurasControl13 {

  // uso de guardas en match
  5 match {
    case a if 1 to 10 contains a  => println("Esta entre 1 y 10")
    case b if 11 to 20 contains b => println("Esta entre 11 y 20")
    case _                        => println("mmmm...")
  }                                               //> Esta entre 1 y 10

  42 match {
    case x if x == 1           => println("Es 1")
    case x if x == 2 || x == 3 => println("Es 2 o 3")
    case _                     => println("mmmm...")
  }                                               //> mmmm...
}