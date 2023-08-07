package day_4.Lab_1;
/*
 * Create Class Employee with variables long empId, String name, int age, double salary
Create 4 Objects of Employee Class
1. TestMain with Default Constructor and display Employee details
2. TestMain with Parameterized Constructor and display Employee details
 */
public class Employee {
		private long empId;
		private String name;
		private int age;
		private double salary;
		
		public Employee() {
			
		}
		public void setempId(long empId) {
			this.empId=empId;
		}
		public void setName(String name) {
			this.name=name;
		}
		public void setAge(int age) {
			this.age=age;
		}
		public void setSalary(double salary) {
			this.salary=salary;
		}
		
		public long getEmpId() {
			return empId;
		}
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public double getSalary() {
			return salary;
		}
		
		public Employee(long empId, String name, int age, double salary) {
			this.empId = empId;
			this.name = name;
			this.age = age;
			this.salary = salary;

	}

}
