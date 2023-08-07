/*
 * 30. Write a program to calculate the LCM of any no. of numbers 
 */
package day_3;

import java.util.Scanner;

public class Program30 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers one by one :");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int hcf=0;
		int lcm=0;
		for(int a=1;a<=n1&&a<=n2;a++){
			if(n1%a==0&&n2%a==0){
				hcf=a;
			}
			lcm=(n1*n2)/hcf;
		}
		System.out.println("LCM is :"+lcm);
		sc.close();
	}
}
