//22. Write a program to store elements into a N * N matrix of integer. Display whether it is an identity matrix or not.
package day_3;

import java.util.Scanner;

public class Program22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of rows : ");
		int rows=sc.nextInt();
		System.out.print("Enter no of columns : ");
		int columns=sc.nextInt();
		
		int arr[][]=new int[rows][columns];
		System.out.println("Enter matrix elements ; ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		boolean status=true;
		if(rows!=columns) {
			System.out.println("Matrix shouls be square");
		}else {
			for(int i=0;i<rows;i++) {
				for(int j=0;j<columns;j++) {
					if(i!=j && arr[i][j]!=0) {
						status=false;
						break;
					}
					if(i==j && arr[i][j]!=1) {
						status=false;
						break;
					}
				}
			}
		}
		if(status) {
			System.out.println("Identity matrix");
		}else {
			System.out.println("Not Identity matrix");
		}
		sc.close();
	}

}
