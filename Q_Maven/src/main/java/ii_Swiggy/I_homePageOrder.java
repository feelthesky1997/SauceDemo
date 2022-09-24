package ii_Swiggy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class I_homePageOrder {
	//WebElement// Declaration of variable or webelement
	@FindBy (xpath=("//input[@placeholder='Enter your delivery location']"))
	private WebElement clickBoxLocation_Type;
	@FindBy (xpath=("//button[@tabindex='2']"))
	private WebElement selectLocation;
	@FindBy (xpath=("//span[text()='Search']"))
	private WebElement clickSelectedLocation;
	@FindBy (xpath=("//input[@placeholder='Search for restaurants and food']"))
	private WebElement searchRestoAndFood;
	
	//Constructor// Intialization of the the variable 
	public I_homePageOrder(WebDriver driver123)
	{
		PageFactory.initElements(driver123, this);
	}
	
	//Method// use of the webelement
	public void clickAndTypeLocation()
	{
		clickBoxLocation_Type.click();
		clickBoxLocation_Type.sendKeys("Gurgaon");
	}
	public void select3rdLocation()
	{
		selectLocation.click();
	}
	public void clickOnSelectedLocation()
	{
		clickSelectedLocation.click();
	}
}
