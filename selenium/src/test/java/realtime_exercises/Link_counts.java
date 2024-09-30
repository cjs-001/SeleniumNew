package realtime_exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_counts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/status_codes");
		
		int linksinpage=driver.findElements(By.tagName("a")).size();
		System.out.println(linksinpage);
		
		//links for specific 
		
		WebElement ex = driver.findElement(By.id("content"));
		
		int spesificlinks= ex.findElements(By.tagName("a")).size();
		System.out.println(spesificlinks);
		
		
		WebElement toplinks = ex.findElement(By.xpath("//div[@class='example']/p"));
		
		int toplinkss = toplinks.findElements(By.tagName("a")).size();
		System.out.println(toplinkss);
		
		for(int i=0;i<spesificlinks;i++)
		{
			ex.findElements(By.tagName("a")).get(i).sendKeys(Keys.CONTROL.ENTER);
		}
	}

}
