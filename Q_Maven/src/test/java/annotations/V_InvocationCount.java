package annotations;

import org.testng.annotations.Test;

public class V_InvocationCount {

	@Test 	
	public void first()
	{
		System.out.println("First Test Pass");
	}
	
	@Test	(invocationCount=2)	//If we want to run single @Test 2 times at a single thread, then invocationCount can be used
	public void second()
	{
		System.out.println("Second Test Pass");
	}
	
	@Test	
	public void third()
	{
		System.out.println("Third Test Pass");
	}
	 
} 


