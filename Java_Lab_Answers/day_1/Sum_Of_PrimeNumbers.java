//9. Write a program to find the sum of all the prime numbers in the range n to m. Display each prime number and the final sum.
package day_1;

import java.util.Scanner;

public class Sum_Of_PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first range value : ");
		int m=sc.nextInt();
		System.out.print("Enter last range value : ");
		int n=sc.nextInt();
		int count;
		int sum=0;
		for(int i=m;i<=n;i++) {
			count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				sum+=i;
				System.out.println(i);
			}
		}
		System.out.println("Sum of Prime numbers is a given range is : "+sum);

	}

}
