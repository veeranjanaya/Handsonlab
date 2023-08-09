package shopping_Site;

import java.util.ArrayList;

public class Company {
	private String comapny_Name;
	private int company_Id;
	private ArrayList<Customer> customers;//company has Customers
	private double totalWorthOfOrders;
	
	public Company(String comapny_Name, int company_Id) {
		this.comapny_Name = comapny_Name;
		this.company_Id = company_Id;
		customers = new ArrayList<>();
	}
	public String getComapny_Name() {
		return comapny_Name;
	}
	public int getCompany_Id() {
		return company_Id;
	}
	public ArrayList<Customer> getCustomer() {
		return customers;
	}
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	public double getTotalOrderValue() {
		for(Customer customer:customers) {
			for(Order order:customer.getOrder()) {
				double orderValue=0;
				for(OrderedItem ordereditemi:order.getOrderedItem()) {
					int quantity = ordereditemi.getQuantity();
					double rate = ordereditemi.getItem().getRate();
					double total=quantity*rate;
					orderValue+=total;
				}
				if(customer instanceof RegCustomer) {
					double splDiscount = ((RegCustomer) customer).getSplDiscount();
					double splDiscountValue = orderValue*(splDiscount/100);
					orderValue-=splDiscountValue;
				}
				totalWorthOfOrders+=orderValue;
			}
	}
        return totalWorthOfOrders;
    }
	@Override
	public String toString() {
		return "Company [comapny_Name=" + comapny_Name + ", company_Id=" + company_Id + ", customers=" + customers
				+ ", totalWorthOfOrders=" + totalWorthOfOrders + "]";
	}
	
	
	
}
