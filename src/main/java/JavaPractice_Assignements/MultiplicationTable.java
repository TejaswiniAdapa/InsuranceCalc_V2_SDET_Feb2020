package JavaPractice_Assignements;

public class MultiplicationTable {
	
	public void table24()
	{
		for(int j=1;j<=10;j++)
		{
			int k=24*j;
			
			System.out.println("24 * "+ j + ' '+'='+k);
		}
	}

	
	public void table50()
	{
		for(int j=1;j<=10;j++)
		{
			int k=50*j;
			
			System.out.println("50 * "+ j + ' '+'='+k);
		}
	}

	
	public void table29()
	{
		for(int j=1;j<=10;j++)
		{
			int k=29*j;
			
			System.out.println("29 * "+ j + ' '+'='+k);
		}
	}

	public static void main(String[] args) {
		
		MultiplicationTable obj1=new MultiplicationTable();
		
		System.out.println("Multiplication table for 24 ");
		obj1.table24();
		System.out.println("**********************************************************");
		System.out.println("Multiplication table for 50 ");
		obj1.table50();
		System.out.println("**********************************************************");
		System.out.println("Multiplication table for 29 ");
		obj1.table29();
		
	
		

		
		

	}

}
