package AccessModifier;

public class PublicPrivateDefault 
{
 
 String name;
 int age;
 int phonno;
 
 public void disblay()
 {
	 System.out.println("Name is :"+name);
 }
	private void display1()
	{
		System.out.println("Age is :"+age);
	
	}
	public static void main(String args[])
	{
		PublicPrivateDefault p1= new PublicPrivateDefault();
		 
		
		
	}
	
}
