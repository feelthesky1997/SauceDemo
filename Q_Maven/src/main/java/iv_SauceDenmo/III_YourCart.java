package iv_SauceDenmo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class III_YourCart {
	
//	private variales (WebElement)
	@FindBy (xpath ="//button[text()='Remove']") 
	private WebElement remove;
	@FindBy (xpath ="//button[text()='Checkout']") 
	private WebElement checkout;
	@FindBy (xpath ="//a[@class='shopping_cart_link']") 
	private WebElement cartLink;
	
	
	public III_YourCart (WebDriver driver123) 
	{
		PageFactory.initElements(driver123, this);
	}
	
	
	// public method ( actions on WebElement)
		public void clickRemove()
		{
			String text=remove.getText();
			System.out.println(text);
			remove.click();
			System.out.println("click Remove method pass");
		}
		public void clickOnCheckout()
		{
			checkout.click();
		}
		public void clickOnCartLink()
		{
			cartLink.click();
		}
		
		
		
		
		
}
