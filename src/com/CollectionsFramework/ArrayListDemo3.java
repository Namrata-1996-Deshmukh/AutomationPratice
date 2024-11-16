package com.CollectionsFramework;

import java.util.ArrayList;

public class ArrayListDemo3 
{
public static void main (String args[])
{
	
	Employee e1=new Employee(101,"Ram");
	Employee e2=new Employee(102,"Sham");
	Employee e3= new Employee(103,"Gita");
	Employee e4=new Employee(104,"Sita");
	
	ArrayList<Employee>emp=new ArrayList<Employee>();
	emp.add(e1);
	emp.add(e2);
	emp.add(e3);
	emp.add(e4);
	
	System.out.println(emp);
	
	for(Employee i:emp)
	{
		System.out.println(i.empId+" : "+i.name);
		
	}

	
}
}
