package SeleniumPractice_ClassSession;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Login_demowebshop {

	public static void main(String[] args) throws InterruptedException{
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/");
	Thread.sleep(5000);
		
		driver.findElement(By.className("ico-login")).click();
		//The following line is to find element using absolute Xpath
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/input")).sendKeys("tejaswini@gmail.com");
		//The following line is to find element using relative Xpath
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("Durgamma@123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
		driver.close();
		
	}
	

	
	

}
