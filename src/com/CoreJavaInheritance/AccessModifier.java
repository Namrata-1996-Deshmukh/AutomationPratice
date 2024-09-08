package com.CoreJavaInheritance;

public class AccessModifier 
{
	int id=101;
	String name="Namrata";
	private long num=123456789L;
	protected int accno=123456789;
	
	public static void main(String args[])
	{
		AccessModifier a1=new AccessModifier();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.num);
		System.out.println(a1.accno);
		
		
	}

}
