package com.CoreJavaInheritance;

public class HierarchicalInheritance 
{
 public void m1()
 {
	System.out.println("This is Parent class method m1");
 }
}
class b extends HierarchicalInheritance 
{
	public void m2()
	{
		System.out.println("This is child 1 method m2");
	}
}

class c extends HierarchicalInheritance 
{
	public void m3()
	{
		System.out.println("This is child 2 method m3");
	}
}
class Inheritance
{
	public static void main(String args[])
	{
		System.out.println("Child B");
		b b1=new b();
		b1.m1();
		b1.m2();
		
		System.out.println("Child c");
		c c1=new c();
		c1.m1();
		c1.m3();
		
		System.out.println("Parent class only access m1 method");
		HierarchicalInheritance h1=new HierarchicalInheritance ();
		h1.m1();
		
	}
}
