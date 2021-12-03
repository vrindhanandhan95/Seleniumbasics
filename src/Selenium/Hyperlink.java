package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrind\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		
		WebElement element = driver.findElement(By.linkText("Go to Home Page"));
		element.click();
		
		driver.navigate().back();
		
		WebElement element2= driver.findElement(By.partialLinkText("Find where am supposed"));
		String title = element2.getAttribute("href");
		System.out.println(title);
		
		WebElement element3= driver.findElement(By.linkText("Verify am I broken?"));
		element3.click();
		String broken =driver.getTitle();
		
		if(broken.contains("404"))
				{
			System.out.println("Link is broken");
			
				}
		driver.navigate().back();
		
		WebElement sameLink = driver.findElement(By.linkText("Go to Home Page"));
		
		sameLink.click();
		
		driver.navigate().back();
		
		List<WebElement> count = driver.findElements(By.tagName("a"));
		int numberOfCounts = count.size();
		System.out.println(numberOfCounts);
		
		
		
				}


}
