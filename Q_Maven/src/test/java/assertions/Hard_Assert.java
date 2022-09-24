package assertions;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert {

	@Test
	public void hardAssert1()
	{
		Assert.assertTrue(true);	// PASS
		System.out.println("assert true is pass");
		Assert.assertFalse(false);	// PASS
		System.out.println("assert false is pass");
	}
	
	@Test
	public void hardAssert2()
	{
		Assert.assertNotNull(null);	
		System.out.println("assert not null is pass");
		Assert.assertNull("a");	
		System.out.println("assert null is pass");
		
		Assert.assertEquals("String Actual", "String Expected"); // FAIL
		System.out.println("assert equals is pass");		
		// It will not be print due to last assert is fail
	}
	
}
