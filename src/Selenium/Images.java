package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Images {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrind\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
		
		WebElement imagee= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		imagee.click();
		WebElement Home = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[4]/a/img"));
		Home.click();
		
		WebElement broken = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
		//naturalWidth
		if(broken.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("broken image");
			
		}

	}

}
