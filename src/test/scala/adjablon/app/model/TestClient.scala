package adjablon.app.model

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import java.util.ArrayList

@RunWith(classOf[JUnitRunner])
class TestClient extends FlatSpec with ShouldMatchers {

  "Client" should "set name with setter method" in {
    val client = new Client()
    val name = "John"
    client.setName(name)
    client.getName() should equal(name)
  }

  it should "set lastname with setter method" in {
    val lastName = "Smith"
    val client = new Client()
    client.setLastname(lastName)
    client.getLastname() should equal(lastName)
  }

  it should "set name and lastname with constructor" in {
    val name = "John"
    val lastname = "Smith"
    val client = new Client(name, lastname)
    client.getLastname() should equal(lastname)
    client.getName() should equal(name)
  }
  
  it should "set orders list with setter method" in {
    val orders = List(new Order, new Order, new Order)
    val jOrders = new ArrayList[Order]
    orders foreach {jOrders.add(_)}
    val client = new Client
    client.setOrders(jOrders)
    client.getOrders().size() should equal(orders.size)
  }
}