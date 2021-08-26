package Webdriver.Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {
  @Test
  public void f() {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\driver\\chromedriver.exe");
	  WebDriver driver;
	  driver = new ChromeDriver();
	  driver.get("http://www.leafground.com");
	  
	//click on frame tab
	  driver.findElement(By.linkText("Frame")).click();
	  //switch to first frame
	  driver.switchTo().frame(0);
	  driver.findElement(By.id("Click")).click();
	//base screen
	  driver.switchTo().defaultContent();
	  //first screen
	 driver.switchTo().parentFrame();
	  
	    
	//switch to second frame
	  driver.switchTo().frame(1);
	  //nested frame
	  driver.switchTo().frame("frame2");
	  //click on element
	  driver.findElement(By.id("Click1")).click(); 
	//base screen
	  driver.switchTo().defaultContent();
	  //first screen
	  driver.switchTo().parentFrame();
	  
	  
	  
	//total no of iframe 
	  //driver.findElement(By.linkText("frame2"));
	  int size = driver.findElements(By.tagName("iframe")).size();
	  System.out.println("The Number of Iframes : "+size);
	 
	  
	  
  }
}
