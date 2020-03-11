package JavaPractice_Assignements;

import java.util.Scanner;

public class FindingAvgUsingLoops {

	public static void main(String[] args) {
		
		Scanner obj2=new Scanner(System.in);
		int sum=0;
		for (int i=0;i<=10;i++)		
		{
			System.out.println("Enter the number : ");
			sum=sum+obj2.nextInt();
			
		}
		System.out.println("Avg of numbers : "+ sum);
		}

	}
