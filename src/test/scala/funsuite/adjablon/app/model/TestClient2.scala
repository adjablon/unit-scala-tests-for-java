package funsuite.adjablon.app.model

import org.scalatest.FunSuite
import adjablon.app.model.Client
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.matchers.ShouldMatchers

/**
 * @author Adam Jabłoński
 */
@RunWith(classOf[JUnitRunner])
class TestClient2 extends FunSuite with ShouldMatchers {

  test("check setter for name field") {
    val client = new Client()
    val name = "John"
    client.setName(name)
    assert(client.getName() === name)
  }

  test("check setter for name field with expect") {
    val client = new Client()
    val name = "John"
    client.setName(name)
    expect(name){
      client.getName()
    }
  }
  
  test("check setter for name field with should matcher") {
    val client = new Client()
    val name = "John"
    client.setName(name)
    client.getName() should equal(name)
  }
}