package SeleniumPractice_ClassSession;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginBjsPage {

	@Test
	public void bjsLoginPage() throws Exception
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.get("https://www.bjs.com");
		driver.findElement(By.xpath("//span[@class='login-state ml-1']")).click();
		driver.findElement(By.id("emailLogin")).sendKeys("parupallytejaswini@gmail.com");
		driver.findElement(By.id("inputPassword")).sendKeys("Durgamma@123");
		driver.findElement(By.xpath("//form/div[3]/button[text()='SIGN IN']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div/div[1]/button")).click();

		driver.findElement(By.xpath("//*[@id=\"header-margin\"]/ul/li[5]/div[1]/app-header-my-account/div/div/span/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"header-margin\"]/ul/li[5]/div[1]/app-header-my-account/div/ul/div[2]/div/div[5]/button")).click();
		
		driver.close();
		}
		
}
