package textNG_Project_5_Screenshot;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import iv_SauceDenmo.I_login;
import setup.Base;
import utils.Utility;


public class TestClass_1 extends Base{
	
	private WebDriver driver;
	private I_login login; 
	
	@Parameters ("browser")
	@BeforeTest
	public void launchBrowser(String BrowserName) 
	{
		System.out.println(BrowserName);
		if (BrowserName.equals("Chrome"))
		{
			driver =launchChromeBrowser();
		}
		if (BrowserName.equals("Edge"))
		{
			driver =launchEdgeBrowser();
		}
		if (BrowserName.equals("Opera"))
		{
			driver =launchOperaBrowser();
		}
		driver.get("http://saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeClass
	public void beforeClass() {
		 login = new I_login(driver);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		login.clickOnUserName();
		login.clickOnPassword();
		login.clickOnLoginButton();
		System.out.println("Before Method Pass");
		
	}
	@Test
	public void testLoginButton() throws InterruptedException
	{
		
		System.out.println("Print-Test");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Swag Labs");
		System.out.println(title);
	}
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if (ITestResult.SUCCESS==result.getStatus())
		{
			String tc_1 = "001"; 
			LocalDate LD = LocalDate.now();
			LocalTime LT = LocalTime.now();
			String x = LD.toString().replace(":", "").replace(" ", "");
			String y = LT.toString().replace(":", "").replace(" ", "");
			Utility.captureScreenshot(driver, "Test-"+tc_1+" "+x+" "+y);
		}
	}
	
	@AfterClass
	public void cleanPOMObject()
	{
		login = null;
	}
	
	@AfterTest
	public void closes() {
		System.out.println("After Test Pass");
		driver.close();
		System.gc();// delete the unused object 
	}
	
}

