package com.hongfox.exer2;

public class InstanceTest {
	public static void main(String[] args) {
		InstanceTest test = new InstanceTest();
		test.method(new Person());
		System.out.println("****************************************************");
		test.method(new Student());
		System.out.println("****************************************************");
		test.method(new Undergraduate());
	}
	
	public void method(Person e) {
		System.out.println(e.getInfo());
		if (e instanceof Undergraduate) {
			System.out.println("a graduate student.");
			System.out.println("a student.");
			System.out.println("a person.");
		}else if(e instanceof Student){
			System.out.println("a student.");
			System.out.println("a graduate student.");
		}else {
			System.out.println("a Person");
		}
	}
}
