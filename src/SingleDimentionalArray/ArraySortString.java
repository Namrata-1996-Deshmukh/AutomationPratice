package SingleDimentionalArray;

import java.util.Arrays;

public class ArraySortString 
{
	
public static void main (String args[]) 
{
	int num[]= {100,56,77,120,20};
	
	for(int i:num)
	{
		System.out.println(i);
	}

	System.out.println("Sorted Array is: ");
	Arrays.sort(num);
	
	for(int i:num)
	{
		System.out.println(i);
	}
	
}
	
}
