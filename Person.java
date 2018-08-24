package com.jala;

public class Person {
	private String name;
	Person(String s)
	{
		setname(s);
	}
	public static void main(String []args)
	{
		Staff s=new Staff("jyoti",101);
		s.display();
		
	}

	public void setname(String s)
	{
		name=s;
		
	}
	public String getname()
	{
		return name;
	}
	public void display()
	{
		System.out.println("name of the person is "+name);
	}
}

class Staff extends Person
{
	private int staffid;
	Staff(String name,int staffid)
	{
		super(name);
		setStaffid(staffid);
		
	}

	public int getStaffid()
	{
		return staffid;
	}
	
	public void setStaffid(int staffid)
	{
		this.staffid=staffid;
	}
	public void display()
	{
		super.display();
		System.out.println("staffid is "+staffid);
	}
}
