package com.hongfox.exer7;

public class BlockTest {
	public static void main(String[] args) {
		System.out.println(Person.desc);
		Person p1 = new Person();
		Person p2 = new Person();
	}
}

class Person{
	private int age;
	private String name;
	static double desc;
	
	public Person() {
		
	}
	
	public Person(int age,String name,double desc) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	static {
		System.out.println("hello.");
		desc = 1.0;
		showInfo();
	}
	
	{
		System.out.println("aabb");
	}
	
	private static void showInfo() {
		System.out.println("hello,hong!");
	}
}