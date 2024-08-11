package com.corejava.AssignmentsJavaPrograms;

public class OperatorsUsingMethod 
{

	/*Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers
	Declare two variables and used in all methods ,Create a separate methods for 
	add(),sub(),mul(),div(),mod() and call methods using object */
	
	int a=125;
	int b=24;
	
	public void add()
	{
		System.out.println("Addition :"+(a+b));
	
	}
	public void sub()
	{
		System.out.println("Substarction :"+(a-b));
	}
	public void mul()
	{
		System.out.println("Multiplication :"+(a*b));
	}
	public void div()
	{
		System.out.println("Division:"+(a/b));
	}
	public void mod()
	{
		System.out.println("Mod operation :"+(a%b));
	}
	public static void main(String args[])
	{
		OperatorsUsingMethod obj= new OperatorsUsingMethod();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
		obj.mod();
		
	}
}
