/*
 * 14. Write a program that takes amount and displays them in words 
a. Input 1234 
b. Output One thousand two hundred and thirty four only
 */
package day_2;

import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		while(temp!=0) {
			int ld=temp%10;
			rev=rev*10+ld;
			temp/=10;
		}
		while(rev!=0) {
			int ld=rev%10;
			switch(ld) {
			case 0:
				System.out.print("zero ");
				break;
			case 1:
				System.out.print("One ");
				break;
			case 2:
				System.out.print("Two ");
				break;
			case 3:
				System.out.print("Three ");
				break;
			case 4:
				System.out.print("Four ");
				break;
			case 5:
				System.out.print("Five ");
				break;
			case 6:
				System.out.print("Six ");
				break;
			case 7:
				System.out.print("Seven ");
				break;
			case 8:
				System.out.print("Eight ");
				break;
			case 9:
				System.out.print("Nine ");
				break;
			}
			rev/=10;
		}
		sc.close();

	}

}
