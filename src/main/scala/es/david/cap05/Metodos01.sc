package es.david.cap05

object Metodos01 {

  // en Scala los metodos son publicos por defecto
  // tenemos 5 tipos para manejar el ambito y visbilidad
  
  
  // + restrictivo
  // Object-private scope
  // Private
  // Package
  // Package-specific
  // Public
  // + visible
  
  class FooObjectPrivate
  {
  	private[this] def isFoo = true
  	def doFoo(otro: FooObjectPrivate)
  	{
  		//if(otro.isFoo) //esto no compilara, ya que es muy restrictivo
  	}
  }
  
  // Private
  class FooPrivate
  {
  	private def isFoo = true
  	def doFoo(otro: FooPrivate)
  	{
  		if(otro.isFoo)
  			print("es foo")
  	}
  	// tenemos acceso por estar dentro de la misma clase
  }
  
  class AnimalPrivate {
    private def heartBeat {}
  }
  class DogPrivate extends AnimalPrivate {
    // heartBeat // no compila, no tiene viibilidad
  }
  
  // Protected
	// lo definido como Protected, solamente es accesible desde la clase que hereda, no desde el paquete
  class AnimalProtected
  {
    protected def heartBeat {}
  }
  class DogProtected extends AnimalProtected
  {
     heartBeat
  }
  
  //package
  // podemos hacer visibilidad para algun paquete especifico
  // doZ solo sera visible desde el cap05
  class FooPackage {
		private[es] def doX {}
		private[david] def doY {}
		private[cap05] def doZ {}
	}

	// public
	// si no tenemos modificador, sera publico
}