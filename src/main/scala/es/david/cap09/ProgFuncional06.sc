package es.david.cap09

object ProgFuncional06 {
  // Queremos eliminar variables de una funcion A pasando variables comunes a la funcion B,
  //y luego C utilizar la nueva funcion con las unicas variables que necesita
  val sum = (a: Int, b: Int, c: Int) => a + b + c //> sum  : (Int, Int, Int) => Int = <function3>
  
  val f = sum(1, 2, _: Int)                       //> f  : Int => Int = <function1>
  // Como no hemos pasado el tercer valor se queda como funcion1
  f(3)                                            //> res0: Int = 6
  sum(1, 2, 3)                                    //> res1: Int = 6
	
	// Cuando en los lenguajes de programacion funcional, pasas un subconjunto de parametros
	// la funcion como resultado es una funcion parcialmente aplicada
}