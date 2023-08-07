//e. 1, 4, 9, 25, 36, 49, 81, 100, … N
package day_2;

import java.util.Scanner;

public class Program11e {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter last range : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print(i*i+" ");
		}
		sc.close();
	}

}
