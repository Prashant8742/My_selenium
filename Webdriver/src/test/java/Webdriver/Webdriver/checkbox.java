package Webdriver.Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class checkbox {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\driver\\chromedriver.exe");
	  WebDriver driver;
	  driver = new ChromeDriver();
	  driver.get("http://www.leafground.com");
	  
	  //click on Checkbox tab
	  driver.findElement(By.linkText("Checkbox")).click();
	  
	  //click on first Checkbox option   
	  driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[3]/input")).click();
	  System.out.println("click on SQL Checkbox");
	  
	  driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[4]/input")).click();
	  System.out.println("click on C Checkbox");
	  
	  
	  Thread.sleep(2000);
	  
	  
	 
	  

	  //click on second Checkbox option  
	  driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input")).click();
	  System.out.println("click on selenium Checkbox");

	  //click on third Checkbox option
	  driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input")).click();
	  System.out.println("click on Not Selected Checkbox");
	  
	  
	  //click on fourth Checkbox option
	  driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[2]/input")).click();
	  driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[5]/input")).click();
	  System.out.println("click on Option 2 and Option 5 Checkbox");
	  
	  //close the driver
	  driver.close();
	  
  }
}
