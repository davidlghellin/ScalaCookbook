package es.david.cap06

object Objetos06 {
  // queremos crear metodos estaticos como en Java, Scala no dispone de eso
  // para ello disponemos de "companion object"/ objeto complementario

  // Definimos la clase
  // Pizza class
  class Pizza(var crustType: String) {
    override def toString = "Crust type is " + crustType
  }

  // Definimos el objeto complementario en el mismo fichero
  // companion object
  object Pizza {
    val CRUST_TYPE_THIN = "thin"
    val CRUST_TYPE_THICK = "thick"
    def getFoo = "Foo"
  }
  // como podemos ver hemos definido metodos y variables static
  // las variables son lo mismo que public static final

  println(Pizza.CRUST_TYPE_THIN)                  //> thin
  println(Pizza.getFoo)                           //> Foo

  var p = new Pizza(Pizza.CRUST_TYPE_THICK)       //> p  : es.david.cap06.Objetos06.Pizza = Crust type is thick
  println(p)                                      //> Crust type is thick
}