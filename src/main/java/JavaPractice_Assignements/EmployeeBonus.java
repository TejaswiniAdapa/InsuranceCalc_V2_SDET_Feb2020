package JavaPractice_Assignements;

import java.util.Scanner;

public class EmployeeBonus {
	
	

	public static void main(String[] args) {
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter your Salary : ");
		int sal=obj1.nextInt();
		
		System.out.println("Enter your work years : ");
		int exp_yrs=obj1.nextInt();
		
		
		if(exp_yrs>5)
		{
			double bonus=0.05*sal;
			
			System.out.println("you have received a 5% bonus for your service : "+ bonus);
		}
		else
		System.out.println("No BONUS received as your experience is less tha 5years : "+ exp_yrs);
	}

}
