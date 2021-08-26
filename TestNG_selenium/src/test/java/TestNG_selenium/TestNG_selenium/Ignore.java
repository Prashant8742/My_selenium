package TestNG_selenium.TestNG_selenium;

import org.testng.annotations.Test;

public class Ignore {
	
	
  @Test(enabled=false)
  public void f() {
	  System.out.print("Implement the Ignore in TestNG");
  }
  
  @Test
  public void f1(){
	  int a,b,c;
	  a=10;
	  b=5;
	  c=a/b;
	  System.out.println("Without Ignore test function");
	  System.out.println(c);
	  
  }
}
