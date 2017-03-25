package es.david.cap04

object Clases02 {

  // quieres controlar la visibilidad de los campos
  class Persona(var nombre: String)
  val p = new Persona("David")                    //> p  : es.david.cap04.Clases02.Persona = es.david.cap04.Clases02$Persona@78e03
                                                  //| bb5

  p.nombre                                        //> res0: String = David

  p.nombre = "DAVID"

  p.nombre                                        //> res1: String = DAVID

  class Persona2(val nombre: String)
  val p2 = new Persona2("David")                  //> p2  : es.david.cap04.Clases02.Persona2 = es.david.cap04.Clases02$$anonfun$ma
                                                  //| in$1$Persona2$1@34ce8af7
  p2.nombre                                       //> res2: String = David
  /*
  p2.nombre = "DAVID" //error -->assignment to val
  */

  class Persona3(nombre: String)
  val p3 = new Persona3("David")                  //> p3  : es.david.cap04.Clases02.Persona3 = es.david.cap04.Clases02$$anonfun$ma
                                                  //| in$1$Persona3$1@b684286
  /*
  p3.nombre	//value nombre is not a member of es.david.cap04.Clases02.Persona3
  */
  class Persona4(private var nombre: String) {
    def getNombre { println(nombre) }
  }
  val p4 = new Persona4("David")                  //> p4  : es.david.cap04.Clases02.Persona4 = es.david.cap04.Clases02$$anonfun$ma
                                                  //| in$1$Persona4$1@880ec60
  p4.getNombre                                    //> David
  /*
	p4.nombre	//variable nombre in class Persona4 cannot be accessed in es.david.cap04.Clases02.Persona4
	*/

  // como resumen
  /**
   *							Acceso	Mutable
	 *	var						si			si
   *	val						si			no
   *	no val/var		no			no
   *	private				no			no
   */
}