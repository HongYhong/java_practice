package com.hongfox.exer10;

/**
 * 
 * @Description 抽象类练习
 * @author yanhong hong Email:a524664992@gmail.com
 * @version
 * @data 2020年5月6日下午8:38:01
 *
 *
 *
 */
public abstract class Employee {
	private String name;
	private int number;
	private MyDate birthday;
	
	public Employee() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public MyDate getBirthday() {
		return birthday;
	}

	public void setBirthday(MyDate birthday) {
		this.birthday = birthday;
	}

	public Employee(String name, int number, MyDate birthday) {
		super();
		this.name = name;
		this.number = number;
		this.birthday = birthday;
	}
	
	public abstract double earning();
	
	public String toString() {
		return "name:" + name + "number:" + number + "birthday:" + birthday.toDateString();
	}
	
}
