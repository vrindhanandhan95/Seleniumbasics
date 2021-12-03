package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextboxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrind\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement enterEmail = driver.findElement(By.id("email"));
		enterEmail.sendKeys("vrindhanandhan139@gmail.com");
		WebElement appendText = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		appendText.sendKeys("Vrindha" + Keys.ENTER);
		WebElement getText = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input"));
		String defaultMessage = getText.getAttribute("value");
		//String defaultMessage = getText.getText();-- wrong
		System.out.println(defaultMessage);
		WebElement clearText = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clearText.clear();
		WebElement isDisabled = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		boolean verify = isDisabled.isEnabled();
		System.out.println(verify);
		

	}

}
