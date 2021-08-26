package Webdriver.Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Button {
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\driver\\chromedriver.exe");
	  WebDriver driver;
	  driver = new ChromeDriver();
	  driver.get("http://www.leafground.com");
	  
	  //click on button tab
	  driver.findElement(By.linkText("Button")).click();
	  
	  //click on first button
	  driver.findElement(By.id("home")).click();
	  System.out.println("Click on first button");
	  driver.navigate().back();
	  Thread.sleep(1000);
	  
	  //click on second button
	  driver.findElement(By.id("position")).click();
	  System.out.println("Click on second button");
	  Thread.sleep(1000);
	  
	//click on third button
	  driver.findElement(By.id("color")).click();
	  System.out.println("Click on third button");
	  Thread.sleep(1000);
	  
	//click on fourth button
	  driver.findElement(By.id("size")).click();
	  System.out.println("Click on fourth button");
	  Thread.sleep(1000);
	  
	  driver.close();
  }
  
  
}
