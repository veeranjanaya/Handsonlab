/*
 * 28. Write the programs to generate the following outputs. In all the following cases, accept N: 
1 
12 
123 
1234 
: 
N rows

1 
22 
333 
4444 
: 
N rows

1 
2 3 
4 5 6 
7 8 9 10 
: 
N rows

1 
1 2 
3 5 8 
: 
: 
N rows
 */
package day_3;

public class Program28 {

	public static void main(String[] args) {
		pattern1(5);
		System.out.println();
		pattern2(5);
		System.out.println();
		pattern3(5);
		System.out.println();
		pattern4(5);
	}
	public static void pattern1(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void pattern2(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	public static void pattern3(int n) {
		int num=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
	public static void pattern4(int n) {
		int a=0,b=1,c=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				c=a+b;
				System.out.print(b+" ");
				a=b;
				b=c;
			}
			System.out.println();
		}
	}

}
