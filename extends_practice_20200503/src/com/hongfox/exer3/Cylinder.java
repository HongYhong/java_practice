package com.hongfox.exer3;

public class Cylinder extends Circle {
	private double length;

	public Cylinder() {
		this.length = 1;
	}

	public Cylinder(int length) {
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getVolume() {
		return getArea() * length;
	}

}
