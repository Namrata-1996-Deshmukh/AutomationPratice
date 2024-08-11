package PolymorphismCompileRunTime;

public class CompileTimeWithoutReturn
{

	int a=20;
	int b=10;
	
	public void add()
	{
		System.out.println("Addition is :"+(a+b));
	}
	
	public void add(double e,double d)
	{
		System.out.println("Substraction is :"+(e-d));	
	}
	
	public void add(int c,int d)
	{
		System.out.println("Multiplication is :"+(c*d));
	}
	
	
	
	  public static void main(String args[])
	{
		CompileTimeWithoutReturn c1 =new CompileTimeWithoutReturn ();
		
		c1.add();// without parameter
		c1.add(20, 5.5); // Passing parameter
		c1.add(10, 20);
		
		}
	
}
