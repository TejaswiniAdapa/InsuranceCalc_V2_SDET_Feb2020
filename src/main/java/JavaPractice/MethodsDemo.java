package JavaPractice;

public class MethodsDemo {
	
	public void addition() //No return Value- No parameters
	{
		//actual method body
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Addition of 2 numbers is : "+ c);
	}
	
	//parameterized method
	public void mul(int a, int b) //no return value- 2 Parameters which are passed while we are calling the method in Main method
	{
		
		int c=a*b;
		System.out.println("Multiplication of 2 numbers is : "+ c);	
	}

	public int sub(int a,int b) 
	{

		int c=a-b;
		System.out.println("Substraction of 2 numbers is : "+ c);
		return c;	
	}
	
	public static void main(String[] args) {
		
		MethodsDemo m=new MethodsDemo();
		m.addition();
		m.mul(10, 10);//caller who calls the method
		m.sub(10, 15);
		int n=m.sub(10, 20);
		System.out.println("This is a return value"+ n);
		
	}

}
