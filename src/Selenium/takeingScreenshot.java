package Selenium;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takeingScreenshot {

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrind\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Alert.html");
		
//		//takesScreenshot interface
//		
//				TakesScreenshot screenShot= (TakesScreenshot) driver;
//				
//				File source = screenShot.getScreenshotAs(OutputType.FILE);
//				
//				File destination = new File("C:\\Users\\vrind\\OneDrive\\Documents\\takesScreenshot.png");
//				FileHandler.copy(source, destination);
//				
		WebElement element = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		element.click();
		//taking screenshot using Robot class
		
		Robot robot = new Robot();
		Dimension size=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle= new Rectangle(size);
		BufferedImage  source =robot.createScreenCapture(rectangle);
		
		File destination = new File("C:\\Users\\vrind\\OneDrive\\Documents\\robotscreenshot.png");
		ImageIO.write(source, "png", destination);
		
		
		
		
		
		
		


	}

}
