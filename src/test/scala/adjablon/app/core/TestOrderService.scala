package adjablon.app.core

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec
import adjablon.app.model.Item
import java.util.ArrayList
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
 * @author Adam Jabłoński
 */
@RunWith(classOf[JUnitRunner])
class TestOrderService extends FlatSpec with ShouldMatchers {

  "OrderService" should "generate order number" in {
    val orderService = new OrderService()
    val orderNumber = orderService.generateOrderNumber();
    
    orderNumber should have length(9)
    orderNumber.matches("[A-Z][0-9]{8}") should equal(true) 
  }
  
  it should "create order with one item" in {
    val orderService = new OrderService()
    val item = new Item("first item", 10)
    val order = orderService.createOrder(item)
    
    order.getItems() should have size(1)
    order.getSum() should equal(item.getPrice())
  }
  
  it should "create order with many items" in {
    val orderService = new OrderService()
    val item = new Item("first item", 10)
    val item2 = new Item("second item", 20)
    val items = List(item, item2)
    val jItems = new ArrayList[Item]
    items foreach (jItems.add(_))
    
    val order = orderService.createOrder(jItems)
    
    order.getItems() should have size(2)
    order.getSum() should equal(item.getPrice() + item2.getPrice())
  }
}