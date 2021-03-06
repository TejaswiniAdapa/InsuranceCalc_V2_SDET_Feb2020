package SeleniumPractice_ClassSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register_demowebshop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(5000);

		/*
		 * The following lines is used to find the elements for a Registration page
		 */

		// Using 'Relative Xpath'
		driver.findElement(By.xpath("//a[@href='/register']")).click();
		Thread.sleep(5000);

		// Using Element 'ID'
		driver.findElement(By.id("gender-male")).click();
		//driver.findElement(By.id("gender-female")).isSelected();

		// Using Element 'Name'
		driver.findElement(By.name("FirstName")).sendKeys("srika");
		
		//Using Element 'Absolute Xpath'
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[3]/input")).sendKeys("ambani");
		
		//Using Element 'ID'
		driver.findElement(By.id("Email")).sendKeys("sika@gmail.com");
		
		//Uisng Elelment 'Chained Xpath 2-starts with'
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("sri@123");
		
		//Using Element 'Chained Xpath' 3 dynamic Xpath
		driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("sri@123");


		//Uisng Element 'ID'
		driver.findElement(By.id("register-button")).click();
		// to close the browser
		//driver.close();
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input")).click();
	}

}
