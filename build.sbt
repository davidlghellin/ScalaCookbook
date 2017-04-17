name := "ScalaCookbook"
 
version := "1.0"
 
scalaVersion := "2.11.8"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

// https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.11
//libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % "2.4.16"
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.1.2"

//libraryDependencies += "com.typesafe" % "config" % "1.3.1"
libraryDependencies += "org.scalatest" % "scalatest_2.11" % "3.0.1"


libraryDependencies +=
  "com.typesafe.akka" % "akka-actor_2.11" % "2.4.1"


libraryDependencies += 
	"mysql" % "mysql-connector-java" % "5.1.18"
   
libraryDependencies += 	
	"org.mariadb.jdbc" % "mariadb-java-client" % "1.1.7"


// Pruebas Slick
libraryDependencies += 	
	"com.typesafe.slick" %% "slick" % "3.2.0"

lazy val myConf = settingKey[Config]("The application properties")

myConf := {
    ConfigFactory.parseFile(new File("src/main/resources/application.conf"))
}
  