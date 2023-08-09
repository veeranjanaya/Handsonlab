package day_4.Lab_1;

public class Test_Main1 {
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setempId(43782423);
		employee.setName("Java Lab");
		employee.setAge(30);
		employee.setSalary(560000);
		
		System.out.println("Employee Id iS : "+employee.getEmpId());
		System.out.println("Employee Id iS : "+employee.getName());
		System.out.println("Employee Id iS : "+employee.getAge());
		System.out.println("Employee Id iS : "+employee.getSalary());
		System.out.println();
		
		Employee employee1=new Employee();
		employee1.setempId(45463645);
		employee1.setName("Java LabPractice");
		employee1.setAge(24);
		employee1.setSalary(340000);
		
		System.out.println("Employee Id iS : "+employee1.getEmpId());
		System.out.println("Employee Id iS : "+employee1.getName());
		System.out.println("Employee Id iS : "+employee1.getAge());
		System.out.println("Employee Id iS : "+employee1.getSalary());

	}

}
