package com.hongfox.exer1;

public class Student extends Person {
	private long number;
	private int math;
	private int english;
	private int computer;

	public Student() {

	}

	public Student(String name, char sex, int age, long number, int math, int english, int computer) {
		this.setAge(age);
		this.setName(name);
		this.setSex(sex);
		this.number = number;
		this.math = math;
		this.english = english;
		this.computer = computer;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getComputer() {
		return computer;
	}

	public void setComputer(int computer) {
		this.computer = computer;
	}

	public double aver() {
		return (math + english + computer) / 3;
	}

	public int max() {
		int max = (math > english) ? math : english;
		return (max > computer) ? max : computer;
	}

	public int min() {
		int min = (math < english) ? math : english;
		return (min < computer) ? min : computer;
	}

}
