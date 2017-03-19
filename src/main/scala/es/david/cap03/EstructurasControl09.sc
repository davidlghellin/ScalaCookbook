package es.david.cap03

object EstructurasControl09 {
  // quieres devolver un valor desde una expresion match y asignarlo a una variable o usar la expresion de match como cuerpo
  def esVerdad(x: Any) = x match {
    case 0 | "" => false
    case _      => true
  }                                               //> esVerdad: (x: Any)Boolean
	println(esVerdad(0))                      //> false
	println(esVerdad(4))                      //> true
	println(esVerdad("aa"))                   //> true
}