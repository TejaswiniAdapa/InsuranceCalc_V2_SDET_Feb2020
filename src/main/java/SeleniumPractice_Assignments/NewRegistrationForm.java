package SeleniumPractice_Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewRegistrationForm {
	
	@Test
	public void Registrationpage()
	{
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://services.smartbear.com/samples/TestComplete14/smartstore/");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		driver.findElement(By.xpath("//div[@class='col-12 col-lg-auto']//a")).click();
		
		//now following lines of code is to work with Radio Button
	//	driver.findElement(By.id("gender-male")).click();//not using becuase we want to make Xpath generic
		
		String gender="Male";
		driver.findElement(By.xpath("//label[text()='"+gender+"']")).click();
		
		//
		driver.findElement(By.id("FirstName")).sendKeys("Joh");
		driver.findElement(By.id("LastName")).sendKeys("Haug");
		
		//now following lines of code is to work with Drop down button
		WebElement DOBDay=driver.findElement(By.name("DateOfBirthDay"));//Non-primitive Data type
		Select dd=new Select(DOBDay);		//creating object of Select class for DOB dropdown
		dd.selectByValue("13");
		WebElement DOBMonth=driver.findElement(By.name("DateOfBirthMonth"));//Non-primitive Data type
		Select dm=new Select(DOBMonth);		//creating object of Select class for DOB dropdown
		dm.selectByVisibleText("August");
		WebElement DOBYear=driver.findElement(By.name("DateOfBirthYear"));//Non-primitive Data type
		Select dy=new Select(DOBYear);		//creating object of Select class for DOB dropdown
		dy.selectByValue("1989");
		
		
		//Code for the rest of webElements to Send the Test data by sendkeys()
		
		driver.findElement(By.id("Email")).sendKeys("testadap@gmail.com");
		driver.findElement(By.id("Username")).sendKeys("testadapa1");
		driver.findElement(By.id("Password")).sendKeys("ilovebiryan");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("ilovebiryan");
		driver.findElement(By.id("Company")).sendKeys("BiryaniCompan");
		
		//Code for checking the checkbox
		
		String Checkbox="Newsletter";
		driver.findElement(By.xpath("//label[text()='"+Checkbox+"']")).click();
		driver.findElement(By.name("register-button")).click();
		String Reg_Sucess=driver.findElement(By.xpath("//*[@id=\"content-center\"]/div/div[2]/p")).getText();
		
		Assert.assertEquals(Reg_Sucess, "Your registration completed");
		driver.findElement(By.xpath("//*[@id=\"content-center\"]/div/div[2]/div/a")).click();
		driver.close();
	}
	
	

}
