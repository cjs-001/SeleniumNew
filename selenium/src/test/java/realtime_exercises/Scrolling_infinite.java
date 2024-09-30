package realtime_exercises;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_infinite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/infinite_scroll");
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		List<WebElement> scroll = driver.findElements(By.xpath("//div[@class='jscroll-added']"));
		
		
		for(int i=0;i<10;i++)
		{
			
			Thread.sleep(2000);
			js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
			
		}
		
	}

}
