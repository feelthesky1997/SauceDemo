package i_makeMyTrip_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import i_makeMyTrip.III_PopularFilter;
import i_makeMyTrip.I_SearchButtonFlight;

public class TC3_VarifyFilters {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Akash\\PLC\\Self Work\\Software Testing\\Velocity Notes\\Selenium-Main-Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
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
		searchButton.clickOnSearchButton();
		
		III_PopularFilter sortedBy = new III_PopularFilter(driver);
		
		sortedBy.clickOnPopularFilterNonStopCheckBox();
		sortedBy.varifyAplliedFiltersIsDisplayedOrNOt();
		
	}
}
