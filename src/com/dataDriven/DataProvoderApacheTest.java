package com.dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataProvoderApacheTest {
	static List<String> userName= new ArrayList<String>();
	static List<String> passWord= new ArrayList<String>();
	public void readFile() throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\vrind\\OneDrive\\Documents\\Test data1.xlsx");
		Workbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheetAt(0);
		
		Iterator<Row> rowValue=sheet.iterator();
		
		while(rowValue.hasNext())
		{
			Row a=rowValue.next();
			Iterator<Cell> b= a.iterator();
			int i=2;
			while(b.hasNext())
			{
				
				if(i%2==0) {
					userName.add(b.next().getStringCellValue());
				}else
				{
					passWord.add(b.next().getStringCellValue());
				}
				i++;
			}
		}
		
		
	}
	
	public void setUp(String userName,String passWord ) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrind\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement Name = driver.findElement(By.id("txtUsername"));
		Name.sendKeys(userName);
		WebElement Word = driver.findElement(By.id("txtPassword"));
		Word.sendKeys(passWord + Keys.ENTER);
		driver.quit();
	}
	
	public void execute()
	{
		for(int i=0;i<userName.size();i++)
		{
			setUp(userName.get(i), passWord.get(i));
		}
			
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		DataProvoderApacheTest test = new DataProvoderApacheTest();
		test.readFile();
		System.out.println(userName);
		System.out.println(passWord);
		test.execute();
		

	}

}
