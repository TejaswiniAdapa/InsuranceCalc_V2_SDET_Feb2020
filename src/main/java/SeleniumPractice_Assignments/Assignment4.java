package SeleniumPractice_Assignments;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 
{
	WebDriver driver = null;

	// This Method executes before all other methods gets executed
	
	@BeforeMethod
	
	public void qdpm() throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://qdpm.net/demo/v9/index.php");
		driver.manage().window().maximize();
	}
	
	@Test
		public void taskTestCase() throws Exception 
	{
	
		driver.findElement(By.xpath("//form[@id='loginForm']/div[2]/div//input"))
				.sendKeys("administrator@localhost.com");
		driver.findElement(By.xpath("//form[@id='loginForm']/div[3]/div//input")).sendKeys("administrator");
		driver.findElement(By.xpath("//form[@id='loginForm']/div[4]/button")).click();

		String Dashboard = driver.getTitle();
		Assert.assertEquals(Dashboard, "qdPM | Dashboard");
		System.out.println("------------Login Sucessfull--------------" + "/n");
	
		List<WebElement> listEle = driver.findElements(By.xpath("//ul[@class='page-sidebar-menu']/li/a"));
		System.out.println("------------Dashboard elements------------");
		for (WebElement d_options : listEle)
		{
			String element_text = d_options.getText();
			Assert.assertTrue(true, element_text);
			System.out.println(element_text);
		}
		System.out.println();

		driver.findElement(By.xpath("/*//tbody//button[text()='Add Task']")).click();

		WebElement project = driver.findElement(By.id("form_projects_id"));
		Select project_option = new Select(project);
		project_option.selectByValue("1");

		WebElement Type = driver.findElement(By.id("tasks_tasks_type_id"));
		Select Type_option = new Select(Type);
		Type_option.selectByVisibleText("Defects (Hourly rate $0.00)");

		WebElement name = driver.findElement(By.id("tasks_name"));
		name.sendKeys("Jenny");

		WebElement Status = driver.findElement(By.id("tasks_tasks_status_id"));
		Select Status_option = new Select(Status);
		Status_option.selectByVisibleText("Lost");

		WebElement priority = driver.findElement(By.id("tasks_tasks_priority_id"));
		Select priority_option = new Select(priority);
		priority_option.selectByVisibleText("Low");

		WebElement label = driver.findElement(By.id("tasks_tasks_label_id"));
		Select label_option = new Select(label);
		label_option.selectByVisibleText("Issue");

		driver.findElement(By.xpath("//div[@id='assigned_to']//input[@value='2']")).click();
		driver.findElement(By.xpath("//div[@id='assigned_to']//input[@value='4']")).click();

		WebElement createdBy = driver.findElement(By.id("tasks_created_by"));
		Select createdBy_option = new Select(createdBy);
		createdBy_option.selectByValue("4");

		WebElement Time_Task = driver.findElement(By.xpath("//*[@id=\"tasks\"]/div[1]/div/ul/li[2]/a"));
		// To Hover my mouse we use Actions class Actions act=new
		Actions act = new Actions(driver);
		act.moveToElement(Time_Task).click().build().perform();

		driver.findElement(By.id("tasks_estimated_time")).sendKeys("11");
		driver.findElement(By.id("tasks_start_date")).sendKeys("2019-12-27");
		driver.findElement(By.id("tasks_due_date")).sendKeys("tasks_due_date");

		WebElement progress_task = driver.findElement(By.id("tasks_progress"));
		Select progress_task_options = new Select(progress_task);
		progress_task_options.selectByValue("20");

		WebElement Attachement_task = driver.findElement(By.xpath("//*[@id=\"tasks\"]/div[1]/div/ul/li[3]/a"));
		act.moveToElement(Attachement_task).click().build().perform();

		
		// The following code is by using Robot class to upload picture
		driver.findElement(By.xpath("//*[@id=\"uploadifive-uploadify_file_upload\"]")).click();
		

		// copy the path to clipboard
		String filepath = "C:\\Users\\Adapa Teja\\OneDrive\\Pictures\\Screenshots\\Fail_testcase";
		StringSelection strsel = new StringSelection(filepath);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Clipboard clipboard = toolkit.getSystemClipboard();
		clipboard.setContents(strsel, null);

		// use robot class to CTRL+V
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		// use robot class Hit enter key
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(15000);
		driver.findElement(By.xpath("/*//form[@id='tasks']/div[2]/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"yahoo-com\"]/div[1]/div/ul/li/a/span")).click();
		String valueToBeSelected = " Logoff";
		driver.findElement(By.xpath("//*[@id=\"yahoo-com\"]/div[1]/div/ul/li/ul//a[text()='" + valueToBeSelected + "']")).click();
		
		//Verify the title of login page
		String TitleAfterLogout = driver.getTitle();
		Assert.assertEquals(TitleAfterLogout, "qdPM | Login");
	
		driver.findElement(By.name("login[email]")).sendKeys("administrator@localhost.com");
		driver.findElement(By.name("login[password]")).sendKeys("administrator");
		driver.findElement(By.xpath("//button[@class='btn btn-info pull-right']")).click();
		
		//Click on Tasks option from Dashboard options
		driver.findElement(By.xpath("//*[@id=\"yahoo-com\"]/div[3]/div[1]/div/div/ul/li[4]/a")).click();
		
		//selecting the View All option
		String Task_dd="View All";
		driver.findElement(By.xpath("//*[@id='yahoo-com']/div[3]/div[1]/div/div/ul/li[4]/ul//span[text()='"+Task_dd+"']")).click();
		
		//Selecting the Search box by using mouse actions
		WebElement search=driver.findElement(By.xpath("//*[@id=\"yui-gen1\"]/span"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(search).click().build().perform();
		
		Thread.sleep(5000);
		//Searching for the created Tasks by name entered='Teja'
		driver.findElement(By.id("search_keywords")).sendKeys("Jenny");
		driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
		
		//Verify the search result i.e test data against what i have given for 'Add Task' Method
		
//		
		List<WebElement> SearchEle = driver.findElements(By.xpath("//tr[@class=\"odd\"]/td[3]"));
		
		for (WebElement S_options : SearchEle)
		{
			String element_text1 = S_options.getText();
			SoftAssert s1=new SoftAssert();
			s1.assertTrue(true,element_text1);
			System.out.println(element_text1);
			s1.assertAll();
		}	
		
		//Deleting the Data which i have created by adding Task
			
		driver.findElement(By.xpath("//a[@class=\"btn btn-default btn-xs purple\"]")).click();
		Alert qdpm=driver.switchTo().alert();
		qdpm.accept();
			
		WebElement search1=driver.findElement(By.xpath("//ul/li[@id='yui-gen26']/span"));
		act1.moveToElement(search1).click().build().perform();
		
		Thread.sleep(5000);
		//Searching for the created Tasks by name entered='Teja'
		driver.findElement(By.id("search_keywords")).sendKeys("Jenny");
		driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
		//Verifying if the User is deleted
		
		String actual_output1=driver.findElement(By.xpath("//table[@class='table table-striped table-bordered table-hover tasks-table']//tbody[2]")).getText();
		Assert.assertEquals(actual_output1, "No Records Found");;
		System.out.println("Entered User is deleted");
		driver.findElement(By.xpath("//li[@class='dropdown user']")).click();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']/li[6]")).click();
		
		
		
	}
		
		
		
	@AfterMethod
	
		public void browserClose() {
		driver.close();
	}

}
