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

import iv_SauceDenmo.III_YourCart;
import iv_SauceDenmo.II_Products;
import iv_SauceDenmo.I_login;
import setup.Base;


public class TestClass_2 extends Base{
	
	private WebDriver driver;
	private I_login login; 
	private II_Products productCartLink;
	private III_YourCart yourCart;
	
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
		productCartLink =new II_Products(driver);
	    yourCart = new III_YourCart(driver);
	}
	@BeforeMethod
	public void beforeMethod() {
		
		login.clickOnUserName();
		login.clickOnPassword();
		login.clickOnLoginButton();
		productCartLink.clickOnBag();	
		productCartLink.clickOnAddToCart();	
		yourCart.clickOnCartLink();
		
		System.out.println("Before Method Pass");		
	}
	@Test
	public void checkAddToCart() throws InterruptedException
	{
		System.out.println("Print-Test");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Swag Labs");
		System.out.println(title);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.saucedemo.com/cart.html");
		System.out.println(url);
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

