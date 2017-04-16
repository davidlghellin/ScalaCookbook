package es.david.cap13.ejemplo02

import akka.actor._

// (1) constructor changed to take a parameter
class HolaActor02(myName: String) extends Actor {
  def receive = {
    // (2) println statements changed to show the name
    case "hello" => println(s"hello from $myName")
    case _       => println(s"'huh?', said $myName")
  }
}

object Main extends App {
  val system = ActorSystem("HelloSystem")
  // (3) use a different version of the Props constructor
  val helloActor = system.actorOf(Props(new HolaActor02("Fred")), name = "helloactor")

  helloActor ! "hello"
  helloActor ! "buenos dias"
  system.shutdown
}