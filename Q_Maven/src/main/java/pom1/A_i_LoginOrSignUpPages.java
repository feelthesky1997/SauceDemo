package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A_i_LoginOrSignUpPages {
	
	//	private variales (WebElement)
	@FindBy (xpath ="//input[@id='email']") 
	private WebElement userName;
	
	@FindBy (xpath ="//input[@id='pass']") 
	private WebElement password;
	
	@FindBy (xpath ="//button[@name='login']") 
	private WebElement loginButton;
	
	@FindBy (xpath ="//a[text()='Create New Account']") 
	private WebElement createNewAccount;
	
	@FindBy (xpath ="//a[text()='Messenger']") 
	private WebElement messengerLink;
	
	// public constructor (To initialize the WebElement)
	public A_i_LoginOrSignUpPages (WebDriver driver123) // driver123 = driver=new Chromedriver()
	{
		PageFactory.initElements(driver123, this);
	}
	
	// public method ( actions on WebElement)
	public void sendUserName()
	{
		userName.sendKeys("w2.sky.velocity@gmail.com");
	}
	public void sendPassword()
	{
		password.sendKeys("9172396564");
	}
	public void clickLoginButton()
	{
		loginButton.click();
	}
	public void clickOnCreateNewAccount()
	{
		createNewAccount.click();
	}
	public void openMessenger()
	{
		messengerLink.click();
	}

	


}
