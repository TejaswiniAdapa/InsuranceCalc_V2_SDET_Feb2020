package SeleniumPractice_Assignments;

import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SmartBearRegistrationPage {

	/*
	 * Test Steps to perform the functionality of Registration Form Step 1: Open Web
	 * Browser(Chrome) Step 2: Navigate to application 'Link' Step 3: Click on Login
	 * button Step 4: Click on Register button Step 5: Enter the test data mentioned
	 * in the Doc Step 6: Click on Register Expected Output: Verify Success message
	 * is displayed.
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		/*
		 * WebDriver Manager is used to configure the browser by adding WebDriver Manager
		 * dependency in POM.Xml which will automatically creates the browser connection
		 */
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://services.smartbear.com/samples/TestComplete14/smartstore/");
		
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		driver.findElement(By.xpath("//div[@class='col-12 col-lg-auto']//a")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("John");
		driver.findElement(By.id("LastName")).sendKeys("Hauge");
		driver.findElement(By.name("DateOfBirthDay")).sendKeys("13");
		driver.findElement(By.name("DateOfBirthMonth")).sendKeys("August");
		driver.findElement(By.name("DateOfBirthYear")).sendKeys("1989");
		driver.findElement(By.id("Email")).sendKeys("testadapa@gmail.com");
		driver.findElement(By.id("Username")).sendKeys("testadapa12");
		driver.findElement(By.id("Password")).sendKeys("ilovebiryani");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("ilovebiryani");
		driver.findElement(By.id("Company")).sendKeys("BiryaniCompany");
		driver.findElement(By.id("Newsletter")).click();
		driver.findElement(By.name("register-button")).click();
		String Reg_Sucess=driver.findElement(By.xpath("//*[@id=\"content-center\"]/div/div[2]/p")).getText();
		

		
		if(Reg_Sucess.equals("Your registration completed"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("Fail");
		}
		
		driver.findElement(By.xpath("//*[@id=\"content-center\"]/div/div[2]/div/a")).click();
		driver.close();
	}

}
