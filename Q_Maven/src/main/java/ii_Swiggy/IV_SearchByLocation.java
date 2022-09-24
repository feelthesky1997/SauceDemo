package ii_Swiggy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IV_SearchByLocation {
	@FindBy (xpath=("//input[@placeholder='Enter your delivery location']"))
	private WebElement ClickSearchLocationBox;
	@FindBy (xpath=("//button[@tabindex='3']"))
	private WebElement selectPerticularLocation;
	
	//Constructor// Intialization of the the variable 
	public IV_SearchByLocation(WebDriver driver123)
	{
		PageFactory.initElements(driver123, this);
	}
	
	//Method// use of the webelement
	public void clickOnSearchLocationBox()
	{
		ClickSearchLocationBox.click();
		ClickSearchLocationBox.sendKeys("Pune");
	}
	public void selectThePerticularLocation()
	{
		selectPerticularLocation.click();
	}
	
	
}
