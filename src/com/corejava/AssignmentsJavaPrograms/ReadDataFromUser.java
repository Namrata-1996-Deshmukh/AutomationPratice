package com.corejava.AssignmentsJavaPrograms;

import java.util.Scanner;

public class ReadDataFromUser 
{

	String firstname;
	String lastname;
	int age;
	String mailid;
	int phoneno;
	
	public void display()
	{
		System.out.println("Enter your name "+firstname);
		System.out.println("Last name is "+lastname);
		System.out.println("Enter your age "+age);
	}
	
	public static void main(String args[])
	{
		ReadDataFromUser r1=new ReadDataFromUser();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your First name  :");
		String firstname=sc.nextLine();
		
		System.out.println("Enter your Last Name  :");
		String lastname=sc.nextLine();
		
		System.out.println("Enter your age  :");
		String age =sc.nextLine();
		
		sc.close();
		
		
		
		
	}
	
}
