package iii_flipcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class I_Homepage {
	@FindBy (xpath ="//button[@class='_2KpZ6l _2doB4z']") 
	private WebElement closePopUp;
	@FindBy (xpath ="//input[@title='Search for products, brands and more']") 
	private WebElement searchBox;
	@FindBy (xpath ="//button[@class=\"L0Z3Pu\"]") 
	private WebElement searchButton;
	
	public I_Homepage (WebDriver driver123) 
	{
		PageFactory.initElements(driver123, this);
	}
	
	
	// public method ( actions on WebElement)
		public void closeThePopUp()
		{
			closePopUp.click();
		}
		public void clickOnSearchBox_Type()
		{
			searchBox.click();
			searchBox.sendKeys("GoPro Camera");
		}
		public void clickOnSearchButton()
		{
			searchButton.click();
		}
}
