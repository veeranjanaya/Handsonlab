//13. Write a program to display the 1st , 2nd , and 4th multiple of 7 which gives the remainder 1 
//when divided by 2,3,4,5 and 6 
package day_2;

public class Program13 {

	public static void main(String[] args) {
		int multiple = 1;
		int number = 7;
		while(multiple<=4) {
			if(number%2==1 && number%4==1 && number%5==1 && number%6==1) {
				if(number%3!=1) {
					System.out.println(number+" ");
				}
			}
			multiple+=1;
		}
		number+=7;
	}

}
