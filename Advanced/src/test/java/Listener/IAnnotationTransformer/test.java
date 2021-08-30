package Listener.IAnnotationTransformer;

import org.testng.annotations.Test;

public class test {
	
	
	@Test(invocationCount=5)
	public void changeInvocationCountOfMethod()
	{
		my_listener obj=new my_listener();
	System.out.println("This method have invocation count set to 5 but at run time it shall become "+ obj.counter);
	}
}
 