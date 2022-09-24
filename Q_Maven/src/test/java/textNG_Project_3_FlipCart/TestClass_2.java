package textNG_Project_3_FlipCart;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import iii_flipcart.III_SelectedResultHomePage;
import iii_flipcart.II_SearchResult;
import iii_flipcart.I_Homepage;
import iii_flipcart.V_HeadersLink;

public class TestClass_2 {
	
	private WebDriver driver;
	
	@BeforeClass
	public void beforeClass() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Akash\\PLC\\Self Work\\Software Testing\\Velocity Notes\\Selenium-Main-Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); // WebDriver declared outside
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		System.out.println("Before Class");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void checkHeadersLink()  throws InterruptedException
	{
		System.out.println("BeforeMethod");
		I_Homepage homepage = new I_Homepage(driver);
		homepage.closeThePopUp();
		
		V_HeadersLink headersLink = new V_HeadersLink(driver);
		headersLink.clickOnTopOffers();
		System.out.println(driver.getCurrentUrl());
//		headersLink.clickOnGrocery();
//		System.out.println(driver.getCurrentUrl());
//		headersLink.clickOnMobiles();
//		System.out.println(driver.getCurrentUrl());
//		headersLink.clickOnAppliances();
//		System.out.println(driver.getCurrentUrl());
//		headersLink.clickOnTravel();
//		System.out.println(driver.getCurrentUrl());
	}
	
	@Test  
	public void tc1CheckTheHeadersLinks ()   {
		System.out.println("Print-Test");
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}
}
