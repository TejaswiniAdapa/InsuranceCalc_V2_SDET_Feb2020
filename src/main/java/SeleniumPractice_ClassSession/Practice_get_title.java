package SeleniumPractice_ClassSession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_get_title {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://qdpm.net/demo/v9/index.php");
		driver.findElement(By.xpath("//form[@id='loginForm']/div[2]/div//input"))
				.sendKeys("administrator@localhost.com");
		driver.findElement(By.xpath("//form[@id='loginForm']/div[3]/div//input")).sendKeys("administrator");
		driver.findElement(By.xpath("//form[@id='loginForm']/div[4]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"yahoo-com\"]/div[1]/div/ul/li/a/span")).click();
		String valueToBeSelected=" Logoff";
		driver.findElement(By.xpath("//*[@id=\"yahoo-com\"]/div[1]/div/ul/li/ul//a[text()='"+valueToBeSelected+"']")).click();
		String TitleAfterLogout=driver.getTitle();
		System.out.println(TitleAfterLogout);
		/*
		 * String Dashboard = driver.getTitle(); System.out.println(Dashboard);
		 */
		/*
		 * driver.findElement(By.id("nextenterinsurantdata")).click();
		 * driver.findElement(By.id("nextenterproductdata")).click();
		 * driver.findElement(By.id("nextselectpriceoption")).click(); String
		 * page3=driver.getTitle(); System.out.println(page3); driver.close();
		 */
		
		
		
	}

}
