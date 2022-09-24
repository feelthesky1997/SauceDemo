package annotations;

import org.testng.annotations.Test;

public class I_Priority {

	@Test 	(priority =1)
	public void first()
	{
		System.out.println("First Test Pass");
	}
	
	@Test	(priority =0)
	public void second()
	{
		System.out.println("Second Test Pass");
	}
	
	@Test	(priority =2)
	public void third()
	{
		System.out.println("Third Test Pass");
	}
	 
} 


