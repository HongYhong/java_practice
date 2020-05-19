package com.hongfox.exer1;

public class AnimalTest {
	public static void main(String[] args) {
		AnimalTest test = new AnimalTest();
		test.func(new Dog());
		test.func(new Cat());
	}
	
	public void func(Animal animal) {
		animal.eat();
		animal.shout();
	}
}
