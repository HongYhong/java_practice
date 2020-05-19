package com.hongfox.exer10;

public class SalariedEmployee extends Employee {
	private double monthlySalary;
	


	public SalariedEmployee(String name, int number, MyDate birthday,double monthlySalary) {
		super(name, number, birthday);
		this.monthlySalary = monthlySalary;
	}



	public SalariedEmployee() {
		super();

	}


	@Override
	public double earning() {
		return monthlySalary;
	}
	
	public String toString() {
		return "SalariedEmployee[" + super.toString() + "]";
	}

}
