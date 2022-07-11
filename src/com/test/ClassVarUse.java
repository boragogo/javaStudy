package com.test;

public class ClassVarUse {
	public static void main(String[] args) {
		Circle cl = new Circle(5);
		cl.showPerimeter();
		cl.showArea();
	}
}

class Circle {
	static final double PI = 3.1415;
	
	private double radius;
	
	public Circle(double rad) {
		radius = rad;
	}
	
	// 둘레 출력
	public void showPerimeter()	{
		double peri = (radius * 2) * PI;
		System.out.println("둘레 : " + peri);
	}
	
	// 넓이 출력
	public void showArea() {
		double area = (radius * radius) * PI;
		System.out.println("넓이 : " + area);
	}
}