package JavaPractice_Assignements;

import java.util.Scanner;

public class AgeClassFinder {

	public static void main(String[] args) {
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter 1st person age : ");
		int Age1=obj1.nextInt();
		
		System.out.println("Enter 2nd person age : ");
		int Age2=obj1.nextInt();
		
		System.out.println("Enter 3rd person age : ");
		int Age3=obj1.nextInt();
		
		int older=0;
		int younger=0;

		if((Age1>Age2) && (Age1>Age3) ) {older=Age1;}
		if((Age2>Age3) && (Age2>Age1 )) {older=Age2;}
		if((Age3>Age1) && (Age3>Age2 )) {older=Age3;}
	
		
		if((Age1<Age2) && (Age1<Age3) ) {younger=Age1;}
		if((Age2<Age3) && (Age2<Age1) ) {younger=Age2;}
		if((Age3<Age1) && (Age3<Age2) ) {younger=Age3;}
	System.out.println("youngest persons age is : " +younger + "and older person is : " +older);
			
	}

}
