package adjablon.app.model;

import java.util.List;

/**
 * @author Adam Jabłoński
 */
public class Order {

	private String orderNumber;
	
	private List<Item> items;
	
	private Double sum;

	public Order(){};
	
	public Order(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
	
}
