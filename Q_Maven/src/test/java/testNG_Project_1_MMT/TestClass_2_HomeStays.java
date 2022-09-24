package testNG_Project_1_MMT;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import i_makeMyTrip.II_SearchHomeStays;
import i_makeMyTrip.IV_Properties;

public class TestClass_2_HomeStays {
private WebDriver driver;
	
	@BeforeClass
	public void beforeClass() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Akash\\PLC\\Self Work\\Software Testing\\Velocity Notes\\Selenium-Main-Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); // WebDriver declared outside
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		System.out.println("Print-Before Class");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void searchForHomeStays() {
		II_SearchHomeStays searchHomeStays= new II_SearchHomeStays(driver);
		searchHomeStays.selectHomeStaysOption();
		searchHomeStays.clickOnEnterCityTab();
		searchHomeStays.selectCityName();
		searchHomeStays.selectCheckInDate();
		searchHomeStays.selectCheckOutDate();
		searchHomeStays.selectAdultsCount();
		searchHomeStays.clickOnApplyButton();
		searchHomeStays.clickonTravellForOption();
		searchHomeStays.selectTravellForOptionWork();
		searchHomeStays.clickOnKitchenetteFilter();
		searchHomeStays.clickOnSearchButton();
	}
	@Test
	public void tc1checkSearchForHomeStays() throws InterruptedException
	{
		System.out.println("Print-Test");
		
		IV_Properties properties = new IV_Properties(driver);
		properties.varifyTheListIsDisplyedOrNot();
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}
}
