package realtime_exercises;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,600)");
			Thread.sleep(3000);
		js.executeAsyncScript("document.querySelector('.tableFixHead').scrollTop=100");
		
		//div[@class='tableFixHead']/table/tbody/tr/td[4]
	}	

}
