//12. Write a program to generate fibonacci series.
package day_2;

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter range : ");
		int n=sc.nextInt();
		int a=0,b=1,c=0;
		System.out.println("Fibonacci Number Series are : ");
		for(int i=0;i<n;i++) {
			c=a+b;
			System.out.print(a+" ");
			a=b;
			b=c;
		}
		sc.close();
	}

}
