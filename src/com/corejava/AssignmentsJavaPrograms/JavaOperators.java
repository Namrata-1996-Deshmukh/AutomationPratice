package com.corejava.AssignmentsJavaPrograms;

public class JavaOperators 
{

	//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
	
	int a=125;
	int b=24;
	
	public void display()
	{
	System.out.println("Addition :"+(a+b));
	System.out.println("Substraction :"+(a-b));
	System.out.println("Multiplication : "+(a*b));
	System.out.println("Division "+(a/b));
	System.out.println("Mod operation "+(a%b));
	}
	
	public static void main(String args[])
	{
		JavaOperators obj=new JavaOperators();
		obj.display();
	}
	
	
}
