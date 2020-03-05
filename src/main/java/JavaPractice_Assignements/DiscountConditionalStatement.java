package JavaPractice_Assignements;

import java.util.Scanner;

public class DiscountConditionalStatement 
{
	Scanner obj1=new Scanner(System.in);
	int purchase_price=obj1.nextInt();
	

	public void MethodToFinddiscount()
	{
		
		if(purchase_price>1000){
			double final_price=0.1*purchase_price;
			System.out.println("you got a discount price" + "   " +final_price);
		}
		
		else
		{
			System.out.println("you dont get the discount price"  );
		}
	}

	
	public static void main(String[] args) 
	{
		
		System.out.println("Enter purchase amount : ");
		DiscountConditionalStatement dis=new DiscountConditionalStatement();
		dis.MethodToFinddiscount();
		
	}

}
