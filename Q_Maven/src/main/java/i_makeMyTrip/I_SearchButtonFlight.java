package i_makeMyTrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class I_SearchButtonFlight {
	
//	private variales (WebElement)
	@FindBy (xpath ="//span[@class='chNavText darkGreyText'][1]") 
	private WebElement selectFlight;
	
	@FindBy (xpath ="//li[@data-cy='mulitiCityTrip']") 
	private WebElement multicity;
	
	@FindBy (xpath ="//input[@data-cy='fromAnotherCity0']") 
	private WebElement fromCity1;
	
	@FindBy (xpath ="//div[text()='BOM']") 
	private WebElement fromSelectCity1;
	
	@FindBy (xpath ="//p[text()='New Delhi, India']") 
	private WebElement toSelectedCity1;
	
	@FindBy (xpath ="(//div[@class='dateInnerCell'])[4]") 
	private WebElement departureDate;
	
	@FindBy (xpath ="//span[text()='Travellers & CLASS']") 
	private WebElement travelingclass;
	
	@FindBy (xpath ="//li[@ data-cy='adults-2']") 
	private WebElement adults;
	
	@FindBy (xpath ="//li[@ data-cy='children-2']") 
	private WebElement children;
	
	@FindBy (xpath ="//li[@ data-cy='infants-0']") 
	private WebElement infants;
	
	@FindBy (xpath ="//li[@ data-cy='travelClass-1']") 
	private WebElement choosetravelClass;
	
	@FindBy (xpath ="//button[@data-cy='travellerApplyBtn']") 
	private WebElement apply;
	
	@FindBy (xpath ="//input[@data-cy='fromAnotherCity1']") 
	private WebElement fromAnotherCityTab;
	
	@FindBy (xpath ="(//li[@id='react-autowhatever-1-section-1-item-0'])[1]") 
	private WebElement choosefromAnotherCity;
	
	@FindBy (xpath ="(//p[@class='font14 appendBottom5 blackText'][normalize-space()='New Delhi, India'])[1]") 
	private WebElement choosetoAnotherCity;
	
	@FindBy (xpath ="//div[@aria-label='Fri Sep 23 2022']") 
	private WebElement choosedeparture2;
	
	@FindBy (xpath ="//li[@class='font12 blackText latoBold wrapFilter  ']") 
	private WebElement armedForces;
	
	@FindBy (xpath ="//span[@class='langCardClose']") 
	private WebElement closeAdd;
	
	@FindBy (xpath ="//a[text()='Search']") 
	private WebElement search;
	
	public I_SearchButtonFlight (WebDriver driver123) 
	{
		PageFactory.initElements(driver123, this);
	}
	
	
	// public method ( actions on WebElement)
		public void multicityOption()
		{
			multicity.click();
		}
		public void clickFromCity1Option()
		{
			fromCity1.click();
		}
		public void fromSelectCity1()
		{
			fromSelectCity1.click();
		}
		public void departureTabOption()
		{
			toSelectedCity1.click();
		}
		public void departureDateOption()
		{
			departureDate.click();
		}
		public void travelingclassOption()
		{
			travelingclass.click();
		}
		public void adultsOption()
		{
			adults.click();
		}
		public void childrenOption()
		{
			children.click();
		}
		public void infantsOption()
		{
			infants.click();
		}
		public void choosetravelClassOption()
		{
			choosetravelClass.click();
		}
		public void applyOption()
		{
			apply.click();
		}
		public void fromAnotherCityTabOption()
		{
			fromAnotherCityTab.click();
		}
		public void choosefromAnotherCityOption()
		{
			choosefromAnotherCity.click();
		}
		public void choosetoAnotherCityOption()
		{
			choosetoAnotherCity.click();
		}
		public void choosedeparture2Option()
		{
			choosedeparture2.click();
		}
		public void clickOnArmedForcesOption()
		{
			armedForces.click();
		}
		public void closeTheAdvertize()
		{
			closeAdd.click();
		}
		public void clickOnSearchButton()
		{
			search.click();
			search.getText();
			String text=search.getText();
			System.out.println(text);
			
			if (text.equals("SEARCH"))
			{
				System.out.println("SearchButton is Oeprating and Test Case is PASS");
			}
			else
			{
				System.out.println("SearchButton is Not Operating and Test Case is FAIL");
			}
		}
		
		
		
}
