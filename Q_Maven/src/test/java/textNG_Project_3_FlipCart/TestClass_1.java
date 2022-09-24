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

public class TestClass_1 {
	
	private WebDriver driver;
	
	@BeforeClass
	public void beforeClass() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Akash\\PLC\\Self Work\\Software Testing\\Velocity Notes\\Selenium-Main-Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); // WebDriver declared outside
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		System.out.println("BeforeClass");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void addToCart()  throws InterruptedException
	{
		System.out.println("BeforeMethod");

		I_Homepage homepage = new I_Homepage(driver);
		homepage.closeThePopUp();
		homepage.clickOnSearchBox_Type();
		homepage.clickOnSearchButton();
		
		II_SearchResult searchResult = new II_SearchResult(driver);
		searchResult.clickOnItemFromSearchResult();
		
		ArrayList<String> nextTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(nextTab.get(1));
		System.out.println(driver.getCurrentUrl());
		 
	    III_SelectedResultHomePage SelectedResultHomePage = new III_SelectedResultHomePage(driver);
	    Thread.sleep(2000);
		SelectedResultHomePage.clickOnaddToCartButton();
	}
	
	@Test  
	public void tc1CheckTheaddToCart ()   {
		System.out.println("Print-Test");
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}
}
