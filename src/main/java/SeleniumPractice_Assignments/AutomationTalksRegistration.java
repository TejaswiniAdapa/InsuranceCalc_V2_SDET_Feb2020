package SeleniumPractice_Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AutomationTalksRegistration {
	

	@Test
	public void Registrationtalks() throws AWTException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.automationtalks.com/index.html");
		//driver.get("http://demo.automationtalks.com/index.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Verify page title()
				String actual_page1=driver.getTitle();
				Assert.assertEquals(actual_page1, "Fill Vehicle Data");
		
		//code for full vehicle data page
		//the following code is to select an option from Make DropDown list
		WebElement Make=driver.findElement(By.id("make"));
		Select Reg=new Select(Make);
		Reg.selectByValue("BMW");
		
		WebElement Model=driver.findElement(By.id("model"));
		Select Vehicle_model=new Select(Model);
		Vehicle_model.selectByValue("Moped");
		
		driver.findElement(By.id("cylindercapacity")).sendKeys("1000");
		driver.findElement(By.id("engineperformance")).sendKeys("820");
		driver.findElement(By.id("dateofmanufacture")).sendKeys("02/08/2001");
		
		//the following code is to select an option from Seats DropDown list
		WebElement seat=driver.findElement(By.id("numberofseats"));
		Select noofseat=new Select(seat);
		noofseat.selectByValue("4");
		
		String Hand_drive="Yes";
		driver.findElement(By.xpath("//label[text()='"+Hand_drive+"']")).click();
		
		WebElement seat1=driver.findElement(By.id("numberofseatsmotorcycle"));
		Select noofseat1=new Select(seat1);
		noofseat1.selectByValue("3");
		
		
		//the following code is to select an option from FuelType DropDown list
		WebElement fuel=driver.findElement(By.id("fuel"));
		Select fueltype=new Select(fuel);
		fueltype.selectByValue("Diesel");
		
		driver.findElement(By.xpath("//input[@id='payload']")).sendKeys("100");
		driver.findElement(By.xpath("//input[@id='totalweight']")).sendKeys("500");
		
		driver.findElement(By.id("listprice")).sendKeys("29000");
		driver.findElement(By.id("licenseplatenumber")).sendKeys("L678909");
		driver.findElement(By.id("annualmileage")).sendKeys("15000");
		
		
		
		driver.findElement(By.id("nextenterinsurantdata")).click();
		
		//verify page title 2
				String actual_page2=driver.getTitle();
				Assert.assertEquals(actual_page2, "Fill Insurant Data");
				
		//code for Full Insurant data page
		
		driver.findElement(By.id("firstname")).sendKeys("BMW");
		driver.findElement(By.id("lastname")).sendKeys("user");
		Thread.sleep(1000);
		driver.findElement(By.id("birthdate")).sendKeys("02/02/1991");
		
		//code for selecting radio button

		String gender="Male";
		driver.findElement(By.xpath("//label[text()='"+gender+"']")).click();
		
		driver.findElement(By.id("streetaddress")).sendKeys("341 w side dr");
		
		//Select the country from dropdown list
		WebElement country=driver.findElement(By.id("country"));
		Select sel_coun=new Select(country);
		sel_coun.selectByValue("United States");
		
		driver.findElement(By.id("zipcode")).sendKeys("20878");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Gaithersburg");
		
		WebElement occupation=driver.findElement(By.id("occupation"));
		Select sel_occu=new Select(occupation);
		sel_occu.selectByValue("Employee");
		
		String Checkbox=" Speeding";
		driver.findElement(By.xpath("//label[text()='"+Checkbox+"']")).click();
		
		driver.findElement(By.id("website")).sendKeys("carfax.com");
		
		/* this works only when there is type=file element
		 * WebElement upload=driver.findElement(By.id("picture")); upload.
		 * sendKeys("C:\\Users\\Adapa Teja\\OneDrive\\Pictures\\Screenshots\\Screenshot (1)"
		 * ); upload.click();
		 */
		
		//Click on open button
		
		driver.findElement(By.id("open")).click();
		Thread.sleep(2000);
		
		//copy the path to clipboard
		String filepath="C:\\Users\\Adapa Teja\\OneDrive\\Pictures\\Screenshots\\Screenshot (1)";
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
		driver.findElement(By.xpath("//button[@name='Next (Enter Product Data)']")).click();
		
		String actual_page3=driver.getTitle();
		Assert.assertEquals(actual_page3, "Fill Product Data");
		
		Thread.sleep(1000);
		//code for fullproduct data page
		driver.findElement(By.id("startdate")).sendKeys("05/04/2020");
		
		
		
		WebElement Insurance_sum=driver.findElement(By.id("insurancesum"));
		Select sum=new Select(Insurance_sum);
		sum.selectByValue("3000000");
		
		WebElement Merit_Rate=driver.findElement(By.id("meritrating"));
		Select rate=new Select(Merit_Rate);
		rate.selectByValue("Bonus 2");
		
		WebElement Damage_Insurance=driver.findElement(By.id("damageinsurance"));
		Select DI_ele=new Select(Damage_Insurance);
		DI_ele.selectByValue("Partial Coverage");
		
		String Checkbox1="Euro Protection";
		driver.findElement(By.xpath("//label[text()='"+Checkbox1+"']")).click();
		
		WebElement Courtesy_car=driver.findElement(By.id("courtesycar"));
		Select cc=new Select(Courtesy_car);
		cc.selectByValue("No");
		
		
		driver.findElement(By.id("nextselectpriceoption")).click();
		
		//verify Page4 title for Choose Price Option
		
		String Page4=driver.getTitle();
		Assert.assertEquals(Page4, "Choose Price Option");
		
		int row_count=driver.findElements(By.xpath("//table[@id='priceTable']/tbody//tr")).size();
		int col_count=driver.findElements(By.xpath("//table[@id='priceTable']/tbody//tr[1]/td")).size();
		
		/*
		 * //Please check this lines and let me know if any changes needed in selecting 
		 * Radio button. I have passed static data.
		 */
		String Platinum=driver.findElement(By.xpath("//table[@id='priceTable']/tbody//tr[1]/td[4]")).getText();
		System.out.println("Option choosed for Price is :"+Platinum);
		
		driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span")).click();
		
		driver.findElement(By.id("nextsendquote")).click();
		
		String page5=driver.getTitle();
		Assert.assertEquals(page5, "Send Quotation");
		
		driver.findElement(By.name("E-Mail")).sendKeys("parupallytejaswini@gmail.com");
		driver.findElement(By.name("Phone")).sendKeys("5718990009");
		driver.findElement(By.name("Username")).sendKeys("teja123");
		driver.findElement(By.name("Password")).sendKeys("Teja@123");
		driver.findElement(By.name("Confirm Password")).sendKeys("Teja@123");
		driver.findElement(By.name("Comments")).sendKeys("This is your insurance quote...please review it");
		driver.findElement(By.name("Send E-Mail")).click();
	
		
		}
		

}
