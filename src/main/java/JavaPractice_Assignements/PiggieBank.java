package JavaPractice_Assignements;

public class PiggieBank {

	public static void main(String[] args) {
	
		AddAmount ASavings=new AddAmount();
		System.out.println("The Amount in your Piggie Bank : "+ASavings.Amount);
		
		AddAmount FSavings=new AddAmount(20);
		System.out.println("The Amount in your Piggie Bank : "+FSavings.Amount);

	}

}
