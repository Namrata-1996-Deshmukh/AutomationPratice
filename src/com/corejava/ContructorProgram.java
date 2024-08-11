package com.corejava;

public class ContructorProgram 

{
	
		//declare data
		int id;
		String name;
		
		//method
		public void display()
		{
			System.out.println("Student id is: "+id);
			System.out.println("Student name is: "+name);
		}
		
		public static void main(String args[])
		{
			/*
			 * to access member of a class we need Object
			 * 
			 * classname objname(reference name)=new classname()(constructor);
			 * Constructor is used to initialize object
			 * 
			 */
			
			ContructorProgram  s1=new ContructorProgram ();
					//s1.display();
					s1.id=101;
					s1.name="Sam";
					s1.display();
					
		System.out.println("*****************************");
		ContructorProgram  s2=new ContructorProgram ();
			s2.id=102;
			s2.name="Reena";
			s2.display();
					
			
			
		}
		
		
		
		
		
		

	}
	
	

