package com.LoopDemos;

public class Forloop 
{

	public static void main (String args[])
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Welcome");
		
			
		}
		System.out.println("**************************");
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*" + " ");
		
			}System.out.println();
			
		}
		System.out.println("**************************");
		
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=1;j++)
			{
				System.out.println("*" + " ");
				
			}
		}
		 /*  Print table */
		for(int num=1;num<10;num++)
		{
			for(int i=1;i<10;i++)
			{
				System.out.println(num*i  +"");
			}
		}System.out.println();
	}
	
	
}
