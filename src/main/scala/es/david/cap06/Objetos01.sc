package es.david.cap06

object Objetos01 {

  //queremos hacer un casting dinamicamente
  //algo de este estilo en JAva
  // Clase01 c = (Clase01) ctp.lookup("texto")
  // en Scala seria
  // val c = ctp.lookup("texto").asInstanceOf[Clase01]

  // lo que con Spring por ejemplo podria ser:
  // open/read the application context file
  //val ctx = new ClassPathXmlApplicationContext("applicationContext.xml")

  // instantiate our dog and cat objects from the application context
  //val dog = ctx.getBean("dog").asInstanceOf[Animal]
  //val cat = ctx.getBean("cat").asInstanceOf[Animal]

  val a = 10                                      //> a  : Int = 10
  val b = a.asInstanceOf[Long]                    //> b  : Long = 10
  val c = a.asInstanceOf[Byte]                    //> c  : Byte = 10
}