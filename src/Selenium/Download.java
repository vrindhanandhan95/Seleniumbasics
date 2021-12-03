package Selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrind\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		
		WebElement eli1= driver.findElement(By.linkText("Download Excel"));
		eli1.click();
		
		//
		File location = new File("C:\\Users\\vrind\\Downloads");
		File[] vrinda = location.listFiles();
		
		for (File file : vrinda) {
			
			if(file.getName().equals("testleaf.xlsx")) {
				System.out.println("downloaded");
				break;
			
		}
			
		}

	}

}
