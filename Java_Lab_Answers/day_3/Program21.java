//21. Write a program to store elements into a M * N matrix of integer. Display the matrix and its transpose. 
package day_3;

import java.util.Scanner;

public class Program21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of rows : ");
		int rows=sc.nextInt();
		System.out.print("Enter no of columns : ");
		int columns=sc.nextInt();
		
		int arr[][]= new int[rows][columns];
		
		System.out.println("Enter matrix elements");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Normal matrix :");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Transpose Matrix : ");
		for(int i=0;i<columns;i++) {
			for(int j=0;j<rows;j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
