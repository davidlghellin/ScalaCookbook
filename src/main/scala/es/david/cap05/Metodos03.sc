package es.david.cap05

object Metodos03 {

  // queremos establecer valores por defecto en la creacion de los metodos
  class Conexion {
    def establecerConexion(timeout: Int = 500, protocolo: String = "http") {
      println("timeout = %d, protocolo = %s".format(timeout, protocolo))
      //mas codigo
    }
  }

  val c = new Conexion                            //> c  : es.david.cap05.Metodos03.Conexion = es.david.cap05.Metodos03$Conexion@d
                                                  //| eb6432
  c.establecerConexion()                          //> timeout = 500, protocolo = http
  c.establecerConexion(2000)                      //> timeout = 2000, protocolo = http
  c.establecerConexion(3000, "https")             //> timeout = 3000, protocolo = https
  // podemos ver que el metodo sin parametros lleva parentesis, y que daria un error en caso de no ponerlos
	// podriamos especificar el tipo de parametro en el metodo

	c.establecerConexion(protocolo="https")   //> timeout = 500, protocolo = https

}