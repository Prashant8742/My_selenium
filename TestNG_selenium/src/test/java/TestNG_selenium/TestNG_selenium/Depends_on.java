package TestNG_selenium.TestNG_selenium;

import org.testng.annotations.Test;

public class Depends_on {
 
	@Test 
	public void b() {
	System.out.println("Second test method");
	//System.out.println(Thread.currentThread().getId());	
	}
	
	@Test (dependsOnMethods= {"a"})
	public void c() {
	System.out.println("First test method");	
	//System.out.println(Thread.currentThread().getId());	
	}
	
	@Test 
	public void a() {
	System.out.println("third test method");	
	//System.out.println(Thread.currentThread().getId());	
	}
}
