package Listener.IAnnotationTransformer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class my_listener implements IAnnotationTransformer {
	public int counter=3;
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		
		
		if (testMethod.getName().equals("changeInvocationCountOfMethod")) {
		System.out.println("Changing invocation for the following method: " + testMethod.getName());
		annotation.setInvocationCount(counter);	
	     } 

}
}
