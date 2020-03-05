package JavaPractice;

public class DemoMethod {
	
	//Syntax for creating method()-
	//Public-Modifier,Static- return value type, addition-Method name, ()-list of parameters
	public void addition()
	{
		//actual method body
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Addition of 2 numbers is : "+ c);
	}
	
	public static void substarction()
	{
		//actual method body
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Substraction of 2 numbers is : "+ c);
	}
	
	public static void main(String args[]) { // only 1 main method for the entire application
		
		DemoMethod add=new DemoMethod();
		add.addition();
		substarction();
		
		//DemoMethod2 mul=new DemoMethod2();
		DemoMethod2.Multiplication();
		
	}
	

}
