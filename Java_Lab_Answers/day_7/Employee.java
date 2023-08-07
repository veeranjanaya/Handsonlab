package day_7;

import day_8.Lab_5.IdGenerator;

public class Employee implements IEmployee{
	private long id;
	private String name;
	
	public Employee(String name) {
		this.id = IdGenerator.generateIdEMP();;
		this.name = name;
	}
	@Override
	public void setId(long id) {
		this.id=id;
	}
	@Override
	public long getId() {
		return id;
	}
	@Override
	public void setName(String name) {
		this.name=name;
	}
	@Override
	public String getName() {
		return name;
	}

}
