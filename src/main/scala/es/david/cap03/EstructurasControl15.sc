package es.david.cap03

object EstructurasControl15 {

  // estructuras de control con listas
  def listToString(list: List[String]): String = list match {
    case s :: rest => s + " " + listToString(rest)
    case Nil       => ""
  }                                               //> listToString: (list: List[String])String
  val x = List(1, 2, 3)                           //> x  : List[Int] = List(1, 2, 3)
  val y = 1 :: 2 :: 3 :: Nil                      //> y  : List[Int] = List(1, 2, 3)
  val fruits = "Apples" :: "Bananas" :: "Oranges" :: Nil
                                                  //> fruits  : List[String] = List(Apples, Bananas, Oranges)
  listToString(fruits)                            //> res0: String = "Apples Bananas Oranges "

  def sum(list: List[Int]): Int = list match {
    case n :: rest => n + sum(rest)
    case Nil       => 0
  }                                               //> sum: (list: List[Int])Int
  def multiply(list: List[Int]): Int = list match {
    case n :: rest => n * multiply(rest)
    case Nil       => 1
  }                                               //> multiply: (list: List[Int])Int
  
  val nums = List(1,2,3,4,5)                      //> nums  : List[Int] = List(1, 2, 3, 4, 5)
  sum(nums)                                       //> res1: Int = 15
  multiply(nums)                                  //> res2: Int = 120
}