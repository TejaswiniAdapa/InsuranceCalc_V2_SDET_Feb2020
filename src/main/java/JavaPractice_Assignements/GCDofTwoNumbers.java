package JavaPractice_Assignements;

import java.util.Scanner;

public class GCDofTwoNumbers {

	public static void main(String[] args) {
	Scanner obj1=new Scanner(System.in);
	System.out.println("Enter the numbers to GCD");
	int num1=obj1.nextInt();
	int num2=obj1.nextInt();
	int gcd=1;
	for(int i=1;(i<=num1)&&(i<=num2);i++)
	{
		if(num1%i==0 && num2%i==0)
		{
			 gcd=i;
			
		}

	}
	System.out.println("GCD of " + num1 + ','+ num2 +'='+gcd);
	
	}

}
