package JavaPractice_Assignements;

import java.util.Scanner;

public class FindingGreatestNumber {

	public static void main(String[] args) {
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter 1st Integer Number :  ");
		int num1=obj1.nextInt();
		
		Scanner obj2=new Scanner(System.in);
		System.out.println("Enter 2nd Integer Number :  ");
		int num2=obj2.nextInt();
		
		if(num1>num2)
				System.out.println("1st Integer is greater number : "+ "   " +num1);
		else if(num1==num2)
			System.out.println("Both are same numbers"+ "   "+num2);
		else
			System.out.println("2nd Integer is greater number" + "   " +num2);

	}

}
