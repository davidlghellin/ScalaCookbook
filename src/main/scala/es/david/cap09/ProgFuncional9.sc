package es.david.cap09

object ProgFuncional9 {
  // Ejemplo Real
  // Entender los conceptos de la programacion funcional es una cosa y aplicarlos es otra

  // Para ello veremos el metodo de Newton para resolver las raices de las ecuaciones
  /**
   * A "driver" function to test Newton's method.
   * Start with (a) the desired f(x) and f'(x) equations,
   * (b) an initial guess and (c) tolerance values.
   */
  def driver {
    // the f(x) and f'(x) functions
    val fx = (x: Double) => 3 * x + math.sin(x) - math.pow(math.E, x)
    val fxPrime = (x: Double) => 3 + math.cos(x) - math.pow(Math.E, x)
    val initialGuess = 0.0
    val tolerance = 0.00005
    // pass f(x) and f'(x) to the Newton's Method function, along with
    // the initial guess and tolerance
    val answer = newtonsMethod(fx, fxPrime, initialGuess, tolerance)
    println(answer)
  }                                               //> driver: => Unit
  /**
   * Newton's Method for solving equations.
   * @todo check that |f(xNext)| is greater than a second tolerance value
   * @todo check that f'(x) != 0
   */
  def newtonsMethod(fx: Double => Double,
                    fxPrime: Double => Double,
                    x: Double,
                    tolerance: Double): Double = {
    var x1 = x
    var xNext = newtonsMethodHelper(fx, fxPrime, x1)
    while (math.abs(xNext - x1) > tolerance) {
      x1 = xNext
      println(xNext) // debugging (intermediate values)
      xNext = newtonsMethodHelper(fx, fxPrime, x1)
    }
    xNext
  }                                               //> newtonsMethod: (fx: Double => Double, fxPrime: Double => Double, x: Double,
                                                  //|  tolerance: Double)Double
  /**
   * This is the "x2 = x1 - f(x1)/f'(x1)" calculation
   */
  def newtonsMethodHelper(fx: Double => Double,
                          fxPrime: Double => Double,
                          x: Double): Double = {
    x - fx(x) / fxPrime(x)
  }                                               //> newtonsMethodHelper: (fx: Double => Double, fxPrime: Double => Double, x: D
                                                  //| ouble)Double
  driver                                          //> 0.3333333333333333
                                                  //| 0.3601707135776337
                                                  //| 0.36042168047601975
                                                  //| 0.3604217029603242
  ////////////////////
  def driver2 {
    // the f(x) and f'(x) functions
    val fx = (x: Double) => math.cos(x) - math.pow(x, 3)
    val fxPrima = (x: Double) => - math.sin(x) - 3 * math.pow(x, 2)
    val puntoInicial = 0.5
    val tolerance = 0.00005
    // pass f(x) and f'(x) to the Newton's Method function, along with
    // the initial guess and tolerance
    val answer = newtonsMethod(fx, fxPrima, puntoInicial, tolerance)
    println(answer)
  }                                               //> driver2: => Unit
  driver2                                         //> 1.1121416370972725
                                                  //| 0.9096726937368068
                                                  //| 0.8672638182088165
                                                  //| 0.8654771352982646
                                                  //| 0.8654740331109566

}