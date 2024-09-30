package realtime_exercises;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opening_Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/status_codes");
		
		
		//links for specific 
		
		WebElement ex = driver.findElement(By.id("content"));
		
		int spesificlinks= ex.findElements(By.tagName("a")).size();
		System.out.println(spesificlinks);
		
		
		
		for(int i=0;i<spesificlinks;i++)
		{
			ex.findElements(By.tagName("a")).get(i).sendKeys(Keys.CONTROL,Keys.ENTER);
		
		}
		
		Set<String> windows=driver.getWindowHandles();
		
		Iterator<String> it = windows.iterator();
		
		while(it.hasNext())
		{
			it.next();
			System.out.println(driver.getTitle());
		}
	
	}

}
