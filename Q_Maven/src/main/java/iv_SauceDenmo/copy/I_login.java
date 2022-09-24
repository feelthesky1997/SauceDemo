package iv_SauceDenmo.copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.Utilities;

public class I_login extends Utilities{
	
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
		public void clickOnUserName() throws EncryptedDocumentException, IOException 
		{
			String path ="D:\\Akash\\PLC\\Self Work\\Software Testing\\Velocity Notes\\Selenium-Main-Files\\testData.xlsx";
			FileInputStream file = new FileInputStream (path);
			Workbook value = WorkbookFactory.create(file);
			Sheet	A	=value.getSheet("login");	
			Row B= A.getRow(1);		// 0 to 10	
			Cell C=B.getCell(1);	// 0 to 1
			String D=C.getStringCellValue();
			userName.click();
//			userName.sendKeys("standard_user");
			userName.sendKeys(D);
			System.out.println("excel");
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
