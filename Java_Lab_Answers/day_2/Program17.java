/*
 * 17. Write a program to find X ^ N (x to the power of n) without using in-built functions. 
 * Accept X and n. Display the result. 
 */
package day_2;

import java.util.Scanner;

public class Program17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter X value : ");
		int x=sc.nextInt();
		System.out.print("Enter N value : ");
		int n=sc.nextInt();
		int product=1;
		for(int i=1;i<=n;i++) {
			product*=x;
		}
		System.out.println("X^N is :"+product);
		sc.close();

	}

}
