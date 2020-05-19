package com.hongfox.exer9;

public class CommonEmployee extends Employee {
	
	
	
	public CommonEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CommonEmployee(String name, int id, double salary) {
		super(name, id, salary);
		// TODO Auto-generated constructor stub
	}

	public void work() {
		System.out.println("在车间工作。");
}
}