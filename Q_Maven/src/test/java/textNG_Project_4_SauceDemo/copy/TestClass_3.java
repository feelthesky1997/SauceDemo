package textNG_Project_4_SauceDemo.copy;

import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
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


public class TestClass_3 {
	
	private WebDriver driver;
	private I_login login; 
	private II_Products productCartLink;
	
	@Parameters ("browser")
	@BeforeTest
	public void launchBrowser(String BrowserName) throws InterruptedException
	{
		if (BrowserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Akash\\PLC\\Self Work\\Software Testing\\Velocity Notes\\Selenium-Main-Files\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver(); // WebDriver declared outside
		}
		if (BrowserName.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver","D:\\Akash\\PLC\\Self Work\\Software Testing\\Velocity Notes\\Selenium-Main-Files\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver(); // WebDriver declared outside
		}
		if (BrowserName.equals("Opera"))
		{
			System.setProperty("webdriver.opera.driver","D:\\Akash\\PLC\\Self Work\\Software Testing\\Velocity Notes\\Selenium-Main-Files\\operadriver_win32\\operadriver_win32\\operadriver.exe");
			driver = new OperaDriver(); // WebDriver declared outside
		}
		driver.get("http://saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeClass
	public void beforeClass() {
		 login = new I_login(driver);
		 productCartLink =new II_Products(driver);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		login = new I_login(driver);
		login.clickOnUserName();
		login.clickOnPassword();
		login.clickOnLoginButton();
		productCartLink =new II_Products(driver);
		productCartLink.clickOnBag();	
		productCartLink.clickOnAddToCart();	
		System.out.println("Before Method Pass");		
	}
	@Test
	public void checkAddToCart() throws InterruptedException
	{
		System.out.println("Test is Pass");
		
		III_YourCart yourCart = new III_YourCart(driver);
		yourCart.clickRemove();
	}
	
	@AfterClass
	public void cleanPOMObject()
	{
		login = null;
	}
	
	@AfterTest
	public void close() {
		System.out.println("After Test Pass");
		driver.close();
		System.gc();// delete the unused object 
	}
}

