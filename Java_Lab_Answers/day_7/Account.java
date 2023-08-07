/*
 * Generalization - SavingsAccount(child) Is A Account(parent)
Account - int id, String name
SavingsAccount - double balance
in Test Main - display Account details
 */
package day_7;

public class Account {
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
