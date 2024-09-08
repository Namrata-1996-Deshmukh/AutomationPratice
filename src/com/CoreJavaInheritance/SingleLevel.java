package com.CoreJavaInheritance;

public class SingleLevel 
{
 public void m1()
 {
	 System.out.println("This is parent class method"); 
 }
 
}

 class SingleLevel2 extends SingleLevel
{
	public void m2()
	{
		System.out.println("This is child class method ");
	}
}
class Demo
{
	public static void main(String args[])
 {
	SingleLevel2 s2=new SingleLevel2();
	s2.m1();
	s2.m2();
	 
  }
}
