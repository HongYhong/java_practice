package com.hongfox.exer3;

public class GeometricTest {
	public static void main(String[] args) {
		Circle c1 = new Circle("yellow", 1.0, 1.0);
		Circle c2 = new Circle("red" , 1.00 , 1.00);
		MyRectangle r1 = new MyRectangle("blue", 1.00, 2.00, 3.00);
		GeometricTest test = new GeometricTest();
		System.out.println(test.equalsArea(c1, c2));
		System.out.println(test.equalsArea(c1, r1));
		test.displayGeometricObject(r1);
		test.displayGeometricObject(c1);
		test.displayGeometricObject(c2);
		
	}
	
	public boolean equalsArea(GeometricObject obj1,GeometricObject obj2) {
		return obj1.findArea() == obj2.findArea();
	}
	
	public void displayGeometricObject(GeometricObject obj) {
		System.out.println(obj.findArea());
	}
}
