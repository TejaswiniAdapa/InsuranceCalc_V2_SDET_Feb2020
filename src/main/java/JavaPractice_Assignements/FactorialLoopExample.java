package JavaPractice_Assignements;

import java.util.Scanner;

public class FactorialLoopExample 
{

	public static void main(String[] args) 
	
	{

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number to find Factorial : ");
		int num = obj.nextInt();
		int Fact = 0;
		if (num == 0) 
		{
			Fact = Fact * 0;

			System.out.println("Factorial of " + num + "!" + "=" + Fact);
		}

		else 
		{
			int Fact1 = 1;
			for (int i = 1; i <= num; i++) 
			{
				Fact1 = Fact1 * i;

			}
			System.out.println("Factorial of " + num + "!" + "=" + Fact1);
		}

	}

}
