package adjablon.app.model

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FlatSpec
import org.scalatest.matchers.MustMatchers
import org.scalatest.matchers.ShouldMatchers
import java.util.ArrayList

/**
 * @author Adam Jabłoński
 */
@RunWith(classOf[JUnitRunner])
class TestOrder extends FlatSpec with ShouldMatchers {

  "Order" should "set orderNumber with setter method" in {
    val orderNumber = "A22234"
    val order = new Order
    order.setOrderNumber(orderNumber)
    order.getOrderNumber() should equal(orderNumber)
  }
  
  it must "set orderNumber with constructor" in {
    val orderNumber = "A22234"
    val order = new Order(orderNumber)
    order.getOrderNumber() should equal(orderNumber)
  }
  
  it should "set sum with setter method" in {
    val sum = 23.5
    val order = new Order
    order.setSum(sum)
    order.getSum() should equal(sum)
  }
  
  it should "set items with setter method" in {
    val items = List(new Item, new Item)
    val jItems = new ArrayList[Item]
    items foreach (jItems.add(_))
    val order = new Order
    order.setItems(jItems)
    order.getItems().size() should equal(items.size)
  }
}