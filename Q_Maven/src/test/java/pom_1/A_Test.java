package pom_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom1.A_i_LoginOrSignUpPages;
import pom1.A_ii_RoomPage;
import pom1.A_iii_MessengerPage;

public class A_Test {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Akash\\PLC\\Self Work\\Software Testing\\Velocity Notes\\Selenium-Main-Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		// Now we are creating object for loginPage
		A_i_LoginOrSignUpPages loginOrSignUpPages = new A_i_LoginOrSignUpPages (driver);
		loginOrSignUpPages.openMessenger();
		String loginOrSignUpPagesURL =  driver.getCurrentUrl();
		if (loginOrSignUpPagesURL.equals("https://www.messenger.com/"))
		{
			System.out.println("Messenger URL is verified");
		}
		else
		{
			System.out.println("Messenger URL is Wrong");
		}
		
		// Now we are creating object for messegner
		A_iii_MessengerPage messengerPage = new A_iii_MessengerPage(driver);
		messengerPage.openRoom();
		String messengerPageURL =driver.getCurrentUrl();
		if (messengerPageURL.equals("https://www.messenger.com/rooms"))
		{
			System.out.println(" messenger URL is varified");
		}
		else
		{
				System.out.println("messenger URL is varified wrong");
		}
		
		// Now we are creating object for roompage
		A_ii_RoomPage roompage = new A_ii_RoomPage(driver);
		roompage.goBackToMessenger();
		String roompageURL=driver.getCurrentUrl();
		String roompageTitle=driver.getTitle();
		
		if (roompageURL.equals("https://www.messenger.com/") && roompageTitle.equals("Messenger"))
		{
			System.out.println(" Test Case is PASS");
		}
		else
		{
				System.out.println("Test case is FAIL");
		}
	
	}
}
