package shopping_Site;

public class RegCustomer extends Customer{
	private double splDiscount;
	
	public RegCustomer(int customer_Id, String customer_name, double splDiscount) {
		super(customer_Id, customer_name);
		this.splDiscount = splDiscount;
	}

	public double getSplDiscount() {
		return splDiscount;
	}
	
	@Override
	public String toString() {
		return "RegCustomer [splDiscount=" + splDiscount + "]";
	}
	
	
}
