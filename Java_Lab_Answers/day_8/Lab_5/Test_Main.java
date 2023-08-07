/*
 * 
Uses
create IdGenerator class with 2 methods
getCustId() and getEmpId()
use this methods in constructors of Customer and Employee class for auto generated values
in TestMain display Employee and Customer details

 */
package day_8.Lab_5;

import day_7.Employee;
import day_7.Lab_4.Customer;

public class Test_Main {

	public static void main(String[] args) {
		Employee e1= new Employee("dsfs");
		Employee e2 = new Employee("dsvdsf");
		
		System.out.println("Employee1 id is :"+e1.getId());
		System.out.println("Employee2 id is :"+e2.getId());
		
		Customer c1= new Customer("dfgdsf");
		Customer c2= new Customer("dfgdsf");
		Customer c3= new Customer("dfgdsf");
		Customer c4= new Customer("dfgdsf");
		
		System.out.println("Customer1 id is : "+c1.getCustId());
		System.out.println("Customer2 id is : "+c2.getCustId());
		System.out.println("Customer3 id is : "+c3.getCustId());
		System.out.println("Customer4 id is : "+c4.getCustId());
	}

}
