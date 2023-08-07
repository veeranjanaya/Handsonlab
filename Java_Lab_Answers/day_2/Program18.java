/*
 * 18. Write a program to check if the string is a palindrome
 */
package day_2;

import java.util.Scanner;

public class Program18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
		String string1=sc.next();
		String string2="";
		for(int i=string1.length()-1;i>=0;i--) {
			string2+=string1.charAt(i);
		}
		if(string1.equals(string2)) {
			System.out.println("Given String is Palindrome");
		}else {
			System.out.println("Given String is not Palindrome");
		}
		sc.close();

	}

}
