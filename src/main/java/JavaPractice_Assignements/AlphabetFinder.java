package JavaPractice_Assignements;

import java.util.Scanner;

public class AlphabetFinder {

	public static void main(String[] args) {
		
		
	
		Scanner obj1=new Scanner(System.in);
		
		System.out.println("Enter the character in upper case or Lower case : ");
		
		char ch1=obj1.next().charAt(0);
		
		if((ch1>='A') && (ch1<='Z'))
		{
			System.out.println("Upper Case letter");
		}
		else
			
			{
				System.out.println("Lower Case letter");
			}
		}

	}


