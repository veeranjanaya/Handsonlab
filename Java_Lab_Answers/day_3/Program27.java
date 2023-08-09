/*
 * 27. Write the programs to generate the following outputs. In all the following cases, accept N: 

***** 
***** 
***** 
***** 
: 
N rows

11111 
22222 
33333 
44444 
: 
N rows

12345 
12345 
12345 
12345 
: 
N rows
 

* 
** 
*** 
**** 
: 
N rows

 */
package day_3;

public class Program27 {

	public static void main(String[] args) {
		pattern1(5);
		System.out.println();
		pattern2(5);
		System.out.println();
		pattern3(5);
		System.out.println();
		pattern4(5);
		
	}
	//first program
	public static void pattern1(int n){
		for(int i=0;i<n;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//Second program 
	public static void pattern2(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i);
			}
			System.out.println();
		}	
	}
	//Third program 
	public static void pattern3(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	//Fourth program 
		public static void pattern4(int n) {
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

}
