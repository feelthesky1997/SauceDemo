package ii_Swiggy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class V_Headers {
	
	@FindBy (xpath=("//a[@href='/offers/restaurant']"))
	private WebElement offersOptionLinkHeader;
	@FindBy (xpath=("//a[@href='/support']"))
	private WebElement support;
	@FindBy (xpath=("//span[text()='Search']"))
	private WebElement search;
	@FindBy (xpath=("//span[text()='Cart']"))
	private WebElement cart;
	@FindBy (xpath=("//span[text()='Sign In']"))
	private WebElement signIn;
	
	
	//Constructor// Intialization of the the variable 
	public V_Headers(WebDriver driver123)
	{
		PageFactory.initElements(driver123, this);
	}
	
	//Method// use of the webelement
	public void clickOnOffersLinkHeader()
	{
		offersOptionLinkHeader.click();
	}
	public void clickOnHelpLinkHeader()
	{
		support.click();
	}
	public void clickOnSearchLinkHeader()
	{
		search.click();
	}
	public void clickOnCartLinkHeader()
	{
		cart.click();
	}
	public void clickOnSignInLinkHeader()
	{
		signIn.click();
	}
	
}
