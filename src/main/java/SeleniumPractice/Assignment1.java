package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
	
		
		/* It will download Chrome driver and configure
		WebDriverManager.Chromedriver().setup(); 
		WebDriver driver = new ChromeDriver(); */
		
		
		/* It will download edge driver and configure
		WebDriverManager.Edgedriver().setup(); 
	    WebDriver driver = new EdgeDriver();
		*/
		

		// It will download Firefox driver and configure
		WebDriverManager.firefoxdriver().setup(); 
		
		//Step1: Open Browser , Maximize it and set implicit wait of 15 sec.
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		//Step2: Navigate to AUT=" http://qdpm.net/demo/v9/index.php"
		driver.get("http://qdpm.net/demo/v9/index.php");
		
		//System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		
		//Step3: Verify Page Title as “qdPM } Login”
		String expectedtitle = "qdPM } Login";
		String actualtitle = driver.getTitle();
		
		if(expectedtitle.equalsIgnoreCase(actualtitle))
		{
			System.out.println("1st Validation-PASS");
		
		}
		else
		{
			System.out.println("1st Validation-FAIL" + "\n" + "Actual Title of page is : " + driver.getTitle());
		}
		
		/*Step4: verify current url (Use getCurrentURL method on driver) 
		and make sure that it is as same as you used in step2.*/
		
		String actualurl="http://qdpm.net/demo/v9/index.php";
		String expectedurl= driver.getCurrentUrl();
		
		if(actualurl.equalsIgnoreCase(expectedurl))
		{
			System.out.println("2nd Validation-PASS");
		
		}
		else
		{
			System.out.println(" 2nd validation-FAIL");
		}
		
		Thread.sleep(1000);
		//Step: Command to close the browser
		driver.close();
		
		 
	}
	
	}


