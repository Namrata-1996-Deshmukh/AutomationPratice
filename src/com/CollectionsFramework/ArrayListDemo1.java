package com.CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo1 
{
	public static void main(String args[])
	{
      ArrayList<Integer> al=new ArrayList<Integer>();
      
      System.out.println("Is empty is  : "+al.isEmpty());

     al.add(50);
     al.add(20);
     al.add(30);
     al.add(40);
     al.add(10);
     
     System.out.println(al);
     Collections.sort(al);

     System.out.println(al);

	}

	
}
