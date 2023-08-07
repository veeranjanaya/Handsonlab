package collections_Labs6;

import java.util.Set;
import java.util.TreeSet;

public class Test_Main {

	public static void main(String[] args) {
		   Set<Account> accountSet = new TreeSet<>(new SortAccountId());
	        accountSet.add(new Account(1001, "Kishore", 5000.0));
	        accountSet.add(new Account(1003, "Bhanu", 3000.0));
	        accountSet.add(new Account(1002, "Dileep", 4000.0));

	        System.out.println("Sorted by Account ID:");
	        displayAccounts(accountSet);

	        accountSet = new TreeSet<>(new SortName());
	        accountSet.add(new Account(1001, "Kishore", 5000.0));
	        accountSet.add(new Account(1003, "Bhanu", 3000.0));
	        accountSet.add(new Account(1002, "Dileep", 4000.0));

	        System.out.println("\nSorted by Name:");
	        displayAccounts(accountSet);

	        accountSet = new TreeSet<>(new SortBalance());
	        accountSet.add(new Account(1001, "Kishore", 5000.0));
	        accountSet.add(new Account(1003, "Bhanu", 3000.0));
	        accountSet.add(new Account(1002, "Dileep", 4000.0));

	        System.out.println("\nSorted by Balance:");
	        displayAccounts(accountSet);
	    }

	    public static void displayAccounts(Set<Account> accounts) {
	        for (Account account : accounts) {
	            System.out.println(account);
	        }

	}

}
