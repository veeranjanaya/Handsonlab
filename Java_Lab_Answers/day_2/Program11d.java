//d. 1, 4, 7, 12, 23, 42, 77, … N 
package day_2;

import java.util.Scanner;

public class Program11d {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter  range : ");
		int n=sc.nextInt();
		int a=1;
		int b=4;
		int c=7;
		int d=0;
		System.out.print(a+" "+b+" "+c+" ");
		for(int i=4;i<=n;i++) {
			d=a+b+c;
			a=b;
			b=c;
			c=d;
			System.out.print(d+" ");
		}
		sc.close();

	}

}
