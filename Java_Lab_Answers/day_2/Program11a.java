//a. 4, 16, 36, 64, … N 
package day_2;

import java.util.Scanner;

public class Program11a {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter range : ");
		int n=sc.nextInt();
		int product=1;
		for(int i=2;i<=n;i+=2) {
			product=i*i;
			System.out.print(product+" ");
			sc.close();
		}
	}

}
