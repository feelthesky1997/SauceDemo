package ii_swiggy_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ii_Swiggy.II_SearchFood;
import ii_Swiggy.I_homePageOrder;

public class TC0_Verify_Availability {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Akash\\PLC\\Self Work\\Software Testing\\Velocity Notes\\Selenium-Main-Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		I_homePageOrder order = new I_homePageOrder(driver);
		order.clickAndTypeLocation();
		order.select3rdLocation();
		order.clickOnSelectedLocation();
		
		II_SearchFood searchFood = new II_SearchFood(driver);
		searchFood.clickOnSearchRestoAndFood_Type();
		searchFood.selectOnFromDropDownListFood();
		searchFood.selectRestaurentFromDisplayedList();
		searchFood.verifyRestoDisplayedList();
		
		
	}
}
