/*
 * Lab1 : Create Class Employee with variables private long empId, private String name, int age, double salary
Create 4 Objects of Employee Class
1. TestMain with Default Constructor and display Employee details
2. TestMain with Parameterized Constructor and display Employee details
 */
package day_6;

public class Employee {
	private long empId;
	private String name;
	int age;
	double salary;
	
	//default constructor
	public Employee() {
		
	}
	
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId=empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary ) {
		this.salary=salary;
	}

	//Parameteraised Constructor
	public Employee(long empId, String name, int age, double salary) {
		
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
}
