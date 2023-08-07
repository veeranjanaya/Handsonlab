//10. Write a program to find the factorial of a given number. 0! is always 1. Factorial of a negative number is not possible.
package day_1;

import java.util.Scanner;

public class Factorial_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A number : ");
		int num=sc.nextInt();
		int fact=1;
		if(num>0) {
			for(int i=num;i>=1;i--) {
				fact*=i;
			}
		}else if(num==0) {
			fact=1;
		}else {
			System.out.println("Invalid Option");
		}
		System.out.println("Factorial of a given number is "+fact);
	}

}
