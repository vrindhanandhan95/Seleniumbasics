package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrind\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		element.click();
		
		Alert alrtbx = driver.switchTo().alert();
		Thread.sleep(2000);
		alrtbx.accept();
		
		WebElement element2= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		element2.click();
		
		Alert confirbox = driver.switchTo().alert();
		Thread.sleep(2000);
		confirbox.dismiss();
		
		WebElement element3= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		element3.click();
		
		Alert promptbx= driver.switchTo().alert();
		
		promptbx.sendKeys("vrindha");
		promptbx.accept();
		Thread.sleep(2000);
		
		
		WebElement element4 = driver.findElement(By.id("btn"));
		element4.click();
		WebElement element5 = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/button"));
		driver.switchTo().activeElement();
		Thread.sleep(2000);
		
		
		
		
		

	}

}
