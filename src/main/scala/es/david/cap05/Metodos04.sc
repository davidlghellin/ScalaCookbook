package es.david.cap05

object Metodos04 {

  //queremos especificar el nombre de los paramatros en el orden que nosotros deseamos
  class Pizza {
    var crustSize = 12
    var crustType = "Thin"
    def update(crustSize: Int, crustType: String) {
      this.crustSize = crustSize
      this.crustType = crustType
    }
    override def toString = {
      "A %d inch %s crust pizza.".format(crustSize, crustType)
    }
  }
  val p = new Pizza                               //> p  : es.david.cap05.Metodos04.Pizza = A 12 inch Thin crust pizza.
  p.update(crustSize = 16, crustType = "Thick")
  println(p)                                      //> A 16 inch Thick crust pizza.
  p.update(crustType = "Pan", crustSize = 14)
  println(p)                                      //> A 14 inch Pan crust pizza.
}