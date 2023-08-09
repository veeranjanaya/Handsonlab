//4. Write a program to accept a double value. Separate the whole value from the fractional value 
//and store them in two variables. Display the same.
package day_1;

import java.util.Scanner;

public class Seperate_WholeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the double Value : ");
		double num=sc.nextDouble();
		int number=(int) num;
		double fractional = num-number;
		System.out.println("Integer value is : "+number);
		System.out.println("Fractional value is : "+fractional);
		System.out.printf("Fractional value is : %.3f", fractional);

	}

}
