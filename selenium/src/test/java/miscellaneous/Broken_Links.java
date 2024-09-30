package miscellaneous;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Links {

	public static void main(String[] args) throws IOException {
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
		
			String url= ex.findElements(By.tagName("a")).get(i).getAttribute("href");
			
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int responsecode = conn.getResponseCode();
			System.out.println(responsecode);
			if(responsecode>400)
			{
				System.out.println("broken links= "+ex.findElements(By.tagName("a")).get(i).getText());
			}
		}
		
		
	
	}
	

}
