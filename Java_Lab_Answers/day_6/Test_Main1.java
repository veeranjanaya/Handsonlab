package day_6;

public class Test_Main1 {

	public static void main(String[] args) {
		Employee e= new Employee();
		e.setName("Java");
		e.setEmpId(23433);
		e.setAge(25);
		e.setSalary(32432.34);
		
		System.out.println("Employee Name is : "+e.getName());
		System.out.println("Employee Id is : "+e.getEmpId());
		System.out.println("Employee Age is : "+e.age);
		System.out.println("Employee Salary is : "+e.salary);
		
		Employee e1= new Employee();
		e1.setName("Core Java");
		e1.setEmpId(31233);
		e1.setAge(22);
		e1.setSalary(43452.34);
		
		System.out.println("Employee Name is : "+e1.getName());
		System.out.println("Employee Id is : "+e1.getEmpId());
		System.out.println("Employee Age is : "+e1.age);
		System.out.println("Employee Salary is : "+e1.salary);
		
		Employee e2= new Employee();
		e2.setName("OO Java");
		e2.setEmpId(43263);
		e2.setAge(24);
		e2.setSalary(43642.34);
		
		System.out.println("Employee Name is : "+e2.getName());
		System.out.println("Employee Id is : "+e2.getEmpId());
		System.out.println("Employee Age is : "+e2.age);
		System.out.println("Employee Salary is : "+e2.salary);
		
		Employee e3= new Employee();
		e3.setName("Adv Java");
		e3.setEmpId(32133);
		e3.setAge(30);
		e3.setSalary(54432.34);
		
		System.out.println("Employee Name is : "+e3.getName());
		System.out.println("Employee Id is : "+e3.getEmpId());
		System.out.println("Employee Age is : "+e3.age);
		System.out.println("Employee Salary is : "+e3.salary);
	}

}
