package ii_Swiggy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class III_RestoPage {
	//WebElement// Declaration of variable or webelement
	
		@FindBy (xpath=("(//div[text()='ADD'])[1]"))
		private WebElement  addButton;
		@FindBy (xpath=("(//div[@class='_1ds9T'])[1]"))
		private WebElement addQuantity;
		@FindBy (xpath=("(//a[@class='styles_restaurant__20fB8'])[1]"))
		private WebElement selectExactResto;
		@FindBy (xpath=("//button[@class='_1gPB7']"))
		private WebElement checkoutButton;
		

		//Constructor// Intialization of the the variable 
		public III_RestoPage(WebDriver driver123)
		{
			PageFactory.initElements(driver123, this);
		}
		
		//Method// use of the webelement
		public void clickOnAddButton()
		{
			addButton.click();
		}
		public void addQuantityOfOrderedProduct()
		{
			addQuantity.click();
		}
		public void selectExactRestaurant()
		{
			selectExactResto.click();
		}
		
		public void selectTextOfChecklist()
		{
			Boolean text = checkoutButton.getText().equals("CHECKOUT ?");
			System.out.println(text);
			if (text==false)
			{
				System.out.println("Checkout Button is Operating and Your order is placed");
			}
			else
			{
				System.out.println("Checkout Button isnt Operating and Your order is not placed");
			}
		}
		public void clickOnCheckout()
		{
			checkoutButton.click();
		}
		
}
