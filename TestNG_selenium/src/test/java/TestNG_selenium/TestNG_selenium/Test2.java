package TestNG_selenium.TestNG_selenium;

import org.testng.annotations.Test;

public class Test2 {
  @Test
  public void f() {
	  System.out.println("First class of second test");
	  System.out.println(Thread.currentThread().getId());	
  }
}
