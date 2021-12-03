package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrind\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
		WebElement element= driver.findElement(By.id("tags"));
		element.sendKeys("s");
		Thread.sleep(3000);
		List <WebElement> unordered = driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		
		for (WebElement vrindha : unordered) {
			
			if (vrindha.getText().equals("SOAP")) {
				
				vrindha.click();
				break;
			}
				
			}
	}

}
