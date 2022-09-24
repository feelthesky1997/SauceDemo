package i_makeMyTrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IV_Properties {
	@FindBy (xpath=("//div[@id='Listing_hotel_0']"))
	private  WebElement listedHotel;
	// Constructor
	public IV_Properties (WebDriver driver123)
	{
		PageFactory.initElements(driver123, this);
	}
	// Methods
	public  void varifyTheListIsDisplyedOrNot()
	{
		boolean varify =listedHotel.isDisplayed();
		if ( varify==true)
		{
			System.out.println("Successfully Listed Hotels and test case is PASS");
		}
		else
		{
			System.out.println("Not Listed Hotels and tast case is FAIL");
		}
	}
}
