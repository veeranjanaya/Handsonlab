//24. Write a program to add, subtract and multiply two matrices
package day_3;

import java.util.Scanner;

public class Program24 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter rows : ");
		int rows=sc.nextInt();
		System.out.print("Enter columns : ");
		int columns=sc.nextInt();
		
		int arr[][]= new int[rows][columns];
		int arr1[][]=new int[rows][columns];
		
		System.out.println("Enter first matrix elemnts ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Second matrix elemnts ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Addition of Matrix :");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(arr[1][j]+arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Subtraction of Matrix :");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(arr[1][j]-arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Multiplication of Matrix :");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(arr[1][j]*arr1[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
