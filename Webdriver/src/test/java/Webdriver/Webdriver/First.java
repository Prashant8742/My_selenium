package Webdriver.Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class First {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\driver\\chromedriver.exe");
	  WebDriver driver;
	  driver = new ChromeDriver();
	  
	  driver.get("http://www.leafground.com/");
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("email")).sendKeys("Prashant");
	driver.findElement(By.cssSelector("input[value='Append ']")).sendKeys("JI");
	driver.findElement(By.name("username")).sendKeys("Selenium");	
	driver.findElement(By.xpath("//input[@value='Clear me!!']")).sendKeys("Clear");
	driver.findElement(By.cssSelector("input[style='width:350px;background-color:LightGrey;']")).click();
	driver.quit();
	  
	  
  }
}
