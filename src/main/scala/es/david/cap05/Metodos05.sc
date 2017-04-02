package es.david.cap05

object Metodos05 {

  // queremos que nuestro return sea multiple (tupla)
  def getStockInfo = {
    // other code here ...
    ("NFLX", 100.00, 101.00) // this is a Tuple3
  }                                               //> getStockInfo: => (String, Double, Double)
  
  val (symbol, currentPrice, bidPrice) = getStockInfo
                                                  //> symbol  : String = NFLX
                                                  //| currentPrice  : Double = 100.0
                                                  //| bidPrice  : Double = 101.0
    val result = getStockInfo                     //> result  : (String, Double, Double) = (NFLX,100.0,101.0)
    result._1                                     //> res0: String = NFLX
    result._2                                     //> res1: Double = 100.0
    result._3                                     //> res2: Double = 101.0
}