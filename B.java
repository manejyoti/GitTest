package com.jala;

public class B extends Parent
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
		System.out.println(obj.d);   //Access the PROTECTED fields and methods from any class in different package
		obj.assign();
		

	}

}
