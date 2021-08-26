package Webdriver.Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class Dropdown {
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\driver\\chromedriver.exe");
	  WebDriver driver;
	  driver = new ChromeDriver();
	  driver.get("http://www.leafground.com");
	  
	  //click on Checkbox tab
	  driver.findElement(By.linkText("Drop down")).click();
	  
	  
	//select by visible text
	  Select s1 = new Select(driver.findElement(By.name("dropdown2")));
	  s1.selectByVisibleText("UFT/QTP");
	  Boolean msg = s1.isMultiple();
	  System.out.println(msg);
	  
	  
	  
	//select by index
	  Select s2 = new Select(driver.findElement(By.id("dropdown1")));
	  s2.selectByIndex(1);
	  Boolean msg1 = s2.isMultiple();
	  System.out.println(msg1);
	  
	//select by value
	  Select s3 = new Select(driver.findElement(By.id("dropdown3")));
	  s3.selectByValue("4");
	  Boolean msg2 = s3.isMultiple();
	  System.out.println(msg2);

	  
	//select by sendkeys
	 driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select")).sendKeys("Appium");
	 
	 
	//multiple select by value
	  Select s4 = new Select(driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select")));
	  s4.selectByValue("4");
	  s4.selectByValue("2");
	  Boolean msg3 = s4.isMultiple();
	  System.out.println(msg3);
	  
	  
	  
	  
	  
	  
	  
	 
	  //close the driver
	  //driver.close();
  }
}
