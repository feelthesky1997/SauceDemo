package iii_flipcart_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import iii_flipcart.I_Homepage;
import iii_flipcart.V_HeadersLink;

public class TC2_Headers {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Akash\\PLC\\Self Work\\Software Testing\\Velocity Notes\\Selenium-Main-Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
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

//		Thread.sleep(4000);
//		driver.quit();
		
	}
}
