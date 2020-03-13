package Demo_Selenium_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Test 
{
	//Execution starts with Main method()
	public static void main(String[] args) 
	//Test steps to perform
	
	/* Step1: Launch the browser
	 * Step2: Navigate to AUT:"http://www.demo.guru99.com/V4/"
	 * Step3: Verify the page title
	 * Step4: Close the Browser
	*/
	
	{
		//Setup the driver property
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Adapa Teja\\eclipse-workspace\\SDET-Training_Selenium practice\\Drivers\\geckodriver.exe" );
		
		//Step1: Launch the browser
		
		WebDriver driver=new FirefoxDriver();
		
		//Step2: Navigate to AUT:"http://www.demo.guru99.com/V4/"
		
		driver.get("http://www.demo.guru99.com/V4/");
		
		//print the title of page to know what exactly the page title is
		
		System.out.println(driver.getTitle());
		
		//Step3: Verify the page title
		
		
		String expectedoutput="Guru99 Bank Home Page";
		String actualoutput=driver.getTitle();
		
		if(expectedoutput.equalsIgnoreCase(actualoutput))
		{
			System.out.println("Test case is passed");
		
		}
		else
		{
			System.out.println("Test case is Failed");
		}
		
		driver.close();

	}

}
