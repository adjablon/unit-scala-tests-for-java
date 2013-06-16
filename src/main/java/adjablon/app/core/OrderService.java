package adjablon.app.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import adjablon.app.model.Item;
import adjablon.app.model.Order;

/**
 * @author Adam Jabłoński
 *
 */
public class OrderService {

	public Order createOrder(Item item) {
		Order order = new Order(generateOrderNumber());
		List<Item> items = new ArrayList<Item>();
		items.add(item);
		order.setSum(item.getPrice() * item.getQuantity());
		order.setItems(items);
		return order;
	}
	
	public Order createOrder(List<Item> items) {
		Order order = new Order(generateOrderNumber());
		order.setItems(items);
		double sum = 0;
		for(Item item: items) {
			sum += item.getPrice() * item.getQuantity();
		}
		order.setSum(sum);
		return order;
	}
	
	public String generateOrderNumber() {
		String charBase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String numberBase = "01234567890";
		Random random = new Random();
		StringBuilder sb = new StringBuilder(charBase.charAt( random.nextInt(charBase.length())));
		sb.append(charBase.charAt( random.nextInt(charBase.length())));
		for(int i = 0; i< 8; i++) {
			sb.append(numberBase.charAt(random.nextInt(numberBase.length())));
		}
		return sb.toString();
	}
	
}
