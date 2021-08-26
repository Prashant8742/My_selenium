package TestNG_selenium.TestNG_selenium;

import org.testng.annotations.Test;

public class Synchronization {
	
	
  @Test(timeOut=1000)
  public void f() {
			int i=1;
			while(i==20)
			{
				System.out.println(i);
				i++;
			}
  }
}
