//3. Write a program to accept a number and display whether it is an even or odd number 

package day_1;

import java.util.Scanner;

public class Even_Or_Odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number to check : ");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("Given "+num+" is Even Number");
		}else {
			System.out.println("Given "+num+" is Odd Number");
		}

	}

}
