package com.AssignmentCotrolFlow;

import java.util.Scanner;

public class EvenOdd 
{

	// write a java program to read number from the user and test whether it is even or odd

	
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Number is Even");
		}
		else 
		{
			System.out.println("Number is odd");
		}
		
	}
	
}
