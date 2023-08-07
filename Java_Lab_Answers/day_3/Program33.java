/*
 * 33. Write a program to store N elements in an array of integer. Display the elements. Sort the 
elements. Accept a number to be searched. Display whether the number is found or not in 
the array using BINARY SEARCH.
 */
package day_3;

import java.util.Scanner;

public class Program33 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size : ");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		for(int cycle=1;cycle<=arr.length-1;cycle++) {
			for(int i=0;i<=arr.length-2;i++) {
				if(arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		System.out.print("Enter element to be searched : ");
		int num=sc.nextInt();
		boolean status=false;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==num) {
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
