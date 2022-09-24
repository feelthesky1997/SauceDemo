package i_makeMyTrip_Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import i_makeMyTrip.II_SearchHomeStays;
import i_makeMyTrip.IV_Properties;

public class TC4_VarifyProperties {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Akash\\PLC\\Self Work\\Software Testing\\Velocity Notes\\Selenium-Main-Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
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
		
		IV_Properties properties = new IV_Properties(driver);
		properties.varifyTheListIsDisplyedOrNot();
		
	}
}
