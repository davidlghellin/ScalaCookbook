package es.david.cap04

object Clases04 {

	// quieres que el constructor sea privado, como en eçun patron singleton
	// para marcar que el constructor sea privado lo marcaremos con private
	case class Persona private(nombre: String)
	
	// ERROR
	//val a = new Persona("aa")
	/*constructor Persona in class Persona cannot be accessed in object Clases04*/
	
	/*
	class Brain private
	{
      override def toString = "This is the brain."
  }

  object Brain
  {
      val brain = new Brain
      def getInstance = brain
  }
	*/
	//asi conseguiriamos tener el singleton, me da error
	
	//cuando usamos un object con el mismo nombre que la clase
	// tenemos una clase acompañante, tiene varios motivos uno es tener los metodos estaticos como los "static de java"
}