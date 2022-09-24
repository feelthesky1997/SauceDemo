package assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	
	SoftAssert softAssert = new SoftAssert();
	
	@Test (priority=1)
	public void I_softAssert() 
	{
		softAssert.assertTrue(true);
	}
	@Test (priority=2)
	public void II_softAssert()
	{
		softAssert.assertFalse(false);
	}
	@Test (priority=3)
	public void III_softAssert()
	{
		softAssert.assertEquals("akash","akash");
	}
	
}
