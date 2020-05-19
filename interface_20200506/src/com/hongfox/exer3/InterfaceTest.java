package com.hongfox.exer3;

/**
 * 
 * @Description 接口练习，关于可比较类
 * @author yanhong hong Email:a524664992@gmail.com
 * @version
 * @data 2020年5月6日下午11:16:38
 *
 *
 *
 */
public class InterfaceTest {
	public static void main(String[] args) {
		ComparableCircle c1 = new ComparableCircle(3.0);
		ComparableCircle c2 = new ComparableCircle(2.0);
		System.out.println(c1.compareTo(c2));
	}
}

interface CompareTo {
	int compareTo(Object o);
}

class Circle {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}

class ComparableCircle extends Circle implements CompareTo {

	public ComparableCircle(double radius) {
		super(radius);
	}

	@Override
	public int compareTo(Object o) {
		if (o == this) {
			return 1;
		}
		if (o instanceof ComparableCircle) {
			ComparableCircle c = (ComparableCircle) o;
			if (getRadius() > c.getRadius()) {
				return 1;
			} else if (getRadius() < c.getRadius()) {
				return -1;
			} else {
				return 0;
			}
		} else {
			return 0;
		}
	}

}
