//7. Write a program to find the sum of all odd numbers from 1 to N. Accept N. Display the sum. 

package day_1;

import java.util.Scanner;

public class Sum_Of_OddNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the range :");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%2==1) {
				sum+=i;
			}
		}
		System.out.println("Sum of Odd numbers in a given range is : "+sum);

	}

}
