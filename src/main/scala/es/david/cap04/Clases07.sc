package es.david.cap04

object Clases07 {

  // queremos tener un atriuto donde no tengamos los get´s ni los set´s
  // pero podemos acceder creando digamos nuestros propios metodos
  class Stock {
    // getter y setter generados
    var delayedPrice: Double = _
    // mantener este campo oculto
    private var price: Double = _

    def setPrice(p: Double) { price = p }
    def isMayor(otro: Stock): Boolean = this.price > otro.price
  }

  val s = new Stock                               //> s  : es.david.cap04.Clases07.Stock = es.david.cap04.Clases07$Stock@78e03bb5
  println(s.delayedPrice)                         //> 0.0

  val s1 = new Stock                              //> s1  : es.david.cap04.Clases07.Stock = es.david.cap04.Clases07$Stock@5594a1b5
                                                  //| 
  s1.setPrice(20)
  val s2 = new Stock                              //> s2  : es.david.cap04.Clases07.Stock = es.david.cap04.Clases07$Stock@6a5fc7f7
                                                  //| 
  s2.setPrice(100)
  println(s2.isMayor(s1))                         //> true

  // campos object-private
  // poniendo private[this], estamos diciendo que solo es accesible desde dentro
  class Stock2 {
    // a private[this] var is object-private, and can only be seen
    // by the current instance
    private[this] var price: Double = _
    def setPrice(p: Double) { price = p }
    
    // error: this method won't compile because price is now object-private
    //def isHigher(that: Stock): Boolean = this.price > that.price
  }
}