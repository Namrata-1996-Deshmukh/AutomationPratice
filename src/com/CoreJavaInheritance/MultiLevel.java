package com.CoreJavaInheritance;

public class MultiLevel 
{
 public void m1()
 {
	 System.out.println("This is Parents class method1");
 }
}
class Multilevel1 extends MultiLevel 
{
	public void m2()
	{
		System.out.println("This is child class method1 ");
	}
}
class Multilevel2 extends Multilevel1 
{
	public void m3()
	{
		System.out.println("This is sub child  (Multilevel) ");
	}
}
 class MultilevelInheritance
{
	 public static void main(String args[])
	 {
	 
	Multilevel2 m=new Multilevel2 ();
	m.m1();
	m.m2();
	m.m3();
	
	 }	
}