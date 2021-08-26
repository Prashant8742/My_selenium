package Webdriver.Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Transport {
	
  @Test
  public void register() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
	  WebDriver driver;
	  driver = new ChromeDriver();
	  driver.get("https://ksrtc.in/oprs-web/user/add.do");
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  WebDriverWait v1 = new WebDriverWait(driver,10);
	  
	  driver.findElement(By.id("email")).sendKeys("prashantg8742@gmail.com");
	  driver.findElement(By.id("fullName")).sendKeys("Prashant");
	  driver.findElement(By.id("mobileNo")).sendKeys("8824440660");
	  driver.findElement(By.xpath("//*[@id=\"userProfileForm\"]/div/div/div/div/div/div[4]/input")).click();
	  
	  
	  //wait for alert if already register
	  if(v1.until(ExpectedConditions.alertIsPresent()) != null)
	  {
	  driver.switchTo().alert().accept();
	  System.out.println("Successfully registerd");
	  driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/div/ul[1]/li[1]/a")).click();
	  }
	  else {
	  System.out.println("Successfully registerd");
	  driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/div/ul[1]/li[1]/a")).click();
	  }
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
	  driver.findElement(By.linkText("12")).click();
	  driver.findElement(By.id("txtReturnJourneyDate")).click();
	  driver.findElement(By.linkText("25")).click();
	  driver.findElement(By.id("corover-close-btn")).click();
	  driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']")).click();
	  System.out.println("Successfully searched");
	  
	  
	  
	  
	 
  }
  
}
