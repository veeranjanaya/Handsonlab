//b. 1, 2, 3, 4, 5, 6, … N 
package day_2;

import java.util.Scanner;

public class Program11b {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter range : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
			sc.close();
		}
	}

}
