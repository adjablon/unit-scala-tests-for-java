package adjablon.app.model;

import java.util.List;

/**
 * @author Adam Jabłoński
 *
 */
public class Client {
	
	private Long id;
	
	private String name;
	
	private String lastname;
	
	private List<Order> orders;
	
	public Client(){}
	
	public Client(String name, String lastname) {
		this.name = name;
		this.lastname = lastname;
	}
	
	public Client(Long id, String name, String lastname){
		this.id = id;
		this.name = name;
		this.lastname = lastname;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	

}
