package com.corejava.AssignmentsJavaPrograms;

public class AreaAndPrimeter 
{

	float l=(float) 5.6;
	float b=(float) 8.5;
	
	public void rect() 
	{
		System.out.println("Area of reactangle :"+(l*b));
		System.out.println("Perimeter of Rectangle :"+(2*(l+b)));
	}
	public static void main(String args[])
	{
		AreaAndPrimeter a1=new AreaAndPrimeter();
		a1.rect();
	}
	
}
