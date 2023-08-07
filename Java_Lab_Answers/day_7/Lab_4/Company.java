/*
Create Company, Customer, Address, Product
Company has many Customers
Company has one Address
Address has one Company
Company has many products
in TestMain display Company details with customer, address and product

 */
package day_7.Lab_4;

import java.util.ArrayList;

public class Company {
	
	private int companyId;
	private String companyName;
	private Address address; //Company has one Address
	
	
	public Company(int companyId, String companyName) {
		this.companyId = companyId;
		this.companyName = companyName;
	}

	private ArrayList<Customer> customers = new ArrayList<Customer>();//Company has many Customers
	private ArrayList<Product> products = new ArrayList<Product>();//Company has many products
	
	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}


}
