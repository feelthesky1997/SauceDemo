package i_makeMyTrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class III_PopularFilter {
	@FindBy (xpath ="(//span[@class=\"check\"])[1]") 
	private WebElement popularFilter;
	@FindBy (xpath ="//p[text()='Applied Filters']") 
	private WebElement appliedFilters;
	
	
	public III_PopularFilter (WebDriver driver123) 
	{
		PageFactory.initElements(driver123, this);
	}
	// public method ( actions on WebElement)
		public void clickOnPopularFilterNonStopCheckBox()
		{
			popularFilter.click();
		}
		public void varifyAplliedFiltersIsDisplayedOrNOt()
		{
			
			boolean varify =appliedFilters.isDisplayed();
			
			if ( varify==true)
			{
				System.out.println("Successfully applied filter and test case is PASS");
			}
			else
			{
				System.out.println("Not apllied any filter and tast case FAIL");
			}
		}
		
}
