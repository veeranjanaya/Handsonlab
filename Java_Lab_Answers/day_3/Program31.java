/*
 * 29. Write the programs to generate the following outputs. In all the following cases, accept 
N: 
1 
‐4 9 
‐16 25 ‐36 
: 
: 
N rows

1 
1 2 
6 24 120 
: 
: 
N rows

* 
** 
*** 
**** 
: 
N rows

   * 
  *** 
 ***** 
******** 
: 
N rows
 */
package day_3;

public class Program31 {

	public static void main(String[] args) {
		pattern1(5);
		System.out.println();
		pattern2(5);
		System.out.println();
		pattern3(5);
		System.out.println();
		pattern4(5);

	}
	public static void pattern1(int num) {
		int n=1;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				if(n%2==1) {
					System.out.print(n*n+" ");
				}else {
					System.out.print(-(n*n)+" ");
				}
				n+=1;
			}
			System.out.println();
		}
	}
	public static void pattern2(int num) {
		int n=1,product=1;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				n*=product;
				System.out.print(n+" ");
				n+=1;
			}
			product+=1;
			System.out.println();
		}
	}
	public static void pattern3(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void pattern4(int num) {
		for(int i=1;i<=num;i++) {
			for(int space=num-i;space>=1;space--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
