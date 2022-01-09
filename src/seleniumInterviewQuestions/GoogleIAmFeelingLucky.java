package seleniumInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleIAmFeelingLucky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrind\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		WebElement element= driver.findElement(By.xpath("//div[@id='tophf']/preceding::input[1]"));
		element.click();
		
		//div[@class='FPdoLc lJ9FBc']
		

	}

}
