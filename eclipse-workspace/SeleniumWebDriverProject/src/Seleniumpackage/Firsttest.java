package Seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firsttest 
{

	public static void main(String[] args) 
	{
		
		
		//Setup the chrome driver 
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Adapa Teja\\eclipse-workspace\\SeleniumWebDriverProject\\Drivers\\geckodriver.exe");
		//Launch the browser by calling driver object using chromedriver() class
		WebDriver driver= new FirefoxDriver();
		
		//Navigate to AUT
		driver.get("http://demo.automationtalks.com/");
		
		//The below line is to print title of the page
		
		System.out.println(driver.getTitle());
		
		//verify the title of page by comparing Expected and actual output
		String expectedoutput="Fill Vehicle Data";
		
		String actualoutput=driver.getTitle();
		
		
		if(expectedoutput.equalsIgnoreCase(actualoutput)) 
		{
			System.out.println("Test case is passed");
	    }
		else
		{
			System.out.println("Test case is failed");
		}
		driver.close();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adapa Teja\\eclipse-workspace\\SeleniumWebDriverProject\\Drivers\\chromedriver.exe");
		//Launch the browser by calling driver object using chromedriver() class
		WebDriver driver1= new ChromeDriver();
		
		//Navigate to AUT
		driver1.get("http://demo.automationtalks.com/");
		
		//The below line is to print title of the page
		
		System.out.println(driver1.getTitle());
		
		//verify the title of page by comparing Expected and actual output
		String expectedoutput1="Fill Vehicle Data";
		
		String actualoutput1=driver1.getTitle();
		
		
		if(expectedoutput1.equalsIgnoreCase(actualoutput1)) 
		{
			System.out.println("Test case is passed");
	    }
		else
		{
			System.out.println("Test case is failed");
		}
		driver.close();
	}


}
