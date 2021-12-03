package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel {
	@Test
	public void OpenGoogle()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrind\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("http://www.google.co.in");
		 driver.quit();
	}
	@Test
	public void OpenYahoo()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrind\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.yahoo.com");
		driver.quit();
	}
	
}
