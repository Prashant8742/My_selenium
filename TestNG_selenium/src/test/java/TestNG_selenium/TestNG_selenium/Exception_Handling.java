package TestNG_selenium.TestNG_selenium;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

public class Exception_Handling {
  
	
	
	@Test(expectedExceptions=ArithmeticException.class)
  public void f() throws IOException  {
	  int a,b,c;
		a=10;
		b=0;
		c=a/b;
	      System.out.println(c);
	      System.out.println("Arithmetic exception");
	}
	
	      
	      @Test(expectedExceptions=FileNotFoundException.class)
	      public void f2() throws IOException  {
	      BufferedReader br=new BufferedReader(new FileReader("Data"));
 	     String line;
			while ((line = br.readLine()) != null)
 	         {
 	           System.out.println(line);
 	         }
			
  }
	
}
