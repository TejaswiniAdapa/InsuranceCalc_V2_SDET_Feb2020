package SeleniumPractice_ClassSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_get_title {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://demo.automationtalks.com/index.html");
	driver.findElement(By.id("nextenterinsurantdata")).click();
	driver.findElement(By.id("nextenterproductdata")).click();
	driver.findElement(By.id("nextselectpriceoption")).click();
	String page3=driver.getTitle();
		System.out.println(page3);
	}

}
