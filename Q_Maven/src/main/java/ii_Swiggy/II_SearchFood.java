package ii_Swiggy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class II_SearchFood {
	
	//WebElement// Declaration of variable or webelement
	@FindBy (xpath=("//input[@placeholder='Search for restaurants and food']"))
	private WebElement searchRestoAndFood;
	@FindBy (xpath=("(//div[@class='_23LIV'])[1]"))
	private WebElement selectFromDropDown;
	@FindBy (xpath=("(//div[@class='Search_widgetsV2__27BBR Search_widgets__3o_bA'])[1]"))
	private WebElement checkVisibilityFromDropDown;
	
	@FindBy (xpath=("(//div[contains(text(),'ADD')])[1]"))
	private WebElement selectRestaurent;

	//Constructor// Intialization of the the variable 
	public II_SearchFood(WebDriver driver123)
	{
		PageFactory.initElements(driver123, this);
	}
	
	//Method// use of the webelement
	public void clickOnSearchRestoAndFood_Type()
	{
		searchRestoAndFood.click();
		searchRestoAndFood.sendKeys("Chakli");
	}
	public void selectOnFromDropDownListFood()
	{
		selectFromDropDown.click();
	}
	public void selectRestaurentFromDisplayedList()
	{
		selectRestaurent.click();
	}
	public void verifyRestoDisplayedList() throws InterruptedException
	{
		System.out.println("See Restaurenrt availability: ");
		System.out.println(checkVisibilityFromDropDown.getText());
		
		
		if (checkVisibilityFromDropDown.isDisplayed())
			{
				System.out.println("Restaurents are open and U can can place Order");
			}
			else
			{
				System.out.println("Restaurents are closed and U can can not place Order");
			}
		Thread.sleep(1000);
//		selectRestaurent.click();
	}
	
}
