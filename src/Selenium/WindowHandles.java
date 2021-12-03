package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrind\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String parentwindow= driver.getWindowHandle();
		
		WebElement openhome = driver.findElement(By.id("home"));
		openhome.click();
		
		Set<String> allwindow = driver.getWindowHandles();
		
		for (String newwindow : allwindow) {
			
			driver.switchTo().window(newwindow);
			
		}
		
		WebElement childwindow= driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[7]/a/img"));
		childwindow.click();
		driver.close();
		driver.switchTo().window(parentwindow);
		
		//2.find the number of open windows
		
		WebElement numberofopen = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		numberofopen.click();
		
		int numopen = driver.getWindowHandles().size();
		System.out.println(numopen);
		
		//3. close all except this window
		
		WebElement closeall = driver.findElement(By.id("color"));
		closeall.click();
		
		Set <String> closeallwindow = driver.getWindowHandles();
		
		for (String closeee : closeallwindow) {
			
			if(!closeee.equals(parentwindow)) {
				driver.switchTo().window(closeee);
				driver.close();
			}
			
		}
		

	}

}
