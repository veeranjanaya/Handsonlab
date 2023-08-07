package day_6;

public class Test_Main2 {

	public static void main(String[] args) {
		Employee e1 = new Employee(324334,"Java",23,435345.34);
		
		System.out.println("Employee Age is : "+e1.age);
		System.out.println("Employee Salary is : "+e1.salary);
		System.out.println("Employee Id is : "+e1.getEmpId());
		System.out.println("Employee Name is : "+e1.getName());

	}

}
