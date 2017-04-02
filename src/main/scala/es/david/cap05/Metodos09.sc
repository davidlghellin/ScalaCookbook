package es.david.cap05

object Metodos09 {

  // deseas escribir una API para que el codigo sea mas fluido
  class Person {
    protected var fname = ""
    protected var lname = ""
    def setFirstName(firstName: String): this.type = {
      fname = firstName
      this
    }
    def setLastName(lastName: String): this.type = {
      lname = lastName
      this
    }
  }
  class Employee extends Person {
    protected var role = ""
    def setRole(role: String): this.type = {
      this.role = role
      this
    }
    override def toString = {
      "%s, %s, %s".format(fname, lname, role)
    }
  }

  val employee = new Employee                     //> employee  : es.david.cap05.Metodos09.Employee = , , 
  // use the fluent methods
  employee.setFirstName("Al")
    .setLastName("Alexander")
    .setRole("Developer")                         //> res0: es.david.cap05.Metodos09.employee.type = Al, Alexander, Developer
  println(employee)                               //> Al, Alexander, Developer
  
  // podemos ver que los metodos se van concatenando uno tras otro, para asi facilitar la ejecucion
}