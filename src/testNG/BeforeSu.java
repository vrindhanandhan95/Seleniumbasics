package testNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeSu {
	WebDriver driver;
	long startTime;
	long endTime;
	
	@BeforeSuite
	public void Before(){
		startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrind\\chromedriver.exe");
		driver= new ChromeDriver();
	}
		
	@Test
	public void Google(){
		
		driver.get("http://www.google.co.in");
		
	}
	
	@Test
	public void yahoo() {
		driver.get("http://www.yahoo.com");
	}
	
	@Test
	public void Facebook() {
		driver.get("http://www.facebook.com");
	}
	@AfterSuite
	public void After() {
		driver.quit();
		endTime=System.currentTimeMillis();
		long totaltime = endTime - startTime;
		System.out.println(totaltime);
	
	}

}
