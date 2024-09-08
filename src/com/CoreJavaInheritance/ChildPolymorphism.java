package com.CoreJavaInheritance;

public class ChildPolymorphism extends Parentpolymorphism
{
	@Override
	public void color()
	{
	 System.out.println("I like Blue color");	
	}



	public static void main(String args[])
	{
		ChildPolymorphism c1=new ChildPolymorphism();
		c1.color();
	}
}
