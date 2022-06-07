package example

import pureconfig.ConfigSource
import pureconfig.generic.auto._

object Hello extends Greeting with App {
  private val y = ConfigSource.default
  val x = y.load[ServiceConf]
  println(x)

  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "hello"
}
