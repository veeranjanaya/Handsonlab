package day_3;

import java.util.Scanner;

public class Program35 {
	    public static int gcd(int a, int b) {
	        if (b == 0) {
	            return a;
	        }
	        return gcd(b, a % b);
	    }

	    // Function to calculate the LCM (Least Common Multiple)
	    public static int lcm(int a, int b) {
	        return (a * b) / gcd(a, b);
	    }

	    // Function to calculate the LCM of an array of numbers
	    public static int lcmArray(int[] arr) {
	        int result = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            result = lcm(result, arr[i]);
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.print("Enter arrya size : ");
	    	int size=sc.nextInt();
	        int[] arr = new int[size];
	        System.out.println("Enter array elements");
	        for(int i=0;i<=arr.length-1;i++) {
	        	arr[i]=sc.nextInt();
	        }
	        int lcm = lcmArray(arr);
	        System.out.println("LCM: " + lcm);
	        sc.close();
	    }
}

