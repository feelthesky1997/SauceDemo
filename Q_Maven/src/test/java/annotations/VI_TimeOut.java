package annotations;

import org.testng.annotations.Test;

public class VI_TimeOut {

	@Test 	
	public void first()
	{
		System.out.println("First Test Pass");
	}
	
	@Test	(timeOut=3000)	//  time period to wait for a test to completely execute.
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


