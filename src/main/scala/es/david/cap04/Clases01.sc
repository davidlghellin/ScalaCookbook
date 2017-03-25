package es.david.cap04

object Clases01 {

  // quieres crear una clase con un constructor rapidamente
  class Persona(var nombre: String, var apellidos: String) {
    println("Empieza el constructor")
    // algunos campos
    private val HOME = System.getProperty("user.home")
    var edad = 0;

    // algunos metodos
    override def toString = s"$nombre $apellidos tiene $edad años "
    def imprimirHome { println(s"HOME = $HOME") }
    def imprimirNombreCompleto { println(this) }
    imprimirHome
    imprimirNombreCompleto
    
    edad_$eq(1) //como Scala usa internamente un cambio de valor de una variable mutable, metodo mutador
    
    println("Todavia en el constructor")
  }

  val p = new Persona("David", "Lopez")           //> Empieza el constructor
                                                  //| HOME = /home/wizord
                                                  //| David Lopez tiene 0 años 
                                                  //| Todavia en el constructor
                                                  //| p  : es.david.cap04.Clases01.Persona = David Lopez tiene 1 años 
}