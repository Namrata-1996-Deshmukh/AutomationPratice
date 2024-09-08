package com.AssignmentCotrolFlow;

import java.util.Scanner;

public class PositiveNegativNum 
{
	//write a java program to read number from the user and test whether it is positive or negative
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check Positive or negative number");
		int num=sc.nextInt();
		
		
		if(num>0)
		{
			System.out.println("Number is Positive");
		}
		else
		{
			System.out.println("Number is Negative");
		}
		sc.close();
				
	}

}
