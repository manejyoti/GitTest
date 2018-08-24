package com.jala;

interface Car {
	int speed=60;
	public void distancetravelled();
	

}
interface Bus
{
	int distance=100;
	public void speed();
}
class Vehicle implements Car,Bus
{
	int avgspeed;
	int distanctravel;
	
	
	public static void main(String []args)
	{
		Vehicle v1=new Vehicle();
		v1.speed();
		v1.distancetravelled();
	}
	public void speed()
	{
		avgspeed=distanctravel/speed;
		System.out.println(avgspeed);
		
		
	}
	public void distancetravelled()
	{
		distanctravel=speed*distance;
		System.out.println(distanctravel);
	}
}
