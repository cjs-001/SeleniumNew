package realtime_exercises;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
        JavascriptExecutor js =(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,600)");
		
List <WebElement> values=driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));
		
		int total=0;
		
		for(int i=0;i<values.size();i++)
		{
			String value=values.get(i).getText();
			total =total+Integer.parseInt(value);
		}
		
		String sum =driver.findElement(By.cssSelector("div[class='totalAmount']")).getText().split(":")[1].trim();
		
		System.out.println(total);
		
		assertEquals(total,Integer.parseInt(sum) );
		
	}
	

}
