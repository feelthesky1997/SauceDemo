package annotations;

import org.testng.annotations.Test;

public class II_dependsOnMethods {

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
	
	@Test	(priority =3 , dependsOnMethods = {"second"})
	public void third()
	{
		System.out.println("Third Test Pass");
	}
	 
} 


