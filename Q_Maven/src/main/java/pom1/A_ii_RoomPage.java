package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A_ii_RoomPage {
	
	@FindBy (xpath="//a [text()= ' Return to messenger.com ']")
	private WebElement returnToMessenger ;
	@FindBy (xpath="//a [text()= '  Visit our help center ']")
	private WebElement helpCenter ;
	
	public A_ii_RoomPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void goBackToMessenger()
	{
		returnToMessenger.click();
	}
	public void contactToHelpCenter()
	{
		helpCenter.click();
	}
}
