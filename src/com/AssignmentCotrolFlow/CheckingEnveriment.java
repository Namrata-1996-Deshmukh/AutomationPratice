package com.AssignmentCotrolFlow;

import java.util.Scanner;

public class CheckingEnveriment 
{

	/*1. Write a java program where ask user to enter environment
	and if it is matching with (dev,prod,qa,stage) then user should get appropriate message like
	"Test is running in QA" */
	
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the envirmnet");
		String env=sc.nextLine();
		
		if(env.equals("Dev"))
		{
			System.out.println("Test is running in :"+env);
		}
		else if(env.equals("Prod"))
		{
			System.out.println("Test is running in :"+env);
		}
		else if(env.equals("QA"))
		{
			System.out.println("Test is running in :"+env);
			
		}
		else if(env.equals("Stage"))
		{
			System.out.println("Test is running in :"+env);
		}
	}
}
