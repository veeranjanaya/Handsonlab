//2. Write a program to accept two numbers. Display the two numbers. Swap the two numbers and display them again. 

package day_1;

import java.util.Scanner;

public class Swap_Two_Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("First Number : ");
		int num1=sc.nextInt();
		System.out.println("Second Number : ");
		int num2=sc.nextInt();
		
		System.out.println("Before Swapping");
		System.out.println(num1);
		System.out.println(num2);
		
		int temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("After Swapping");
		System.out.println(num1);
		System.out.println(num2);

	}

}
