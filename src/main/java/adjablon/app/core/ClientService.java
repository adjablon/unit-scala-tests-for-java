package adjablon.app.core;

import java.util.ArrayList;
import java.util.List;

import adjablon.app.model.Client;
import adjablon.app.model.Item;
import adjablon.app.model.Order;

/**
 * @author Adam Jabłoński
 *
 */
public class ClientService {

	private OrderService orderService;
	
	public Client registerOrder(Client client, Item item) {
		if(client.getOrders() == null){
			client.setOrders(new ArrayList<Order>());
		}
		client.getOrders().add(orderService.createOrder(item));
		return client;
	}
	
	public Client registerOrder(Client client, List<Item> items) {
		if(client.getOrders() == null){
			client.setOrders(new ArrayList<Order>());
		}
		client.getOrders().add(orderService.createOrder(items));
		return client;
	}

	public OrderService getOrderService() {
		return orderService;
	}

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
}
