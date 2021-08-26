package Webdriver.Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class chrome_option {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
	  
	  
	  ChromeOptions co = new ChromeOptions();
	  co.addArguments("--incognito");
	  DesiredCapabilities d = new DesiredCapabilities();
	  d.setCapability(ChromeOptions.CAPABILITY, co);
	  
	  WebDriver driver;
	  driver = new ChromeDriver(co);
	  driver.get("http://leafground.com/");
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  driver.findElement(By.linkText("Edit")).click();
  }
}
