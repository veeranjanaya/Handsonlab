//b. 1, 1, 2, 3, 5, 8, 13, … N 
package day_2;

import java.util.Scanner;

public class Program16b {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range : ");
		int n=sc.nextInt();
		int a=0,b=1,c=0;
		for(int i=1;i<=n;i++) {
			c=a+b;
			System.out.print(b+" ");
			a=b;
			b=c;
		}
		sc.close();
	}

}
