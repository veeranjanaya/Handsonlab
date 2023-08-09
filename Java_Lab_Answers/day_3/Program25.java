//25. Write a program to accept a decimal number. Display it in the binary form.
package day_3;

import java.util.Scanner;

public class Program25 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.print("Enter decimal value : ");
		int num = in.nextInt();
		int i=1, binary=0, rem=0,temp=num;
		while(num!=0){
		    rem = num%2;
		    binary += i*rem;   
		    num = num/2;
		    i=i*10;
		}
		System.out.println("Number to Binary is :"+temp+"===>"+binary);
		in.close();
		

	}

}
