package es.david.cap04

object Clases03 {

  // definicion de varios constructores
  // cada constructor auxiliar debe ser diferente en cuanto a parametros
  // constructor
  class Pizza(var tamanyo: Int, var tipo: String) {
    // para crear otros constructores usarmeos "this"(tipo de parametros)
    // la signatura debe de ser diferente

    // constructor auxiliar con un parametro
    def this(tamanyo: Int) {
      this(tamanyo, Pizza.DEFAULT_CRUST_TYPE)
    }

    // constructor auxiliar con un parametro
    def this(tipo: String) {
      this(Pizza.DEFAULT_CRUST_SIZE, tipo)
    }

    // constructor sin parametros
    def this() {
      this(Pizza.DEFAULT_CRUST_SIZE, Pizza.DEFAULT_CRUST_TYPE)
    }
    override def toString = s"A $tamanyo inch pizza with a $tipo crust"
  }

  val pizza = new Pizza()
  val pizza2 = new Pizza(15)
  val pizza3 = new Pizza("Crujiente")

  /***********************************************************************/
  // podemos definir la clase sin los parametros, pero impicaria mas codigo
  class PizzaSinParametros() {

    var crustSize = 0
    var crustType = ""

    def this(crustSize: Int) {
      this()
      this.crustSize = crustSize
    }
    def this(crustType: String) {
      this()
      this.crustType = crustType
    }
    //...............
  }
	//////////////////////////////////////////////
  // case class son clases especiales que genera Scala codigo por nosotros
  // si queremos tener otros constructores podemos hacerlo asi:
  case class Persona(val nombre: String, val edad: Int)
 	
 	object Persona {
    def apply() = new Persona("<por defecto>", 0)
    def apply(nombre: String) = new Persona(nombre, 0)
  }
  val c = Persona("David Lopez", 82)
 
 
}

object Pizza
{
  val DEFAULT_CRUST_SIZE = 12
  val DEFAULT_CRUST_TYPE = "FINA"
}