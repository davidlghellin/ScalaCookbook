package es.david.cap04

object Clases11 {

  // queremos controlar el constructor del padre

  // (1) constructor principañ
  class Animal(var name: String, var age: Int) {

    // (2) constructor auxiliar
    def this(name: String) {
      this(name, 0)
    }
    override def toString = s"$name is $age years old"
  }
  // llamada a constructor de un argumento
  class Dog(name: String) extends Animal(name) {
    println("Llamando constructor DOG")
  }

  val p = new Dog("Koky")                         //> Llamando constructor DOG
                                                  //| p  : es.david.cap04.Clases11.Dog = Koky is 0 years old
  // call the two - arg constructor
  class Dog2(name: String) extends Animal(name, 33) {
    println("Dog constructor called")
  }
  val p2 = new Dog2("Koky2")                      //> Dog constructor called
                                                  //| p2  : es.david.cap04.Clases11.Dog2 = Koky2 is 33 years old
  //como podemos ver, en la clase hija tenemos que hacer referencia a un constructor del padre, para el construtor por defecto

  /////////////////////////////
  case class Address(city: String, state: String)
  case class Role(role: String)
  class Person(var name: String, var address: Address) {
    // No hay forma de que los constructores auxiliares de empleados llamen a este constructor
    def this(name: String) {
      this(name, null)
      address = null
    }
    override def toString = if (address == null) name else s"$name @ $address"
  }
  class Employee(name: String, role: Role, address: Address)
      extends Person(name, address) {
    def this(name: String) {
      this(name, null, null)
    }
    def this(name: String, role: Role) {
      this(name, role, null)
    }
    def this(name: String, address: Address) {
      this(name, null, address)
    }
  }
  /**
   * todas las clases hijjas llaman a un constructor
   */
}