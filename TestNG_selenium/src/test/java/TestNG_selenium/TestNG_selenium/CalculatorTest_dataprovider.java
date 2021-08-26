package TestNG_selenium.TestNG_selenium;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class CalculatorTest_dataprovider {
	Calculator calc=new Calculator();

	  @Test(dataProvider="dpadd")
	  public void mul(int exp,int a,int b) {
	    Assert.assertEquals(exp,calc.mul(a, b) );
	  }

	  @Test(dataProvider="dpadd1")
	  public void sub(int exp,int a, int b) {
		  Assert.assertEquals(exp,calc.sub(a, b) );
		  Reporter.log("The Data provider annotation used and perform datadriven testing will be performed",true );
	  }
	  
	  @DataProvider(name="dpadd")
	  public Object[][] getData(){
		  Object[][] table_values=new Object[][] {
			  {25,5,5},
			  {20,5,4},
			  {10,3,3},
			  {24,3,8},
			  {121,11,11}
			  };
			  return table_values;
	  }
			  	
			  @DataProvider(name="dpadd1")
			  public Object[][] getData1(){
				  Object[][] table_values=new Object[][] {
					  {0,7,7},
					  {4,5,1},
					  {0,3,3},
					  {2,3,6},
					  {4,15,11}
					  };
			  
			  return table_values;
		  }
  
}
