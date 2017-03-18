package es.david.cap03

object EstructurasControl02 {
  //si queremos tener por ejemplo un una matriz donde tenermos dos bucles
  for (i <- 1 to 2; j <- 1 to 2) println(s"$i $j")//> 1 1
                                                  //| 1 2
                                                  //| 2 1
                                                  //| 2 2
  // esta es la forma mas pareceda, tenemos que imaginar que se duplica el bucle
  for {
    i <- 1 to 2
    j <- 1 to 2
  } println(s"$i $j")                             //> 1 1
                                                  //| 1 2
                                                  //| 2 1
                                                  //| 2 2
  // crearemos un array para iterar en el
  val array = Array.ofDim[Int](2, 2)              //> array  : Array[Array[Int]] = Array(Array(0, 0), Array(0, 0))
  array(0)(0) = 0
  array(0)(1) = 1
  array(1)(0) = 2
  array(1)(1) = 3
  for {
    i <- 0 to array.length - 1
    j <- 0 to array(0).length - 1
  } println(s"($i)($j)= ${array(i)(j)}")          //> (0)(0)= 0
                                                  //| (0)(1)= 1
                                                  //| (1)(0)= 2
                                                  //| (1)(1)= 3
}