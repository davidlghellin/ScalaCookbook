package es.david.cap03

object EstructurasControl14 {

	//
	println(1.isInstanceOf[Int])              //> true
	
	val p = new Persona("David")              //> p  : es.david.cap03.Persona = Persona(David)
	println(p.isInstanceOf[Persona])          //> true
}

case class Persona(nombre: String)