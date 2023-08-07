package day_1;

import java.util.Scanner;

public class Class_Topper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter subject 1 marks");
		int marks1 = sc.nextInt();
		System.out.println("Enter subject 2 marks");
		int marks2 = sc.nextInt();
		System.out.println("Enter subject 3 marks");
		int marks3 = sc.nextInt();
		
		
		int total = marks1 + marks2 + marks3;
		
		double average = (double) total / 3;
		
		System.out.println("Total marks : " + total);
		System.out.println("Average Score : " + average);
		
		if(average >= 60) {
			System.out.println("Student secured first class");
		}
		else if(average>=50 && average<60) {
			System.out.println("Student secured second class");
		}
		else if(average>=35 && average<50) {
			System.out.println("Student is passed");
		}
		else {
			System.out.println("Student is failed");
		}

	}

}
