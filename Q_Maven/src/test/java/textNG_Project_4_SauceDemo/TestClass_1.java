package textNG_Project_4_SauceDemo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import iv_SauceDenmo.I_login;


public class TestClass_1 {
	
	private WebDriver driver;
	
	@BeforeClass
	public void beforeClass() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Akash\\PLC\\Self Work\\Software Testing\\Velocity Notes\\Selenium-Main-Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); // WebDriver declared outside
		driver.get("http://saucedemo.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		System.out.println("Print-Before Class");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Before Class Pass");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		I_login login = new I_login(driver);
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
	
	@AfterClass
	public void close() {
		driver.quit();
	}
	
}

