package com.jala;

public class Parentclass {
	
	public static void main(String[] args)
	{
		
		
		
		Parent obj1=new Parent();
		obj1.disp();
		Parent c=new Childclass();
		c.disp();
		
		
	}

}

class Parent
{
	protected int d=12;
	protected void assign()
	{
		System.out.println(d);
	}
	public void disp()
	{
		System.out.println("parent class is called");
	}
}
class Childclass extends Parent
{
	public void disp()
	{
		System.out.println("child class is called");
	}
}