package suit_Learn;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class I_TC {

	@BeforeSuite 	
	public void beforeSuit ()
	{
		System.out.println("Before Suit Pass-1");
	}
	@BeforeTest 	
	public void beforeTest ()
	{
		System.out.println("Before Test Pass-1");
	}
	@BeforeClass 	
	public void beforeClass ()
	{
		System.out.println("Before Class Pass-1");
	}
	@BeforeMethod 	
	public void beforeMethod ()
	{
		System.out.println("Before Method Pass-1");
	}
	
	@Test	
	public void second()
	{
		System.out.println("Print Test");
	}
	 
	@AfterMethod	
	public void afterMethod	()
	{
		System.out.println("After Method Pass-1");
	}
	@AfterClass	
	public void afterClass	()
	{
		System.out.println("After Class Pass-1");
	}
	@AfterTest	
	public void afterTest()
	{
		System.out.println("After Test Pass-1");
	}
	@AfterSuite	
	public void afterSuit()
	{
		System.out.println("After Suit Pass-1");
	}
	 
} 


