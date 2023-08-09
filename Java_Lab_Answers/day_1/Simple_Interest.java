//1. Write a program to accept principle, rate of interest and time. Calculate simple interest and display the same 
package day_1;

import java.util.Scanner;

public class Simple_Interest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Principle amount : ");
		int principle=sc.nextInt();
		System.out.print("Enter Rate of Intrest : ");
		double rateOfIntrest=sc.nextDouble();
		System.out.print("Enter Time Taken : ");
		float time=sc.nextFloat();
		
		double simpleInterest=(principle*time*rateOfIntrest)/100;
		System.out.println("Simple Interest of given data is :"+simpleInterest);
		
	}

}
