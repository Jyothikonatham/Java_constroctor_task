package com.constructor;

public class Circle {
	public double radius;
	
	public Circle() {
		radius=4;
		System.out.println("Radius of the circle :" + radius);
	}
	
	public double getArea() {
	double area=3.14*radius*radius;
	System.out.println("Area of the Circle :" + area);
		return area;
	}
	public double getCircumference() {
		double circumference=2*3.14*radius;
		System.out.println("Circumference of the Circle :" + circumference );
		return  circumference;
	}
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.getArea();
		c1.getCircumference();
	}
}
