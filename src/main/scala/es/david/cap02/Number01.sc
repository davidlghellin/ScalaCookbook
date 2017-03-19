package es.david.cap02

object Number01
{
  /**
   * El problema es que quieres combertir un String a un numero
   */
  
  // para ello tenemos los metodos que de una cadena lo convierte en su correspondiente tipo
  
  println("100".toShort)                          //> 100
  println("100".toInt)                            //> 100
  println("100".toLong)                           //> 100
  println("100".toFloat)                          //> 100.0
  println("100".toDouble)                         //> 100.0
  
  // println("100f".toShort) daria un error ya que no tiene
  
  // bigInteger y bigDecimal son creados como String directamente
  println(BigDecimal("100"))                      //> 100
  println(BigInt("100"))                          //> 100
}