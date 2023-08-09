package collections_Labs6;

public class Account {
	 private int accountId;
	    private String name;
	    private double balance;

	    public Account(int accountId, String name, double balance) {
	        this.accountId = accountId;
	        this.name = name;
	        this.balance = balance;
	    }

	    public int getAccountId() {
	        return accountId;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    @Override
	    public String toString() {
	        return "Account ID: " + accountId + ", Name: " + name + ", Balance: " + balance;
	    }
}
