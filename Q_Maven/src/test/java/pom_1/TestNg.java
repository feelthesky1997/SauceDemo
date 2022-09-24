package pom_1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg {

	@BeforeClass 
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
	@Test
	public void test13()
	{
		System.out.println("Test1");
	}
	
	@Test
	public void test22()
	{
		System.out.println("Test2");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Class");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}
	
}
