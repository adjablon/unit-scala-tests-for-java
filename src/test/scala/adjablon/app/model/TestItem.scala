package adjablon.app.model

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
 * @author Adam Jabłoński
 */
@RunWith(classOf[JUnitRunner])
class TestItem extends FlatSpec with ShouldMatchers {

  "Item" should "set name with setter method" in {
    val item = new Item
    val name = "ItemName"
    item.setName(name)
    item.getName() should equal(name)
  }
  
  it should "set price with setter method" in {
    val item = new Item
    val price = 100
    item.setPrice(price)
    item.getPrice() should equal(price)
  }
  
  it should "set quantity with setter method" in {
    val item = new Item
    val quantity = 4
    item.setQuantity(quantity)
    item.getQuantity() should equal(quantity)
  }
  
  it should "set price, name and quantity with constructor" in {
    val name = "itemName"
    val price = 100
    val quantity = 4
    val item = new Item(name, price, quantity)
    item.getName() should equal(name)
    item.getPrice() should equal(price)
    item.getQuantity() should equal(quantity)
  }
  
  it should "set price, name and default quantity with constructor" in {
    val name = "itemName"
    val price = 100
    val item = new Item(name, price)
    item.getName() should equal(name)
    item.getPrice() should equal(price)
    item.getQuantity() should equal(1)
  }
}