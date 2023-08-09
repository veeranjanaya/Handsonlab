//32. Write a program to store N elements in an array of integer. Display the elements. Accept a 
//number to be searched. Display whether the number is found or not in the array (LINEAR 
//SEARCH).
package day_3;

import java.util.Scanner;

public class Program32 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element to be searched :");
		int n=sc.nextInt();
		boolean status=false;
		for(int i=0;i<=arr.length-1;i++) {
			if(n==arr[i]) {
				status=true;
				break;
			}
		}
		if(status) {
			System.out.println("Element found");
		}else {
			System.out.println("Element not found");
		}
		sc.close();

	}

}
