package com.hongfox.java1;

public class StaticTest {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(2.0);
		System.out.println(c2.getTotal());
		System.out.println(c1.getId());
		System.out.println(c2.getId());
		
	}
}

class Circle{
	private double radius = 1.0;
	private int id;
	
	private static int init = 1001;
	private static int total=0;
	
	public Circle() {
		id = init++;
		total++;
	}
	
	public Circle(double radius) {
		this();
		this.radius = radius;
	}
	
	public double findArea() {
		return radius * radius * Math.PI;
	}
	
	public static int getTotal() {
		return total;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
