package Webdriver.Webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Window {
  @Test
  public void f() throws InterruptedException {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\driver\\chromedriver.exe");
	  WebDriver driver;
	  driver = new ChromeDriver();
	  driver.get("http://www.leafground.com");
	  
	//click on window tab
	  driver.findElement(By.linkText("Window")).click();
	  
	  //open another window
	  driver.findElement(By.id("home")).click();
	  Set<String> window_values = driver.getWindowHandles();
	  Iterator<String> it1 = window_values.iterator();
	  String w1 = it1.next();
	  System.out.println(w1);
	  
	  
	  String w2 = it1.next();
	  System.out.println(w2);
	  
	  //swith to second window 
	  driver.switchTo().window(w2); 
	  System.out.println(driver.getTitle());
	  driver.close();
	  
	  driver.switchTo().window(w1);
	  
	  //open multiple window Open Multiple Windows
	  
	  driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button")).click();
	  Set<String> window_values1 = driver.getWindowHandles();
	  Iterator<String> IT1 = window_values1.iterator();
	  String W1 = IT1.next();
	  System.out.println(W1);
	  
	  
	  String W2 = IT1.next();
	  System.out.println(W2);
	  
	  String W3 = IT1.next();
	  System.out.println(W3);
	  
	  //get third window title
	  driver.switchTo().window(W3);
	  System.out.println(driver.getTitle());
	  
	  driver.switchTo().window(W3).close();
	  driver.switchTo().window(W2).close();
	  driver.switchTo().window(W1);
	  
	  
	  
	  
	  //close all window except this
	  
	  driver.findElement(By.xpath("//*[@id=\"color\"]")).click();
	  Set<String> window_values2 = driver.getWindowHandles();
	  Iterator<String> IT2 = window_values2.iterator();
	  String a = IT2.next();
	  System.out.println(a);
	  
	  
	  String b = IT2.next();
	  System.out.println(b);
	  
	  String c = IT2.next();
	  System.out.println(c);
	  
	  driver.switchTo().window(b).close();
	  driver.switchTo().window(c).close();
	  driver.switchTo().window(a);
	  
	  
	  //wait for 2 second to open
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("button[onclick='openWindowsWithWait();']")).click();
  }
}
