package testNG_Project_2_Swiggy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ii_Swiggy.III_RestoPage;
import ii_Swiggy.II_SearchFood;
import ii_Swiggy.I_homePageOrder;

public class TestClass_2 {
private WebDriver driver;
	
	@BeforeClass
	public void beforeClass() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Akash\\PLC\\Self Work\\Software Testing\\Velocity Notes\\Selenium-Main-Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); // WebDriver declared outside
		driver.get("https://www.swiggy.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		System.out.println("BeforeClass");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void CheckCheckout()  throws InterruptedException
	{
		System.out.println("BeforeMethod");
		I_homePageOrder order = new I_homePageOrder(driver);
		Thread.sleep(3000);
		order.clickAndTypeLocation();
		order.select3rdLocation();
		order.clickOnSelectedLocation();
		
		II_SearchFood searchFood = new II_SearchFood(driver);
		searchFood.clickOnSearchRestoAndFood_Type();
		searchFood.selectOnFromDropDownListFood();
		searchFood.verifyRestoDisplayedList();
		searchFood.verifyRestoDisplayedList();
		
		III_RestoPage restoPage = new III_RestoPage(driver);
		restoPage.clickOnAddButton();
		restoPage.addQuantityOfOrderedProduct();
		restoPage.selectExactRestaurant();
		restoPage.selectTextOfChecklist();
		restoPage.clickOnCheckout();
	}
	@Test  
	public void tc1Checkout ()   {
		System.out.println("Print-Test");
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}
	
	
}
