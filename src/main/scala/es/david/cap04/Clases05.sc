package es.david.cap04

object Clases05 {
  // queremos dar valor a las variaboles por defecto en el constructor

  class Socket(val timeout: Int = 1000)
  val s1 = new Socket                             //> s1  : es.david.cap04.Clases05.Socket = es.david.cap04.Clases05$Socket@78e03b
                                                  //| b5
  println(s1.timeout)                             //> 1000

  val s2 = new Socket(timeout = 2)                //> s2  : es.david.cap04.Clases05.Socket = es.david.cap04.Clases05$Socket@5594a1
                                                  //| b5
  println(s2.timeout)                             //> 2


	//ALTERNATIVA
	// crear un constructor con 0 y otro con 1 argumento (en este caso, claro)
	class SocketAlternatica(val timeout: Int)
	{
		def this() = this(1000)
		override def toString = s"timeout: $timeout"
	}
	
	val sA1 = new SocketAlternatica           //> sA1  : es.david.cap04.Clases05.SocketAlternatica = timeout: 1000
  println(sA1)                                    //> timeout: 1000

  val sA2 = new SocketAlternatica(timeout = 2)    //> sA2  : es.david.cap04.Clases05.SocketAlternatica = timeout: 2
  println(sA2)                                    //> timeout: 2
  
  // multiples parametros
  // podemos tener varios parametros en los constructores, si no uqeremos poner el mismo orden , especificaremos el tipo de parametro con el nombre y el valor
  
}