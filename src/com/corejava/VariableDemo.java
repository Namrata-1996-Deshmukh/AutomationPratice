package com.corejava;

public class VariableDemo 
{

	int id=10;
	String name="Abc";
	
	public void show()
	{
		System.out.println("Id is:"+id);
		System.out.println("Name is :"+name);
		
	}
	
	public static void  main(String args[])			
	{
		VariableDemo v1=new VariableDemo();
	
		//System.out.println("Student id : "+v1.id);
		//System.out.println("Student name :"+v1.name);
		v1.show();
		
	}
	
}
