package es.david.cap04

object Clases10 {

  // queremos heredar de la clase base, y queremos usar los parametros de las dos clases
  // en la clase padre, declararemos los atributos como siempre "var" "val"
  // en la clase hija los atributos comunes no usaremos ninguno
  // los atributos propios con "var" "val"

  class Persona(var name: String, var address: Address) {
    override def toString = if (address == null) name else s"$name @ $address"
  }

	// heredamos de persona y nombre y direccion son las mismas, por ello no ponemos "var" "val"
  class Empleado(name: String, address: Address, var age: Int)
      extends Persona(name, address) {
    // rest of the class
  }

	val p = new Persona("David",new Address("Hellin","ES","xxx"))
                                                  //> p  : es.david.cap04.Clases10.Persona = David @ Address(Hellin,ES,xxx)
	val e = new Empleado("David",new Address("Hellin","ES","xxx"),31)
                                                  //> e  : es.david.cap04.Clases10.Empleado = David @ Address(Hellin,ES,xxx)
	
  case class Address(city: String, state: String, zip: String)
}