package com.hongfox.exer2;

public class Student extends Person {
	protected String school = "pku";
	public String getInfo() {
		return "name:" + name + "age:" + age + "school:" + school; 
	}
}
