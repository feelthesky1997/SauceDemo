package util;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utilities{
	
		public static void captureScreenshot(WebDriver driver, String screenshotName)
		{
			try 
			{
				TakesScreenshot ts = (TakesScreenshot)driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File("./Screenshots/"+screenshotName+".png"));
				System.out.println("Screenshot Taken");
			}
			catch(Exception e)
			{
				System.out.println("Exception is =  "+e.getMessage());
			}
		}
		
		public static void fetchDataFromExcel()
		{
			try
			{
				String path ="D:\\Akash\\PLC\\Self Work\\Software Testing\\Velocity Notes\\Selenium-Main-Files\\testData.xlsx";
				FileInputStream file = new FileInputStream (path);
				Workbook value = WorkbookFactory.create(file);
				Sheet	A	=value.getSheet("login");	
				Row B= A.getRow(1);		// 0 to 10				
				Cell C=B.getCell(1);	// 0 to 1
				String D=C.getStringCellValue();
				System.out.print(D+" , ");
			}
			catch (Exception f)
			{
				System.out.println("Exception is =  "+f.getMessage());
			}
		}
		
}

