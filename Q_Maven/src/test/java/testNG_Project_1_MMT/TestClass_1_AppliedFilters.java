package testNG_Project_1_MMT;

import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import i_makeMyTrip.III_PopularFilter;
import i_makeMyTrip.I_SearchButtonFlight;


public class TestClass_1_AppliedFilters {
	
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
	public void clickOnSearchButton() {
		I_SearchButtonFlight searchButton = new I_SearchButtonFlight(driver);
		searchButton.multicityOption();
		searchButton.clickFromCity1Option();
		searchButton.fromSelectCity1();
		searchButton.departureTabOption();
		searchButton.travelingclassOption();
		searchButton.adultsOption();
		searchButton.childrenOption();
		searchButton.infantsOption();
		searchButton.choosetravelClassOption();
		searchButton.applyOption();
		searchButton.fromAnotherCityTabOption();
		searchButton.choosefromAnotherCityOption();
		searchButton.choosetoAnotherCityOption();;
		searchButton.choosedeparture2Option();
		searchButton.clickOnArmedForcesOption();
		searchButton.closeTheAdvertize();
//		searchButton.clickOnSearchButton();
	}
	@Test
	public void tc1checkSearchButtonOpeation() throws InterruptedException
	{
		System.out.println("Print-Test");
		
		I_SearchButtonFlight searchButton = new I_SearchButtonFlight(driver);
		searchButton.clickOnSearchButton();
		Thread.sleep(2000);
		
		III_PopularFilter sortedBy = new III_PopularFilter(driver);
		
		sortedBy.clickOnPopularFilterNonStopCheckBox();
		sortedBy.varifyAplliedFiltersIsDisplayedOrNOt();
		
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}
	
}

