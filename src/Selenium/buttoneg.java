package Selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttoneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrind\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
	
		//2 find position of the button(x, y)
		WebElement element2 = driver.findElement(By.id("position"));
		Point p= element2.getLocation();
		int xvalue=p.getX();
		int yvalue=p.getY();
		System.out.println("xvalue "+xvalue + " yvalue "+yvalue);
		
		//3 find color
		WebElement element3 = driver.findElement(By.id("color"));
		String s= element3.getCssValue("background-color");
		System.out.println(s);
		
		// 4 find height and width
		WebElement element4= driver.findElement(By.id("size"));
		int h=element4.getSize().getHeight();	
		int w=element4.getSize().getWidth();
		System.out.println("height "+h + " width "+w);
		
		//1. click home button
		WebElement element= driver.findElement(By.id("home"));
		element.click();
	
		

	}

}
