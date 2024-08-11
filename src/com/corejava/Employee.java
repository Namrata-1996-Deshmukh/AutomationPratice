package com.corejava;

public class Employee 
{

	int empid;
	String empname;
	
	public void designShow()
	{
		
		System.out.println("Employee id :"+empid);
		System.out.println("Employee name :"+empname);
		System.out.println("");
	}
	public static void main(String args[])
	{
		Employee e1= new Employee();
		System.out.println("Employee Details ");
		e1.designShow();
		
	
		e1.empid=1;
		e1.empname="Namrata";
		e1.designShow();
		
		Employee e2=new Employee();
		e2.empid=2;
		e2.empname="Priya";
		e2.designShow();
		
		Employee e3=new Employee();
		e3.empid=3;
		e3.empname="Bhagyashri";
		e3.designShow();
		
		Employee e4=new Employee();
		e4.empid=4;
		e4.empname="Sonu";
		e4.designShow();
		
		Employee e5=new Employee();
		e5.empid=5;
		e5.empname="Kalyani";
		e5.designShow();
		
	}
}
