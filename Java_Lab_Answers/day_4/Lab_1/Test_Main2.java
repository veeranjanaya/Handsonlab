package day_4.Lab_1;

public class Test_Main2 {

	public static void main(String[] args) {
		Employee employee=new Employee(324323,"Java Lab",30,450000);
		
		System.out.println("Employee Id iS : "+employee.getEmpId());
		System.out.println("Employee Id iS : "+employee.getName());
		System.out.println("Employee Id iS : "+employee.getAge());
		System.out.println("Employee Id iS : "+employee.getSalary());
		
		System.out.println();
		
		Employee employee1=new Employee(456323,"Java LabPractice",25,25000);
		
		System.out.println("Employee Id iS : "+employee1.getEmpId());
		System.out.println("Employee Id iS : "+employee1.getName());
		System.out.println("Employee Id iS : "+employee1.getAge());
		System.out.println("Employee Id iS : "+employee1.getSalary());

	}

}
