package com.CollectionsFramework;

import java.util.HashSet;

public class HasSetDemo 
{
	public static void main(String args[])
	{
		HashSet<Integer> hs=new HashSet<Integer>();
		System.out.println("Is set is empty?: "+hs.isEmpty());
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(20);
		hs.add(null);
		

		System.out.println(hs);
		System.out.println("Total Elements: "+hs.size());
		System.out.println("Search for 50?: "+hs.contains(50));
		
		hs.remove(null);
		
		System.out.println(hs);
	}

}
