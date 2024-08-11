package com.corejava;

public class Operators 
{
  int a=10;
  int b=20;
  
  public void display1()
  {
	  System.out.println("****Arithmatic Oprators****");
 System.out.println("Addition :"+(a+b));
  System.out.println("Substraction :"+(a-b));
  System.out.println("Multiplication :"+(a*b));
  System.out.println("Division :"+(a/b)); 
  System.out.println();
  }
  
  public void display2()
  {
	  a++;
	  System.out.println("****Unary Oprators****");
	  System.out.println("Post increment :"+a);
	  
	  ++b;
	  System.out.println("Preceremnt :"+b);	 
	  
	  a--;
	  System.out.println("Post decrement :"+a);
	  
	  --b;
	  System.out.println("Pre decrement : "+b);
  }
   
   public static void main(String args[])
  {
	  Operators obj=new Operators();
	  obj.display1();
	  
	  obj.display2();
  }
  
}
