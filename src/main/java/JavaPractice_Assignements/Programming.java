package JavaPractice_Assignements;

public class Programming {
	
	String Prog_var1= " I love";
	String Prog_var2=" Programming languages";

	public Programming()
	{
		
	}
	
	public Programming(String Con_var2)
	{
		Prog_var2=Con_var2;
	}
	
	
	public static void main(String[] args) {
		Programming obj1=new Programming();
		System.out.println(obj1.Prog_var1+obj1.Prog_var2);

		Programming obj2=new Programming(" Java");
		System.out.println(obj2.Prog_var1+obj2.Prog_var2);
	}

}
