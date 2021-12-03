package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrind\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		
		WebElement element= driver.findElement(By.id("windowButton"));
		element.click();
		WebElement element3 = driver.findElement(By.id("messageWindowButton"));
		element3.click();
		
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		Set<String> allwindow= driver.getWindowHandles();
		for (String multiwin : allwindow) {
			driver.switchTo().window(multiwin);
			
			}
		WebElement element2 = driver.findElement(By.id("sampleHeading"));
		System.out.println(element2.getText());

}
}
