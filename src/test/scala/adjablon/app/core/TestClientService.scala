package adjablon.app.core

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import adjablon.app.model.Client
import adjablon.app.model.Item
import org.scalatest.mock.MockitoSugar
import org.mockito.Mockito._
import adjablon.app.model.Order
import java.util.ArrayList
import org.scalatest.matchers.HavePropertyMatcher
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
 * @author Adam Jabłoński
 */
@RunWith(classOf[JUnitRunner])
class TestClientService extends FlatSpec with ShouldMatchers with MockitoSugar {

  def fixture = new {
    val clientService = new ClientService()
    val item = new Item()
    val item2 = new Item()
    val order = new Order()
    val clientWithoutOrders = new Client()
    val mockOrderService = mock[OrderService]
    val items = List(item, item2)
    val jItems = new ArrayList[Item]
    items foreach (jItems.add(_))
  }
  
  "ClientService" should "register one piece order to client's account" in {
    val f = fixture
    f.order.setItems(new ArrayList())
    f.order.getItems().add(f.item)

    when(f.mockOrderService.createOrder(f.item)).thenReturn(f.order)
    f.clientService.setOrderService(f.mockOrderService)
    
    val clientWithOrder = f.clientService.registerOrder(f.clientWithoutOrders, f.item)

    clientWithOrder.getOrders() should have size (1)
    clientWithOrder.getOrders().get(0) shouldBe f.order
    clientWithOrder.getOrders().get(0).getItems() should have size (1);
    clientWithOrder.getOrders().get(0).getItems().get(0) shouldBe f.item

    verify(f.mockOrderService).createOrder(f.item)
  }

  it should "register order with multiple items to client's account" in {
    val f = fixture
    f.order.setItems(f.jItems)

    when(f.mockOrderService.createOrder(f.jItems)).thenReturn(f.order)
     f.clientService.setOrderService(f.mockOrderService)
    
    val clientWithOrder = f.clientService.registerOrder(f.clientWithoutOrders, f.jItems)
    clientWithOrder.getOrders() should have size (1)
    clientWithOrder.getOrders().get(0) shouldBe f.order
    clientWithOrder.getOrders().get(0).getItems() should have size (2);
    clientWithOrder.getOrders().get(0).getItems().get(0) shouldBe f.item
    
    verify(f.mockOrderService).createOrder(f.jItems)
  }
}