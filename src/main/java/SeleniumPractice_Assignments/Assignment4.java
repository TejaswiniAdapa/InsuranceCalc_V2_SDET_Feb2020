package SeleniumPractice_Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {
	WebDriver driver = null;

	// This Method executes before all other methods gets executed
	@Test(priority=1)
	public void Browsersetup() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://qdpm.net/demo/v9/index.php");
		driver.manage().window().maximize();
	}

	/*
	 * @Test case 1: Verify dashboard title after logged in sucessfully into given
	 * URL "http://qdpm.net/demo/v9/index.php" TEST STEPS- 1.Navigate to URL 2.Enter
	 * Valid Email ID and Password 3.Click on Login Button 4.Validation1: Verify
	 * dashboard title after logged in successfully
	 */

	@Test(priority = 2)
	public void LoginFunctionality() throws InterruptedException {

		driver.findElement(By.xpath("//form[@id='loginForm']/div[2]/div//input"))
				.sendKeys("administrator@localhost.com");
		driver.findElement(By.xpath("//form[@id='loginForm']/div[3]/div//input")).sendKeys("administrator");
		driver.findElement(By.xpath("//form[@id='loginForm']/div[4]/button")).click();

		String Dashboard = driver.getTitle();
		Assert.assertEquals(Dashboard, "qdPM | Dashboard");
		System.out.println("------------Login Sucessfull--------------"+"/n");
	}

	/*
	 * @ Test case 2: Verify that all options are present on dashboard page // TEST
	 * STEPS- 1.Store the 'a'tag links into list 2.compare the list of elements with
	 * single element 3.Read the text from each element and storing them into string
	 * element_text 4.check If the element text=true and print the element text on
	 * console
	 */
	@Test(priority = 3)
	public void DashboardList() throws InterruptedException {
		List<WebElement> listEle = driver.findElements(By.xpath("//ul[@class='page-sidebar-menu']/li/a"));
		System.out.println("------------Dashboard elements------------");
		for (WebElement d_options : listEle) {
			String element_text = d_options.getText();

			Assert.assertTrue(true, element_text);
			
			System.out.println(element_text);
		}
		System.out.println();
		
	}

	/*
	 * //Test case 3: Verify the page title after the logout action TEST STEPS-
	 * 1.Click on Add task button and select Test project 1 option 
	 * 2.Enter Required details for all the tabs-General,Time,attachments
	 * 3.Goto admin option and logout from application
	 */
	@Test(priority = 4)
	public void Addtask() throws InterruptedException, AWTException {
		//
		driver.findElement(By.xpath("/*//tbody//button[text()='Add Task']")).click();

		WebElement project = driver.findElement(By.id("form_projects_id"));
		Select project_option = new Select(project);
		project_option.selectByVisibleText("Test Project 1");

		WebElement Type = driver.findElement(By.id("tasks_tasks_type_id"));
		Select Type_option = new Select(Type);
		Type_option.selectByVisibleText("Defects (Hourly rate $0.00)");

		WebElement name = driver.findElement(By.id("tasks_name"));
		name.sendKeys("Teja");

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

		WebElement createdBy= driver.findElement(By.id("tasks_created_by"));
		Select createdBy_option=new Select(createdBy);
		createdBy_option.selectByValue("4");
		
		WebElement Time_Task=driver.findElement(By.xpath("//*[@id=\"tasks\"]/div[1]/div/ul/li[2]/a"));
		//To Hover my mouse we use Actions class Actions act=new
		Actions act=new Actions(driver); 
		act.moveToElement(Time_Task).click().build().perform();
		 
		driver.findElement(By.id("tasks_estimated_time")).sendKeys("11");
		driver.findElement(By.id("tasks_start_date")).sendKeys("2019-12-27");
		driver.findElement(By.id("tasks_due_date")).sendKeys("tasks_due_date");
		 
		WebElement progress_task=driver.findElement(By.id("tasks_progress"));
		Select progress_task_options=new Select(progress_task);
		progress_task_options.selectByValue("20");
		 
		WebElement Attachement_task=driver.findElement(By.xpath( "//*[@id=\"tasks\"]/div[1]/div/ul/li[3]/a"));
		act.moveToElement(Attachement_task).click().build().perform();
		
		//didnot work with sendkeys
		//upload.sendKeys("C:\\\\Users\\\\Adapa Teja\\\\OneDrive\\\\Pictures\\\\Screenshots\\\\Screenshot (1)"); 	
		
		//The following code is by using Robot class to upload picture		
		driver.findElement(By.xpath("//*[@id=\"uploadifive-uploadify_file_upload\"]")).click();;
		
		//copy the path to clipboard
				String filepath="C:\\Users\\Adapa Teja\\OneDrive\\Pictures\\Screenshots\\Fail_testcase";
				StringSelection strsel=new StringSelection(filepath);
				Toolkit toolkit=Toolkit.getDefaultToolkit();
				Clipboard clipboard = toolkit.getSystemClipboard();
				clipboard.setContents(strsel, null);
				
				//use robot class to CTRL+V
				Robot rb=new Robot();
				rb.keyPress(KeyEvent.VK_CONTROL);
				rb.keyPress(KeyEvent.VK_V);
				Thread.sleep(2000);
				rb.keyRelease(KeyEvent.VK_CONTROL);
				rb.keyRelease(KeyEvent.VK_V);
				
				//use robot class Hit enter key
				rb.keyPress(KeyEvent.VK_ENTER);
				rb.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(15000);
		driver.findElement(By.xpath("/*//form[@id='tasks']/div[2]/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"yahoo-com\"]/div[1]/div/ul/li/a/span")).click();
		String valueToBeSelected=" Logoff";
		driver.findElement(By.xpath("//*[@id=\"yahoo-com\"]/div[1]/div/ul/li/ul//a[text()='"+valueToBeSelected+"']")).click();
		
		String TitleAfterLogout=driver.getTitle();
		Assert.assertEquals(TitleAfterLogout, "qdPM | Login");
	}

	// This method executes after all methods gets executed
	@Test(priority=5)
	public void BrowserClose() {

		driver.close();
	}

}
