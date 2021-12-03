package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;





public class dropdownBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrind\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement element= driver.findElement(By.id("dropdown1"));
		
		Select drop1 = new Select(element);
		drop1.selectByIndex(2);
		
		//select by value
		
		drop1.selectByValue("3");
		
		//select by text
		
		drop1.selectByVisibleText("Appium");
		
		//select no of option
		
		List<WebElement> ab = drop1.getOptions();
		int vrindha= ab.size();
		
		System.out.println(vrindha);
		
		//to send keys
		
		element.sendKeys("Selenium");
		
		// multiselect
		
		WebElement deepan= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		
		Select dep= new Select(deepan);
		dep.selectByIndex(1);
		dep.selectByValue("3");
		
		
		

	}

}
