package ii_swiggy_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ii_Swiggy.IV_SearchByLocation;
import ii_Swiggy.V_Headers;

public class TC2_HeaderLink {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Akash\\PLC\\Self Work\\Software Testing\\Velocity Notes\\Selenium-Main-Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		IV_SearchByLocation offer = new IV_SearchByLocation(driver);
		offer.clickOnSearchLocationBox();
		offer.selectThePerticularLocation();
		
		V_Headers offersOption =new V_Headers(driver);
		offersOption.clickOnOffersLinkHeader();
		System.out.println(driver.getCurrentUrl());
		offersOption.clickOnHelpLinkHeader();
		System.out.println(driver.getCurrentUrl());
		offersOption.clickOnSearchLinkHeader();
		System.out.println(driver.getCurrentUrl());
		offersOption.clickOnCartLinkHeader();
		System.out.println(driver.getCurrentUrl());
		offersOption.clickOnSignInLinkHeader();
		System.out.println(driver.getCurrentUrl());
		
//		Thread.sleep(4000);
//		driver.quit();
	}
}
