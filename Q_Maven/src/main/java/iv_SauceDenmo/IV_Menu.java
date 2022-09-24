package iv_SauceDenmo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IV_Menu {
	
//	private variales (WebElement)
	@FindBy (xpath ="//button[text()='Open Menu']") 
	private WebElement menu;
	@FindBy (xpath ="//a[text()='All Items']") 
	private WebElement allItem;
	@FindBy (xpath ="//a[text()='About']") 
	private WebElement about;
	@FindBy (xpath ="//a[text()='Logout']") 
	private WebElement logout;
	@FindBy (xpath ="//a[text()='Reset App State']") 
	private WebElement resetAppState;
	
	
	public IV_Menu (WebDriver driver123) 
	{
		PageFactory.initElements(driver123, this);
	}
	
	// public method ( actions on WebElement)
		public void clickOpenMenu()
		{
			menu.click();
			System.out.println("clickOpenMenu method pass");
		}
		public void clickallItem()
		{
			allItem.click();
			System.out.println("clickallItem method pass");
		}
		public void clickOnabout()
		{
			about.click();
			System.out.println("clickOnabout method pass");

		}
		public void clickOnlogout()
		{
			logout.click();
			System.out.println("clickOnlogout method pass");

		}
		public void clickOnResetAppState()
		{
			resetAppState.click();
			System.out.println("clickOnResetAppState method pass");

		}
		
		
		
		
		
}
