package com.hongfox.exer2;

public class ManKind {
	private int sex;
	private int salary;
	
	public ManKind() {
		
	}
	
	public void manOrWoman() {
		if (this.sex == 1) {
			System.out.println("man");
		}else {
			System.out.println("woman");
		}
	}
	
	public void employeed() {
		if (this.salary == 0) {
			System.out.println("no jobs");
		}else {
			System.out.println("jobs");
		}
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}