package JavaPractice;

public class ReadDBData {

	public static void main(String[] args) {
		ConstructorDemo demo=new ConstructorDemo("dbname1", "user1", "pass1");
		demo.Readtabledata();
		
		ConstructorDemo demo2=new ConstructorDemo("dbname2", "user2", "pass2");
		demo2.Readtabledata();

	}

}
