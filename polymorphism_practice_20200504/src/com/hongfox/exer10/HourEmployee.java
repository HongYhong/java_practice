package com.hongfox.exer10;

public class HourEmployee extends Employee {
	private double wage;
	private double hour;
	
	public HourEmployee(String name, int number, MyDate birthday,double wage, double hour) {
		super(name, number, birthday);
		this.wage = wage;
		this.hour = hour;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		this.hour = hour;
	}

	@Override
	public double earning() {
		return wage * hour;
	}
	
	public String toString() {
		return "HourEmployee[" + super.toString() + "]";
	}
	
}
