package day_7;

import java.util.Scanner;

public class Test_Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name :");
		IEmployee employee = (IEmployee) new Employee(sc.next());
		
		sc.close();
		
		System.out.println("Employee Id Is :"+employee.getId());
		System.out.println("Employee Name is : "+employee.getName());

	}

}
