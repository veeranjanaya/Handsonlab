//c. 1, 4, 27, 256, 3125, … N 
package day_2;

import java.util.Scanner;

public class Program11c {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter range");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int product=1;
			for(int j=1;j<=i;j++) {
				product*=i;
			}
			System.out.print(product+" ");
			sc.close();
		}
	}

}
