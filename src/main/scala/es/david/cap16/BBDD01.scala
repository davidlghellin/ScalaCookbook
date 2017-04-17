package es.david.cap16

import java.sql.{Connection,DriverManager}

// Para poder conectar a la BBDD 
// $sudo systemctl start mysqld

object ScalaJdbcConnectSelect extends App {
  // connect to the database named "mysql" on port 8889 of localhost
  //Class.forName("org.mariadb.jdbc.Driver");  
  val url = "jdbc:mariadb://localhost:3306/mysql"
  val driver = "com.mysql.jdbc.Driver"
  val username = "root"
  val password = "root"
  var connection: Connection = _
  try {
    Class.forName(driver)
    connection = DriverManager.getConnection(url, username, password)
    val statement = connection.createStatement
    val rs = statement.executeQuery("SELECT host, user FROM user")
    while (rs.next) {
      val host = rs.getString("host")
      val user = rs.getString("user")
      println("host = %s, user = %s".format(host, user))
    }
  } catch {
    case e: Exception => e.printStackTrace
  }
  connection.close
}
/*
host = 127.0.0.1, user = root
host = ::1, user = root
host = athenea, user = 
host = athenea, user = root
host = localhost, user = 
host = localhost, user = root
*/