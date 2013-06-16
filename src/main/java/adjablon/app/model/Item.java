package adjablon.app.model;

/**
 * @author Adam Jabłoński
 *
 */
public class Item {

	private String name;
	
	private Double price = 0d;
	
	private Integer quantity = 0;
	
	public Item(){};
	
	public Item(String name, Double price){
		this.name = name;
		this.price = price;
		this.quantity = 1;
	}
	
	public Item(String name, Double price, Integer quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
}
