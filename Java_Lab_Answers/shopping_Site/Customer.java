package shopping_Site;

import java.util.ArrayList;

public class Customer {
	private int customer_Id;
	private String customer_name;
	 
	private ArrayList<Order> orders;
	
	public Customer(int customer_Id, String customer_name) {
		this.customer_Id = customer_Id;
		this.customer_name = customer_name;
		orders = new ArrayList<>();
	}
	public void addOrder(Order order) {
		orders.add(order);
	}

	public ArrayList<Order> getOrder() {
		return orders;
	}

	public int getCustomer_Id() {
		return customer_Id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	@Override
	public String toString() {
		return "Customer [customer_Id=" + customer_Id + ", customer_name=" + customer_name + ", orders=" + orders + "]";
	}
	
	
}
