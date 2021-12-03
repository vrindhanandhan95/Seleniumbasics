package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrind\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		WebElement element = driver.findElement(By.id("Click"));
		element.click();
		System.out.println(element.getText());
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		WebElement element2= driver.findElement(By.id("Click1"));
		element2.click();
		
		//3 no of frames
		
		driver.switchTo().defaultContent();
		
		List<WebElement> noofframes = driver.findElements(By.tagName("iframe"));
		//int size= noofframes.size();
		//System.out.println(size);
		
		System.out.println(noofframes.size());
		

	}

}
