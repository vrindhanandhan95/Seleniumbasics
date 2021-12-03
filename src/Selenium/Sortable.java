package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrind\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/sortable.html");
		
		//*[@id='sortable']//li
		List<WebElement> sort = driver.findElements(By.xpath("//*[@id='sortable']//li"));
		WebElement fromElement= sort.get(5);
		WebElement toElement = sort.get(0);
		
		Actions action = new Actions(driver);
		action.clickAndHold(fromElement);
		action.moveToElement(toElement);
		action.release(toElement);
		action.build().perform();
		
	}

}
