package com.corejava.AssignmentsJavaPrograms;

public class SwapNumbers 
{

	int a=10;
	int b=20;
	
	
	public void swap()
	{
		int c = a; 
		a = b;
		b = c;
		System.out.println("swapping numbers :"+a);
		System.out.println("swapping numbers :"+b);
	}
	public static void main(String args[])
	{
		SwapNumbers s=new SwapNumbers();
		s.swap();
		
	}
}
