package iii_flipcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class V_HeadersLink 
{
	@FindBy (xpath ="//div[text()='Top Offers']") 
	private WebElement topOffers;
	@FindBy (xpath ="//div[text()='Grocery']") 
	private WebElement grocery;
	@FindBy (xpath ="//div[text()='Mobiles']") 
	private WebElement mobiles;
	@FindBy (xpath ="//div[text()='//div[text()='Fashion']']") 
	private WebElement fashion;
	@FindBy (xpath ="//div[text()='//div[text()='Electronics']']") 
	private WebElement electronics;
	@FindBy (xpath ="//div[text()='//div[text()='Home']']") 
	private WebElement home;
	@FindBy (xpath ="//div[text()='//div[text()='Appliances']']") 
	private WebElement appliances;
	@FindBy (xpath ="//div[text()='//div[text()='Travel']']") 
	private WebElement travel;
	@FindBy (xpath ="//div[text()='//div[text()='Beauty, Toys & More']']") 
	private WebElement beauty;
	
	public V_HeadersLink (WebDriver driver123) 
	{
		PageFactory.initElements(driver123, this);
	}
	
	// public method ( actions on WebElement)
		public void clickOnTopOffers() throws InterruptedException
		{
			
			Boolean text = topOffers.getText().equals("Top Offers");
			System.out.println(text);
			if (text==true)
			{
				System.out.println("Top Offers Header Option is working");
			}
			else
			{
				System.out.println("Top Offers Header Option is not working");
			}
			Thread.sleep(3000);
			topOffers.click();
		}
		public void clickOnGrocery() throws InterruptedException
		{
			Boolean text = grocery.getText().equals("Grocery");
			System.out.println(text);
			if (text==true)
			{
				System.out.println("Grocery Header Option is working");
			}
			else
			{
				System.out.println("Grocery Header Option is not working");
			}
			Thread.sleep(3000);
			grocery.click();
		}
		public void clickOnMobiles() throws InterruptedException
		{
			Boolean text = mobiles.getText().equals("Mobiles");
			System.out.println(text);
			if (text==true)
			{
				System.out.println("Grocery Header Option is working");
			}
			else
			{
				System.out.println("Grocery Header Option is not working");
			}
			Thread.sleep(3000);
			grocery.click();
			mobiles.click();
		}
		public void clickOnFashion() throws InterruptedException
		{
			Boolean text = fashion.getText().equals("Fashion");
			System.out.println(text);
			if (text==true)
			{
				System.out.println("Fashion Header Option is working");
			}
			else
			{
				System.out.println("Fashion Header Option is not working");
			}
			Thread.sleep(3000);
			fashion.click();
		}
		public void clickOnElectronics() throws InterruptedException
		{
			Boolean text = electronics.getText().equals("Electronics");
			System.out.println(text);
			if (text==true)
			{
				System.out.println("Electronics Header Option is working");
			}
			else
			{
				System.out.println("Electronics Header Option is not working");
			}
			Thread.sleep(3000);
			electronics.click();
		}
		public void clickOnHome() throws InterruptedException
		{
			Boolean text = home.getText().equals("Home");
			System.out.println(text);
			if (text==true)
			{
				System.out.println("Home Header Option is working");
			}
			else
			{
				System.out.println("Home Header Option is not working");
			}
			Thread.sleep(3000);
			home.click();
		}
		public void clickOnAppliances() throws InterruptedException
		{
			Boolean text = appliances.getText().equals("Appliances");
			System.out.println(text);
			if (text==true)
			{
				System.out.println("Appliances Header Option is working");
			}
			else
			{
				System.out.println("Appliances Header Option is not working");
			}
			Thread.sleep(3000);
			appliances.click();
		}
		public void clickOnTravel() throws InterruptedException
		{
			Boolean text = travel.getText().equals("Travel");
			System.out.println(text);
			if (text==true)
			{
				System.out.println("Travel Header Option is working");
			}
			else
			{
				System.out.println("Travel Header Option is not working");
			}
			Thread.sleep(3000);
			travel.click();
		}
		public void clickOnBeauty() throws InterruptedException
		{
			Boolean text = beauty.getText().equals("Beauty, Toys & More");
			System.out.println(text);
			if (text==true)
			{
				System.out.println("Beauty, Toys & More Header Option is working");
			}
			else
			{
				System.out.println("Beauty, Toys & More Header Option is not working");
			}
			Thread.sleep(3000);
			beauty.click();
		}
}
