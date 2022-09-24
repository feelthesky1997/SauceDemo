package iv_SauceDenmo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class I_login {
	
//	private variales (WebElement)
	@FindBy (xpath ="//input[@id='user-name']") 
	private WebElement userName;
	@FindBy (xpath ="//input[@id='password']") 
	private WebElement password;
	@FindBy (xpath ="//input[@id='login-button']") 
	private WebElement login_button;
	
	
	public I_login (WebDriver driver123) 
	{
		PageFactory.initElements(driver123, this);
	}
	
	
	// public method ( actions on WebElement)
		public void clickOnUserName()
		{
			
			userName.click();
			userName.sendKeys("standard_user");
		}
		public void clickOnPassword()
		{
			password.click();
			password.sendKeys("secret_sauce");
		}
		public void clickOnLoginButton()
		{
			login_button.click();
			
		}
		
		
		
		
}
