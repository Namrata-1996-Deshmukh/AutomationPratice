package PolymorphismCompileRunTime;

public class WithReturnkeyword 
{
 int a=10;
 int b=20;
 
 public int add()
 {
	 return a+b;
 }
 public float sub(int a,int b)
 {
	 return a-b;
 }
 public double mul()
 {
	 return a*b;
 }
 
 public int div()
 {
	 return a/b;
 }
 
	public static void main(String args[])
	{
		WithReturnkeyword w1=new WithReturnkeyword();
		int result =w1.add();
		System.out.println("Addition is  :"+result);
		
		float d=w1.sub(50, 30);
		System.out.println("Substraction is :"+d);
		
		double m=w1.mul();
		System.out.println("Multiplication is :"+m);
		
		int d1=w1.div();
		System.out.println("Division is :"+d);
		
	}
}
