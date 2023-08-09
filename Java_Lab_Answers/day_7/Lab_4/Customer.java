package day_7.Lab_4;

import day_8.Lab_5.IdGenerator;

public class Customer {
	private long custId;
	private String custName;
	
	public Customer(String custName) {
		this.custId = IdGenerator.generateIdCust();
		this.custName = custName;
	}
	public long getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + "]";
	}
	
	

}
