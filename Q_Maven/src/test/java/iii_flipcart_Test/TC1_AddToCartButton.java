package iii_flipcart_Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import iii_flipcart.I_Homepage;
import iii_flipcart.II_SearchResult;
import iii_flipcart.III_SelectedResultHomePage;

public class TC1_AddToCartButton {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Akash\\PLC\\Self Work\\Software Testing\\Velocity Notes\\Selenium-Main-Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
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
	    SelectedResultHomePage.clickOnaddToCartButton();
	    
		
	}
}
