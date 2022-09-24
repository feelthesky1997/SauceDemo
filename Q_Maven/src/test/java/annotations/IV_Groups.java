package annotations;

import org.testng.annotations.Test;

public class IV_Groups {

	@Test 	(groups= {"Group-A"})
	public void first()
	{
		System.out.println("First Test Pass");
	}
	
	@Test	(groups= {"Group-A" , "Group-B"}) /*TestNG Groups allow you to perform groupings of different test methods. 
												Grouping of test methods is required when you want to access the test methods of different classes. 
												Not only you can declare the methods within a specified group, 
												you can also declare another group within a specified group*/
	public void second()
	{
		System.out.println("Second Test Pass");
	}
	
	@Test	(groups= {"Group-B"})
	public void third()
	{
		System.out.println("Third Test Pass");
	}
	 
} 


