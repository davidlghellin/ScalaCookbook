package es.david.cap13.ejemplo05
import akka.actor._

// 1)
case class CreateChild(name: String)
case class Name(name: String)

class Child extends Actor {
  var name = "No name"
  override def postStop {
    println(s"D'oh! They killed me ($name): ${self.path}")
  }
  def receive = {
    // 2)
    case Name(name) => this.name = name
    case _          => println(s"Child $name got message")
  }
}

class Parent extends Actor {
  def receive = {
    // 3)
    case CreateChild(name) =>
      // Parent creates a new Child here
      println(s"Parent about to create Child ($name) ...")
      val child = context.actorOf(Props[Child], name = s"$name")
      child ! Name(name)
    case _ => println(s"Parent got some other message.")
  }
}

// 4)
object ParentChildDemo extends App {
  val actorSystem = ActorSystem("ParentChildTest")
  val parent = actorSystem.actorOf(Props[Parent], name = "Parent")
  // send messages to Parent to create to child actors
  parent ! CreateChild("Jonathan")
  parent ! CreateChild("Jordan")
  Thread.sleep(500)
  // lookup Jonathan, then kill it
  println("Sending Jonathan a PoisonPill ...")
  val jonathan = actorSystem.actorSelection("/user/Parent/Jonathan")
  jonathan ! PoisonPill
  println("jonathan was killed")
  Thread.sleep(5000)
  actorSystem.shutdown
}

/*
Parent about to create Child (Jonathan) ...
Parent about to create Child (Jordan) ...
Sending Jonathan a PoisonPill ...
jonathan was killed
D'oh! They killed me (Jonathan): akka://ParentChildTest/user/Parent/Jonathan
D'oh! They killed me (Jordan): akka://ParentChildTest/user/Parent/Jordan
*/

// 1) Al principio se crean las clases CrateChild y Name
// 2) El actor Child tiene un metedo receive que puede manejar un mensaje Name, que lo usa para establecer su nombre
// 3) El metodo receive de Parent, controla en mensaje CreateChild, cuando lo recive crea un nuevo actor con el nombre dado, podemos ver que usa "context.actorOf"
// 4) El ParentChildDemo crea un ActorSystem, y despues con la referencia de este crea un objeto Parent, despues envia dos mensajes CreateChild
// despues de un tiempo mira a al hijo Jonathan y le envia un mensaje de PoisonPill
