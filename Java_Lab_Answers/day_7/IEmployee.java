/*
 * Realization 
Interface - IEmployee
public void setId(int id);
public int getId();    
public void setName(String name);
public String getName();
Class - Employee
In Test Main display Employee details
 */
package day_7;

public interface IEmployee {
	void setId(long id);
	long getId();    
	void setName(String name);
	String getName();
}
