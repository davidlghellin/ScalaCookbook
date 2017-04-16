package es.david.cap09

object ProgFuncional03 {

  // Queremos un metodo que toma como parametros una funcion

  // Para ello tenemos 3 pasos
  // 1) Definir el metodo, con una signatura clara
  // 2) Definir una o mas funciones que coincidan
  // 3) Pasar esa funcion como parametro del metodo

  def ejecutarFuncion(callback: () => Unit) {
    callback()
  }                                               //> ejecutarFuncion: (callback: () => Unit)Unit

  val saludar = () => { println("Hola") }         //> saludar  : () => Unit = <function0>
  
  ejecutarFuncion(saludar)                        //> Hola
  
  // En este ejemplo hemos visto como definimos el metodo
  // Tenemos la funcion
  // Ejecutamos el metodo pasando como parametro la funcion

}