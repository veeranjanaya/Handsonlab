//8. Write a program to find the reverse of a number. Store the reverse value in a different variable. Display the reverse. 
package day_1;

import java.util.Scanner;

public class Reverse_Of_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number to be Reversed : ");
		int num=sc.nextInt();
		int reverse=0;
		while(num!=0) {
			int lastdigit=num%10;
			reverse=reverse*10+lastdigit;
			num/=10;
		}
		System.out.println("Reverse of a given number is : "+reverse);

	}

}
