//26. Write a program to accept a binary number and display it in the decimal form.
package day_3;

import java.util.Scanner;

public class Program26 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter binary number : ");
		int num = sc.nextInt();
        int dec_value = 0;
 
        // Initializing base
        // value to 1, i.e 2^0
        int base = 1;
 
        int temp = num;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;
 
            dec_value += last_digit * base;
 
            base = base * 2;
        }
        System.out.println(dec_value);
        sc.close();
	}

}
