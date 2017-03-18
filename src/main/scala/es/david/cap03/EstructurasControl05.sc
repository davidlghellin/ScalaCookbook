package es.david.cap03
import util.control.Breaks._
object EstructurasControl05 {

  // necesitas usar las estructuras de control break/continue
  // break es llamada a una excepcion y saldria de bloque breakable
  /*for (i <- 1 to 10) {
    println(i)
    if (i > 4) break // break out of the for loop
  }*/
  println("\n=== BREAK EXAMPLE ===")              //> 
                                                  //| === BREAK EXAMPLE ===
  breakable {
    for (i <- 1 to 10) {
      println(i)
      if (i > 4) break // break out of the for loop
    }
  }                                               //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5

  for (i <- 1 to 10) {
    breakable {
      if (i % 2 == 0) break // break out of the for loop
      else
        println(i)
    }                                             //> 1
                                                  //| 3
                                                  //| 5
                                                  //| 7
                                                  //| 9
  }

  // para implementar el break y continue funcionalmente en scala
  /*
  To implement a break, this Scala:
	
	breakable {
		for (x <- xs) {
			if (cond)
				break
			}
		}
	corresponds to this Java:
	for (X x : xs) {
		if (cond) break;
	}
	To implement continue functionality, this Scala:
	for (x <- xs) {
		breakable {
		if (cond)
			break
		}
	}
	corresponds to this Java:
	for (X x : xs) {
		if (cond) continue;
	}
*/
}