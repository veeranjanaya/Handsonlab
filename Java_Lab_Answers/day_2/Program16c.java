//c. 1, 2, 4, 6, 7,10, 10,14… N 
package day_2;

import java.util.Scanner;

public class Program16c {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter range : ");
		int n=sc.nextInt();
		int even=2,odd=1;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.print(even+" ");
				even+=4;
			}else {
				System.out.print(odd+" ");
				odd+=3;

			}
		}
		sc.close();

	}

}
