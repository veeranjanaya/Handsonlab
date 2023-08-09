package day_7;

import java.util.Scanner;

public class Test_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account savingsaccount = new SavingsAccount();
		System.out.println("Enter Account Number : ");
		savingsaccount.setId(sc.nextInt());
		System.out.println("Enter Account Holder Name : ");
		savingsaccount.setName(sc.next());
		System.out.println("Enter Account Balance : ");
		((SavingsAccount) savingsaccount).setBalance(sc.nextDouble());
		sc.close();
		
		System.out.println("Name Of the Account Holder is : "+savingsaccount.getName());
		System.out.println("Account Number is : "+savingsaccount.getId());
		System.out.println("Balance Present in the Account is : "+((SavingsAccount) savingsaccount).getBalance());
	}

}
