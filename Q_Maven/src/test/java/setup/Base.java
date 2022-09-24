package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Base { 
	
	public static WebDriver driver;

	public static WebDriver launchChromeBrowser ()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Akash\\PLC\\Self Work\\Software Testing\\Velocity Notes\\Selenium-Main-Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); // WebDriver declared outside
		return driver;
		
	}
	public static WebDriver launchEdgeBrowser ()
	{
		System.setProperty("webdriver.edge.driver","D:\\Akash\\PLC\\Self Work\\Software Testing\\Velocity Notes\\Selenium-Main-Files\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver(); // WebDriver declared outside
		return driver;
	}
	public static WebDriver launchOperaBrowser ()
	{
		System.setProperty("webdriver.opera.driver","D:\\Akash\\PLC\\Self Work\\Software Testing\\Velocity Notes\\Selenium-Main-Files\\operadriver_win32\\operadriver_win32\\operadriver.exe");
		driver = new OperaDriver(); // WebDriver declared outside
		return driver;
	}
	
	// we can write like ths to fetch driver path from the driver folder of maven project
//	public static WebDriver launchOperaBrowsers ()
//	{
//		System.setProperty("webdriver.opera.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe ");
//		driver = new OperaDriver(); // WebDriver declared outside
//		return driver;
//	}
}
