package com.hongfox.exer3;

public class Circle {
	private double radius;
	
	public Circle() {
		this.radius = 1;
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius *radius * 3.14;
	}
}
