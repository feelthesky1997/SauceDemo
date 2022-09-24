package iv_SauceDenmo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class II_Products {
	
//	private variales (WebElement)
	@FindBy (xpath ="//div[text()='Sauce Labs Backpack']") 
	private WebElement bag;
	@FindBy (xpath ="//button[text()='Add to cart']") 
	private WebElement addToCart;
	
	
	
	
	public II_Products (WebDriver driver123) 
	{
		PageFactory.initElements(driver123, this);
	}
	
	
	// public method ( actions on WebElement)
		public void clickOnBag()
		{
			bag.click();
		}
		public void clickOnAddToCart()
		{
			addToCart.click();
		}
		
		
		
		
		
		
}
