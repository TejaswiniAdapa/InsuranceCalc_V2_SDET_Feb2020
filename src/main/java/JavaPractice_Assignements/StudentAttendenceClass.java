package JavaPractice_Assignements;

import java.util.Scanner;

public class StudentAttendenceClass {
	

	public static void main(String[] args) {
		String s1="Y";
		String s2="N";
		Scanner obj1=new Scanner(System.in); ////read the data from user
		System.out.println("No of classes held : "); //prompt the user to enter the data
		int Held_class=obj1.nextInt(); //store the data

		System.out.println("No of classes attended : "); //prompt the user to enter the data
		int Attend_class=obj1.nextInt(); ////store the data in a variable
		
		System.out.println("Enter Y or N for medical cause");
		String choice;
		choice=obj1.nextLine();
		
		//This is used to find the percentage of attendence
		float Exam=0;
		 Exam=(Attend_class/Held_class)*100;
		//The following is used to compare with 75% to allow the student write exam
		if(Exam<=75)
		{
			if(choice.equalsIgnoreCase(s1)) 
				{System.out.println("You can sit in Exam");}
		}
		else if(choice.equalsIgnoreCase(s2))
			System.out.println("you are not allowed to sit in Exam");
		
		//{System.out.println("Student is allowed for writing Exam");}
		
		//else 
		//{System.out.println("Student is not allowed for writing Exam");}
	}

}
