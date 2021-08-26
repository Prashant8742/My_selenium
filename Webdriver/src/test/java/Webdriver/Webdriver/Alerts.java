package Webdriver.Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerts {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
	  WebDriver driver;
	  driver = new ChromeDriver();
	  driver.get("http://demo.automationtesting.in/Alerts.html");
	  
	  Thread.sleep(2000);
	  
	//click on Alert
	  driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
	  String msg = driver.switchTo().alert().getText();
	  driver.switchTo().alert().accept();
	  System.out.println(msg);
	  
	  Thread.sleep(2000);
	  
	//click on Confirm Alert 
	  driver.findElement(By.linkText("Alert with OK & Cancel")).click();
	  driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
	  String msg1 = driver.switchTo().alert().getText();
	  System.out.println(msg1);
	  driver.switchTo().alert().accept();
	  
	  
	 
	//click on Confirm prompt 
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
	  driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
	  driver.switchTo().alert().sendKeys("i am prashant");
	  String msg2 = driver.switchTo().alert().getText();
	  System.out.println(msg2);
	  driver.switchTo().alert().accept();
 
  }

}
