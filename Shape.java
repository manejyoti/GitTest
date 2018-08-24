package com.jala;

public class Shape {
	int length,breadth;
	float pi=3.14f;
	float r;
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.length=15;
		r.breadth=20;
		
		r.calculateArea();
		Circle c=new Circle();
		c.r=2.0f;
		c.carea();
		
		// TODO Auto-generated method stub

	}

}

class Rectangle extends Shape
{
	int area;
	public void calculateArea()
	{
		area=length*breadth;
		System.out.println(area);
	}
}
class Circle extends Shape
{
	
	float area1;
	
	public void carea()
	{
		area1=pi*r*r;
		System.out.println(area1);
	}
}

