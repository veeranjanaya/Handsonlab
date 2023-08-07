package collections_Labs;

public class Account {
	private int accountId;
	private String name;
	private double balance;
	
	public Account(int accountId, String name, double balance) {
		super();
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Account other = (Account) obj;
        return Double.compare(other.balance, balance) == 0;
    }
	
}
