package textNG_Project_4_SauceDemo.copy.copy;

import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import iv_SauceDenmo.IV_Menu;
import iv_SauceDenmo.I_login;
import setup.Base;


public class TestClass_4 extends Base{
	
	private WebDriver driver;
	private I_login login; 
	
	@Parameters ("browser")
	@BeforeTest
	public void launchBrowser(String BrowserName) throws InterruptedException
	{
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
		login = new I_login(driver);
		login.clickOnUserName();
		login.clickOnPassword();
		login.clickOnLoginButton();
		System.out.println("Before Method Pass");
	}
	
	@Test
	public void checkAddToCart() throws InterruptedException
	{
		System.out.println("Test is Pass");
		IV_Menu menu = new IV_Menu(driver);
		menu.clickOpenMenu();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.saucedemo.com/inventory.html");
		System.out.println(url);
		Thread.sleep(3000);
		menu.clickOnlogout();
		System.out.println("success");
	}
	
	@AfterClass
	public void cleanPOMObject()
	{
		login = null;
	}
	
	@AfterTest
	public void closes() {
		System.out.println("After Test Pass");
		driver.quit();
		System.gc();// delete the unused object 
	}
	
}

