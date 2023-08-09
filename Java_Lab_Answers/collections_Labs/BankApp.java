package collections_Labs;

import java.util.ArrayList;

public class BankApp {
	public int checkEquality(ArrayList<Account> accountArray) {
		 int count = 0;

	        for (int i = 0; i < accountArray.size(); i++) {
	            Account currentAccount = accountArray.get(i);
	            double currentBalance =currentAccount.getBalance();
	            for (int j = i + 1; j < accountArray.size(); j++) {
	                Account otherAccount = accountArray.get(j);
	                double otherbalance = otherAccount.getBalance();
	                if (currentBalance==otherbalance) {
	                    count+=2;
	                }
	            }
	        }

	        return count;
	    } 
	}
