package day_7.Lab_4;

import java.util.ArrayList;

public class Test_Main {

	public static void main(String[] args) {
		Company company = new Company(219,"ITFrim");
		Customer cust1 = new Customer("IBM");
		Customer cust2 = new Customer("DELLOIT");
		
		ArrayList<Customer> customers = new ArrayList<Customer>();//Company has many Customers
		customers.add(cust1);
		customers.add(cust2);
		company.setCustomers(customers);
		
		Address address = new Address("Hyderabad","Telangana");
		company.setAddress(address);//Company has one Address
		address.setCompany(company);//
		
		Product prod1 = new Product(212,"YONO SBI", 354000.43);
		Product prod2 = new Product(321,"Data", 543000.63);
		ArrayList<Product> products = new ArrayList<Product>();//Company has many products
		products.add(prod1);
		products.add(prod2);
		company.setProducts(products);
		
		System.out.println("Comapny Name is : "+company.getCompanyName());
		System.out.println("Comapany Id is : "+company.getCompanyId());
		System.out.println("Comapny Customer Details : "+customers);
		System.out.println("Company Product Details is : "+ products);
		System.out.println("Company Address : "+ company.getAddress());
		
		
		

	}

}
