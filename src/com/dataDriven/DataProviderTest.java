package com.dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataProviderTest {
	WebDriver driver;
	
	@DataProvider(name= "testData")
	public String[][] dataProvider() throws BiffException, IOException
	{
		String[][] testData=readFromXl();
		return testData;
	}
	
	public String[][] readFromXl() throws BiffException, IOException
	{
		FileInputStream excel= new FileInputStream("C:\\Users\\vrind\\OneDrive\\Documents\\Test data.xls");
		Workbook workbook = Workbook.getWorkbook(excel);
		Sheet sheet= workbook.getSheet(0);
		
		int columnCount =sheet.getColumns();
		int rowCount = sheet.getRows();
		
		String[][] data = new String[rowCount-1][columnCount];
		
		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<columnCount;j++) {
				data[i-1][j] =sheet.getCell(j, i).getContents();			
			}
		}
		return data;
		
	}
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrind\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider ="testData")
	public void loginTest(String uName,String Pwd) {
		WebElement userName = driver.findElement(By.id("txtUsername"));
		userName.sendKeys(uName);
		WebElement passWord = driver.findElement(By.id("txtPassword"));
		passWord.sendKeys(Pwd + Keys.ENTER);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
