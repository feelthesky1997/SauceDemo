package iv_SauceDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import i_makeMyTrip.I_SearchButtonFlight;
import iv_SauceDenmo.I_login;

public class TC1_SearchButton_Flight_Test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Akash\\PLC\\Self Work\\Software Testing\\Velocity Notes\\Selenium-Main-Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://saucedemo.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		I_login login = new I_login(driver);
		
		login.clickOnUserName();
		login.clickOnUserName();
		login.clickOnLoginButton();
	}
}
