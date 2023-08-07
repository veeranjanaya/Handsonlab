//23. Write a program to store elements into a N * N matrix of integer. Display whether it is a symmetric matrix or not. 
package day_3;

import java.util.Scanner;

public class Program23 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of rows : ");
		int rows=sc.nextInt();
		System.out.print("Enter no of columns : ");
		int columns=sc.nextInt();
		
		int arr[][] = new int[rows][columns];
		int arr1[][] = new int[rows][columns];
		
		System.out.println("Enter matrix values ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				arr1[j][i]=arr[i][j];
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		boolean status=true;
		for(int i=0;i<columns;i++) {
			for(int j=0;j<rows;j++) {
				if(arr[i][j]!=arr1[i][j]) {
					status=false;
				}
			}
		}
		if(status) {
			System.out.println("Symmetric matrix");
		}else {
			System.out.println("Not a Symmertic matrix");
		}
		sc.close();
	}

}
