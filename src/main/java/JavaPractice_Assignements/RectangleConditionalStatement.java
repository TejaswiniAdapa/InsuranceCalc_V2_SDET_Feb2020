package JavaPractice_Assignements;

import java.util.Scanner;

public class RectangleConditionalStatement 
{

	
	public static void main(String[] args)
	{
		
		
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter the length of Rectangle : ");
		
		
		String length=obj1.nextLine();
		Scanner obj2=new Scanner(System.in);
		System.out.println("Enter breadth of Recatngle : ");
		String breadth=obj2.nextLine();
		
		if(length.equalsIgnoreCase(breadth))
				System.out.println("Hurray ! It is a Square");
		else
			System.out.println("Sorry ! It is not Square");

	}

}
