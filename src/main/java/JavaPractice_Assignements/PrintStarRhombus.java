package JavaPractice_Assignements;

public class PrintStarRhombus {

	public static void main(String[] args) 
	{
		int a=6;
		int b=a-1;
		
		for (int i=0;i<a;i++) 		//1		
		{
			for(int j=0;j<b;j++)
				System.out.print(" ");
			for(int j=0;j<=i;j++);
				System.out.print("* ");
				System.out.println();
				b--;
			//*
			
		}
		
	}

}