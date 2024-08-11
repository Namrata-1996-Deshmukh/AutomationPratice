package PolymorphismCompileRunTime;

public class CompileTime 
{
	int a=30;
	float b=70;
	
	public void add()
	{
		System.out.println("Addition without passing valu :"+(a+b));
		
	}
	public void add(int a,int b)
	{
		System.out.println("Addition with passing integer valu :"+(a+b));
	
	}

	public void add(int a,float b)
	{
		System.out.println("Addition usking intger and float value :"+(a+b));
	}
	
	public static void main(String args[])
	{
		CompileTime c1=new CompileTime();
		c1.add();
		c1.add(10, 20);
		c1.add(50, 25.20f);
	}
}
