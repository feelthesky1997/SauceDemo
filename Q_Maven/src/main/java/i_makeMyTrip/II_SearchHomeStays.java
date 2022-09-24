package i_makeMyTrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class II_SearchHomeStays {
	@FindBy (xpath=("//span[text()='Homestays']"))
	private  WebElement homeStays;
	@FindBy (xpath=("//input[@id=\"city\"]"))
	private  WebElement clickCitytab;
	@FindBy (xpath=("(//span[text()='City'])[1]"))
	private  WebElement selectCity;
	@FindBy (xpath=("(//div[@aria-label='Thu Sep 29 2022'])[1]"))
	private  WebElement checkIn;
	@FindBy (xpath=("//div[@aria-label='Mon Oct 31 2022']"))
	private  WebElement checkOut;
	@FindBy (xpath=("//input[@id='guest']"))
	private  WebElement guests;
	@FindBy (xpath=("//li[@data-cy='adults-2']"))
	private  WebElement adults;
	@FindBy (xpath=("//button[@class='primaryBtn btnApply']"))
	private  WebElement apply;
	@FindBy (xpath=("//span[@data-cy='travelForText']"))
	private  WebElement travellFor;
	@FindBy (xpath=("//li[@data-cy='Work']"))
	private  WebElement work;
	@FindBy (xpath=("//label[@for='Kitchenette']"))
	private  WebElement chooseFilter;
	@FindBy (xpath=("//button[@id='hsw_search_button']"))
	private  WebElement search;
	// Constructor
	public II_SearchHomeStays (WebDriver driver123)
	{
		PageFactory.initElements(driver123, this);
	}
	// Methods
	public  void selectHomeStaysOption()
	{
		homeStays.click();
	}
	public  void clickOnEnterCityTab()
	{
		clickCitytab.click();
	}
	public  void selectCityName()
	{
		selectCity.click();
	}
	public  void selectCheckInDate()
	{
		checkIn.click();
	}
	public  void selectCheckOutDate()
	{
		checkOut.click();
	}
	public  void selectAdultsCount()
	{
		guests.click();
	}
	public  void clickOnApplyButton()
	{
		apply.click();
	}
	public  void clickonTravellForOption()
	{
		travellFor.click();
	}
	public  void selectTravellForOptionWork()
	{
		work.click();
	}
	public  void clickOnKitchenetteFilter()
	{
		chooseFilter.click();
	}
	public  void clickOnSearchButton()
	{
		search.click();
	}
	
}
