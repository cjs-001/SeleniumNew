package realtime_exercises;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement columnlinks = driver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td/ul"));
		int links = columnlinks.findElements(By.tagName("a")).size();
		
        
		
		for(int i=0;i<links;i++)
		{
			
			columnlinks.findElements(By.tagName("a")).get(i).sendKeys(Keys.CONTROL,Keys.ENTER);
		
		}
        Set<String> windows=driver.getWindowHandles();
		
		Iterator<String> it = windows.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		}
		
		
		
		
	}

}
