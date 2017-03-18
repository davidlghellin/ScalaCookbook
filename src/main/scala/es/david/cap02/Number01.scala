package es.david.cap02

object Number01 extends App
{
  /**
   * El problema es que quieres combertir un String a un numero  
   */
  
  // para ello tenemos los metodos que de una cadena lo convierte en su correspondiente tipo
  
  println("100".toShort)
  println("100".toInt)
  println("100".toLong)  
  println("100".toFloat)
  println("100".toDouble)
  
  // println("100f".toShort) daria un error ya que no tiene 
  
  // bigInteger y bigDecimal son creados como String directamente
  println(BigDecimal("100"))
  println(BigInt("100"))
}