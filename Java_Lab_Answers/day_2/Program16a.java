//1, 2, 6, 15, 31, 56 … N
package day_2;

import java.util.Scanner;

public class Program16a {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Range : ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			int product=1;
				product=i*i;
			
		}
		sc.close();
	}

}
