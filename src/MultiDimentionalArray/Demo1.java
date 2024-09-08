package MultiDimentionalArray;

public class Demo1 
{
	public static void main(String args[])
	{
	int id[][]=new int[3][2];
	
	id[0][0]=10;
	id[0][1]=20;
	
	id[1][0]=30;
	id[1][1]=40;
	
	id[2][0]=50;
	id[2][1]=60;
	
	System.out.println("Number of rows : "+id.length);
	
	System.out.println(id[0][1]);
	
	//for each loop
	
	for(int i[]:id)
	{
		for(int j:i)
		{
			System.out.print(j+"  ");
		}
		System.out.println();
	}
	
	}
}

