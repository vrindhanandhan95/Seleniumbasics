package seleniumInterviewQuestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
 public static void main(String[] args) {
	 
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrind\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/travel/flights?param=DTNavIcon&fm=neo%2Fmerchandising&iid=M_d461cbba-c67b-41e7-b950-05b8db609d3f_1_372UD5BXDFYS_MC.V4ZPKTOAO321&otracker=hp_rich_navigation_8_1.navigationCard.RICH_NAVIGATION_Travel_V4ZPKTOAO321&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_8_L0_view-all&cid=V4ZPKTOAO321");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> ele=driver.findElements(By.xpath("//*[@class='_2_b_Xk']/div"));
		System.out.println(ele.size());
		
		
		//*[@class='_2_b_Xk']/div
 }
	

}
