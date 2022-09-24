package iii_flipcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IV_PlaceOrder {
	@FindBy (xpath ="//span[text()='Place Order']") 
	private WebElement placeOrderButton;
	
	public IV_PlaceOrder (WebDriver driver123) 
	{
		PageFactory.initElements(driver123, this);
	}
	
	// public method ( actions on WebElement)
		public void clickOnPlaceOrderButton()
		{
			placeOrderButton.click();
		}
}
