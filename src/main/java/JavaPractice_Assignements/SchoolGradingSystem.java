package JavaPractice_Assignements;

import java.util.Scanner;

public class SchoolGradingSystem {

	public static void main(String[] args) {
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter your Marks : ");
		int marks=obj1.nextInt();
		if(marks<25)
		System.out.println("your grade is F ");
		else if(marks>=25 && marks<45)
			System.out.println("your grade is E ");
		else if(marks>=45 && marks<50)
			System.out.println("your grade is D ");
		else if(marks>=50 && marks<60)
			System.out.println("your grade is C ");
		else if(marks>=60 && marks<80)
			System.out.println("your grade is B ");
		else if(marks>=80)
			System.out.println("your grade is A ");
	}

}
