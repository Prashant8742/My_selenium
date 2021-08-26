package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_report_using_case_study {
 
	static WebDriver driver;
	static ExtentTest test;
	static ExtentReports report;
	
	@BeforeClass
	public static void startTest()
	{
	report = new ExtentReports("C:\\Users\\prashant_gup\\OneDrive - HCL Technologies Ltd\\Attachments\\Backup_project_2021\\Advanced\\src\\test\\java\\Reports\\Case_study.html",true);
	test = report.startTest("ExtentDemo");
	}
	
	@BeforeTest
	  public void f() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
		  driver =new ChromeDriver();
		  driver.get("https://ksrtc.in/oprs-web/user/add.do");
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
	  }
	  
	  @Test
	  public void login() throws InterruptedException {
		  WebDriverWait v1 = new WebDriverWait(driver,10);
		  driver.findElement(By.id("email")).sendKeys("prashantg8742@gmail.com");
		  driver.findElement(By.id("fullName")).sendKeys("Prashant");
		  driver.findElement(By.id("mobileNo")).sendKeys("8824440660");
		  driver.findElement(By.xpath("//*[@id=\"userProfileForm\"]/div/div/div/div/div/div[4]/input")).click();
		  
		  //wait for alert if already register
		  v1.until(ExpectedConditions.alertIsPresent());
		  driver.switchTo().alert().accept();
		  System.out.println("Successfully registerd");
		
		  
		  //login
		  driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/div/ul[1]/li[1]/a")).click();
		  driver.manage().deleteAllCookies();
		  driver.findElement(By.id("userName")).sendKeys("prashantg8742@gmail.com");
		  driver.findElement(By.id("password")).sendKeys("transport123@");
		  driver.findElement(By.id("submitBtn")).click();
		  System.out.println("Successfully Login");
		  
		//Search for location
		  Actions act1=new Actions(driver);
		  WebElement w = driver.findElement(By.id("fromPlaceName"));
		  act1.sendKeys(w, "KURNOOL");
		  act1.sendKeys(Keys.ARROW_DOWN);
		  act1.sendKeys(Keys.ENTER).build().perform();
		  
		  WebElement w1 = driver.findElement(By.id("toPlaceName"));
		  act1.sendKeys(w1, "BENGALURU");
		  act1.sendKeys(Keys.ARROW_DOWN);
		  act1.sendKeys(Keys.ENTER).build().perform();
		 
		  driver.findElement(By.id("txtJourneyDate")).click();
		  driver.findElement(By.linkText("28")).click();
		  driver.findElement(By.id("txtReturnJourneyDate")).click();
		  driver.findElement(By.linkText("31")).click();
		  driver.findElement(By.id("corover-close-btn")).click();
		  //driver.findElement(By.xpath("/html/body/main/form/div[1]/div/div[2]/div[3]/button")).submit();
		  driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']")).click();
		  System.out.println("Successfully searched");
		  
		  if(driver.getCurrentUrl().equals("https://ksrtc.in/oprs-web/avail/services.do"))
			{
			test.log(LogStatus.PASS, "Navigated to the specified URL of search");
			}
			else
			{
			test.log(LogStatus.FAIL, "Test Failed");
			}
	  }
	  
	  @AfterTest
	  public void close() throws InterruptedException {
		  driver.close();
		  
	  }
	  
	  @AfterClass
		public static void endTest()
		{
		report.endTest(test);
		report.flush();
		}
	
}
