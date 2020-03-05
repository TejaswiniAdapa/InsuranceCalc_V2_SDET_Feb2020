package JavaPractice_Assignements;

import java.util.Scanner;

public class TakeInputPrintOutput {

	public static void main(String[] args) {
		
		Scanner obj1=new Scanner(System.in); ////read the data from user
		System.out.println("Enter the Input : "); //prompt the user to enter the data
		int Input=obj1.nextInt(); //store the data 
		int output=1;
		if(Input==output) {System.out.println("Result is as expected : "+output);}
		else {System.out.println("Result is not as expected "+ "\n" + "Expected input is : "+output);}
	}

}
