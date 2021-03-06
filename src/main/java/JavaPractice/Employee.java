package JavaPractice;

public class Employee {

	/*
	 * Private Modifier restricts the user to use the variable created outside the
	 * class i.e //when the variables are created as private they can be accessible
	 * only within the class In order to acces there is an indirect method to create
	 * it by using 'Getter & Setter' methods
	 */
	private String ename;
	private int age;
	private String salaryBand;
	private String designation;

	// Getter() is used read the data from user

	public String getEname() {
		String name = ename.toLowerCase().substring(3);
		return name;
	}

	// Setter() is used to print the data for the user

	public void setEname(String ename) {
		if (ename != null) {
			this.ename = ename;
		} else

		{
			this.ename = "N/A";
		}

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSalaryBand() {
		return salaryBand;
	}

	public void setSalaryBand(String salaryBand) {
		this.salaryBand = salaryBand;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
