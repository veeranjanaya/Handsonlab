package shopping_Site;

public class Item {
	private String desc;
	private double rate; 

	public Item(String desc, double rate) {
		this.desc = desc;
		this.rate = rate;
	}
	public String getDesc() {
		return desc;
	}
	public double getRate() {
		return rate;
	}
	@Override
	public String toString() {
		return "Item [desc=" + desc + ", rate=" + rate + "]";
	}
	
	


}
