package testNGsample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TEstNGpractice {
	WebDriver driver;
   @BeforeTest
   public void setup() {
	   System.setProperty("webdriver.chrome.driver", "D:\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		   
   }
   @Test
   public void titleTest() {
	  // WebDriver driver = new ChromeDriver();
	   String title = driver.getTitle();
	   System.out.println("Title of the page is:" +title);
   }
   
   @AfterTest
   public void closeBrowser() {
	 //  WebDriver driver = new ChromeDriver();
	   driver.close();
	   
   }
}
