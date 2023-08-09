package day_4.Lab_2;

import java.util.Scanner;

public class AccManager {
	public void fillAccountData(Account a1) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account number : ");
		a1.setAccNo(sc.next());
		System.out.println("Enter Account Balance : ");
		a1.setBalance(sc.nextDouble());
		System.out.println("Enter Name : ");
		a1.setName(sc.next());
		sc.close();
	}
	public void displayAccountData(Account a1) {
		System.out.println("AccNo : " + a1.getAccNo());
		System.out.println("Name : " + a1.getName());
		System.out.println("Balance : " + a1.getBalance());
	}
}
