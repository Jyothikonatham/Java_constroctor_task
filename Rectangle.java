package com.constructor;

public class Rectangle {
	public int length;
	public int breadth;

public Rectangle() {
	
}
public Rectangle(int len, int bre) {
	length = len;
	breadth = bre;
	System.out.println("Length of the rectangle :" + length);
	System.out.println("Breadth of the rectangle :" + breadth);
}

public int area() {
	int res = length*breadth;
	System.out.println("Area of the Rectangle :"+ res);
	return res;
}
public static void main(String[] args) {
	Rectangle rect = new Rectangle(20,30);
	rect.area();
}
}