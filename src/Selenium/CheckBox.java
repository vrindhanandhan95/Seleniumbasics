package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrind\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		//Select language
		WebElement element=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[3]/input"));
		element.click();
		//Selenium is checked
		WebElement element2= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input"));
		boolean x= element2.isSelected();
		System.out.println(x);
		
		//deselect
		
		WebElement element3= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]/input"));
		
		if (element3.isSelected())
		{
			element3.click();
			
		}
		
		WebElement element4= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
		
		if(element4.isSelected())
		{
			element4.click();
		}

	}
}
