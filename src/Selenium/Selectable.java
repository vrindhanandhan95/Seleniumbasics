package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrind\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		List <WebElement> selectable = driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		
		int vrindha = selectable.size();
		System.out.println(vrindha);
		
		/*Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(1)).build().perform();*/
		
		Actions act2 = new Actions(driver);
		act2.clickAndHold(selectable.get(0)).clickAndHold(selectable.get(1)).clickAndHold(selectable.get(2)).build().perform();

	}

}
