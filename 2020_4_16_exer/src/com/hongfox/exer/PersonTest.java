package com.hongfox.exer;

public class PersonTest {
	public static void main(String[] args) {
		Person hong = new Person();
		hong.age = 23;
		hong.sex = 1;
		hong.name = "yanhong hong";
		
		hong.study();
		hong.showAge();
		hong.addAge(2);
		hong.showAge();
	}
}
