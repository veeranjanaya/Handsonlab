package shopping_Site;

import java.util.ArrayList;

public class Order {
	private int order_id;
	private Customer customer;
	private ArrayList<OrderedItem> ordereditem;
	
	public Order(int order_id, Customer customer) {
		this.order_id = order_id;
		this.customer = customer;
		ordereditem = new ArrayList<>();
	}
	
	public void addOrderItem(OrderedItem item) {
		ordereditem.add(item);
	}

	public ArrayList<OrderedItem> getOrderedItem() {
		return ordereditem;
	}

	public int getOrder_id() {
		return order_id;
	}

	public Customer getCustomer() {
		return customer;
	}

	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", customer=" + customer + ", ordereditem=" + ordereditem + "]";
	}
	
}
