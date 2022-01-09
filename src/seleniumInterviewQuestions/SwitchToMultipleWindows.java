package seleniumInterviewQuestions;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class SwitchToMultipleWindows {

	 static public void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrind\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://www.leafground.com/pages/Window.html");
			
			WebElement openhome = driver.findElement(By.xpath("//button[text()='Open Multiple Windows']"));
			openhome.click();
		
		 ArrayList<String> handles= new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(handles.get(2));
		 System.out.println(driver.getTitle());
		
	}

}
