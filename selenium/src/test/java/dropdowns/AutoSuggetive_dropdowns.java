package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetive_dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.airindia.com/");
		
		driver.findElement(By.id("From")).sendKeys("be");
		
		List<WebElement> from=driver.findElements(By.xpath("//button[@class='dropdown-item ng-star-inserted']"));
		
		for(int i=0;i<from.size();i++)
		{
			String str=from.get(i).getText();
			if(str.contains("Bengaluru"))
			{
				from.get(i).click();
			}
			
		}
		System.out.println("done");
		
	}

}
