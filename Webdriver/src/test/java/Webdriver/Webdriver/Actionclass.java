package Webdriver.Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actionclass {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
	  WebDriver driver;
	  driver = new ChromeDriver();
	  driver.get("http://leafground.com/");
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  driver.findElement(By.linkText("Edit")).click();
	  
	  Actions act1=new Actions(driver);
	  WebElement ele1=driver.findElement(By.id("email"));
	  WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input"));
	  //ele2.sendKeys("hhh");
	  
	  
	  //act1.sendKeys(ele1, "Lion").doubleClick().contextClick().build().perform();//double and right click

//	  act1.sendKeys(ele1, "Lion")
//	  .moveToElement(ele2)
//	  .build()
//	  .perform();//drag and drop
 
	  act1.sendKeys(ele1, "Lion")
	  .doubleClick()
	  .clickAndHold()
	  .dragAndDrop(ele1, ele2)
	  .build()
	  .perform();
	  
  }
}
