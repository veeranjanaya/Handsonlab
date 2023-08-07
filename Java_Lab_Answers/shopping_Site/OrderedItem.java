package shopping_Site;

public class OrderedItem {
	private int quantity;
	private Item item;
	public OrderedItem(int quantity, Item item) {
		this.quantity = quantity;
		this.item = item;
	}

	public Item getItem() {
		return item;
	}

	public OrderedItem(int quantity) {
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public double getItemTotalValue() {
        return item.getRate() * quantity;
    }
	
	@Override
	public String toString() {
		return "OrderedItem [quantity=" + quantity + ", item=" + item + "]";
	}
	

}
