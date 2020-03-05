package JavaPractice;

public class ConstructorDemo {
	String DbserverURL1 ="url.com";
	String Dbname;
	String DbUname;
	String DbPWD;
	//class variables
	//constructor initializes the variables
	
	//lets create a constructor--->name is same as Class name, No return Type
	
	public ConstructorDemo(String name, String Uname, String PWD)
	{
		Dbname=name;
		DbUname=Uname;
		DbPWD=PWD;
	}
	
	
	
	public void Readtabledata()
	{
		//String DbserverURL ="url.com";//local Variables
		//String Dbname ="DbName1";
		//String DbUname ="User1";
		//String DbPWD ="password1";
		System.out.println("Started reading data from table: "+ DbserverURL1 + Dbname +  DbUname +  DbPWD);
	}

	
	
}
