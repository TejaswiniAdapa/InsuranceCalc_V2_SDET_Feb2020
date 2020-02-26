package SeleniumPractice_ClassSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestInsuranceApp_NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		// It will download Firefox driver and configure
				WebDriverManager.chromedriver().setup(); 
				
				//Step1: Open Browser , Maximize it and set implicit wait of 15 sec.
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
				driver.get("http://demo.automationtalks.com");
				Thread.sleep(4000);
				driver.findElement(By.id("fillinsurantdata")).click();
				Thread.sleep(4000);
				driver.navigate().back();
				Thread.sleep(4000);
				driver.navigate().forward();
				Thread.sleep(4000);
				
				driver.quit();
	}

}
