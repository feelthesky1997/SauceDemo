package annotations;

import org.testng.annotations.Test;

public class III_enabled {

	@Test 	(priority =1)
	public void first()
	{
		System.out.println("First Test Pass");
	}
	
	@Test	(priority =2)
	public void second()
	{
		System.out.println("Second Test Pass");
	}
	
	@Test	(enabled=false) 	// It will not run. It will be ingnored at the run time 
	public void third()
	{
		System.out.println("Third Test Pass");
	}
	 
} 


