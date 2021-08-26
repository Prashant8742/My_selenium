package Webdriver.Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Radio {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\driver\\chromedriver.exe");
	  WebDriver driver;
	  driver = new ChromeDriver();
	  driver.get("http://www.leafground.com");
	  
	  //click on button tab
	  driver.findElement(By.linkText("Radio Button")).click();
	  
	  //click on first radio button
	  driver.findElement(By.id("yes")).click();
	  WebElement v =  driver.findElement(By.id("yes"));
	  String val = v.getAttribute("value");
	  System.out.println(val);
	  int a = Integer.parseInt(val);
	  if(a==1)
	  {
		  System.out.println("first Radio button are click");
	  }else 
	  {
		  System.out.println("first Radio button are not click");
	  }
	  
	 
	  

	  //click on second radio button
	  driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[2]/input")).click();
	  WebElement v1 =  driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[2]/input"));
	  String val1 = v1.getAttribute("value");
	  System.out.println(val1);
	  int b = Integer.parseInt(val1);
	  if(b==0)
	  {
		  System.out.println("second Radio button are click");
	  }else
	  {
		  System.out.println("second Radio button are not click");
	  }

	  //click on third radio button
	  driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[3]")).click();
	  WebElement v2 =  driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[3]"));
	  String val2 = v2.getAttribute("value");
	  System.out.println(val2);
	  int c = Integer.parseInt(val2);
	  
	  if(c==2)
	  {
		  System.out.println("third Radio button are click");
	  }else
	  {
		  System.out.println("third Radio button are not click");
	  }
	  
	  driver.close();
	  
	  
  }
}
