package Selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrind\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		
		List<WebElement> numColumns= driver.findElements(By.tagName("th"));
		System.out.println(numColumns.size());
		
		List<WebElement> numRows = driver.findElements(By.tagName("tr"));
		System.out.println(numRows.size());
		
		WebElement learnToInteract = driver.findElement(By.xpath("//td[text()='Learn to interact with Elements']//following::td[1]"));
		System.out.println(learnToInteract.getText());
		
		List<WebElement> leastCompleted = driver.findElements(By.xpath("//td[2]"));
		
		List<Integer> numberList = new ArrayList<Integer>();
		
		for (WebElement webElement : leastCompleted) {
			String progress = webElement.getText().replace("%", "");
			numberList.add(Integer.parseInt(progress));
		}
		System.out.println(numberList);
		
		int smallValue= Collections.min(numberList);
		System.out.println(smallValue);
		
		String smallValueString =Integer.toString(smallValue) +"%";
		
		String xpath = "//td[text()="+ "\""+smallValueString+"\"" +"]//following::td[1]//input";
		
		System.out.println(xpath);
		
		
		
		WebElement checkBox= driver.findElement(By.xpath(xpath));
		checkBox.click();
				
		
		
	}

}
