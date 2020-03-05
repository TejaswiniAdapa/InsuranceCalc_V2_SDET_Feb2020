package JavaPractice_Assignements;

public class Student 
{
	//
	String Student_Name= "Unknown";
	String Roll_No="N/A";
	
	public Student()
	{
		
	}
	
	public Student(String sname, String rno)
	{
		Student_Name=sname;
		Roll_No=rno;
	}
	
	
	
	public static void main(String[] args) 
	{
		
		Student sname=new Student();
		System.out.println("Student Name: " + "  "  +sname.Student_Name +"\n" +" RollNo : " + " "+ sname.Roll_No);
		
		Student sname1=new Student("Teja", "10P61A05B1");
		System.out.println("Student Name :  " +"  "+sname1.Student_Name + "\n" +" RollNo : " + sname1.Roll_No);
		
		
		

	}

}
