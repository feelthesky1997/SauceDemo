package iii_flipcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class II_SearchResult {
	@FindBy (xpath ="//div[text()='GoPro Hero9 Sports and Action Camera']") 
	private WebElement selectResult;
	
	public II_SearchResult (WebDriver driver123) 
	{
		PageFactory.initElements(driver123, this);
	}
	
	// public method ( actions on WebElement)
		public void clickOnItemFromSearchResult()
		{
			selectResult.click();
		}
}
