package es.david.cap03

object EstructurasControl06 {
  // operador ternario
  // en scala no existe

  def abs(x: Int) = if (x >= 0) x else -x         //> abs: (x: Int)Int
  def max(a: Int, b: Int) = if (a > b) a else b   //> max: (a: Int, b: Int)Int
}