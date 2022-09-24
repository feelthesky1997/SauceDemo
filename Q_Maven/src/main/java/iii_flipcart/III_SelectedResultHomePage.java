package iii_flipcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class III_SelectedResultHomePage {
	@FindBy (xpath ="//button[text()='ADD TO CART']") 
	private WebElement addToCart;
	
	public III_SelectedResultHomePage (WebDriver driver123) 
	{
		PageFactory.initElements(driver123, this);
	}
	
	// public method ( actions on WebElement)
		public void clickOnaddToCartButton()
		{
			
			Boolean text = addToCart.getText().equals("ADD TO CART");
			System.out.println(text);
			if (text==true)
			{
				System.out.println("Add To Cart Button is Operating");
			}
			else
			{
				System.out.println("Add To Cart Button is not Operating");
			}
			addToCart.click();
			
		}
}
