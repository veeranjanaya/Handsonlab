package collections_Labs;

import java.util.ArrayList;

public class Test_Main {

	public static void main(String[] args) {
		Account account1 = new Account(1001,"Kumar",25000); 
		Account account2 = new Account(1002,"Shanthi", 5000); 
		Account account3 = new Account(1003,"Kavya",25000); 
		Account account4 = new Account(1004,"Mohan",5000); 
		Account account5 = new Account(1005,"Dinesh",22000); 
		
		ArrayList<Account> accountList = new ArrayList<>();
		accountList.add(account1);
		accountList.add(account2);
		accountList.add(account3);
		accountList.add(account4);
		accountList.add(account5);
		
		BankApp ba = new BankApp();
		
		int samebalance= ba.checkEquality(accountList);
		
		System.out.println(samebalance);

	}

}
