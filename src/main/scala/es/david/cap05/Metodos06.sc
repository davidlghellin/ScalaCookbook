package es.david.cap05

object Metodos06 {

  class Pizza {
    // no tenemos parentesis despues de cristSizze en el get
    def crustSize = 12
  }
  val p = new Pizza                               //> p  : es.david.cap05.Metodos06.Pizza = es.david.cap05.Metodos06$Pizza@deb6432
                                                  //| 
 	p.crustSize                               //> res0: Int = 12
 	// la guia de estilo de Scala dice que si tenemos efectos segundarios pondremos parentesis
}