package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrind\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Calendar.html");
		
		WebElement cal= driver.findElement(By.id("datepicker"));
		cal.click();
		
		WebElement nextButton = driver.findElement(By.xpath("//a[@title='Next']"));
		nextButton.click();
		
		WebElement nextMonthValue = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		nextMonthValue.click();
		

	}

}
