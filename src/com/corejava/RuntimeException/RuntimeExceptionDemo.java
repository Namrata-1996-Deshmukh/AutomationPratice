package com.corejava.RuntimeException;

import java.util.Scanner;

public class RuntimeExceptionDemo 
{
	int id=101;
	 public void show()
	 {
		 System.out.println(id);
	 }
	public static void main (String args[])
	{
		
		RuntimeExceptionDemo  rl=new RuntimeExceptionDemo ();
	    rl=null;
		rl.show(); //NullPointerException 
		
		/*String s1="Nam101";
		//String to int
		System.out.println(s1+20);
		int num=Integer.parseInt(s1); //NumberFormatException
		System.out.println(num+s1); */
		
		
		
		
		
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter valu to find index");
		int index =sc.nextInt();
		
		int arr[]= {10,20,30,40};
		System.out.println(arr[index]);//ArrayIndexOutofBounds Exceptions
		*/
		
		
		
		
		
		
		
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers for Arithmic operations :");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("Addition is :"+(a+b));
		
		System.out.println("Substraction is :"+(a-b));
		
		System.out.println("Multiplication is :"+(a*b));
		
		System.out.println("Division is :"+(a/b)); //Arithmetic Exception
		
		*/
		
	}

}
