package syncronization;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class ImplicitWait_Ex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		
		
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		addItems(driver, itemsNeeded);
		
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//*[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		
		String actual =driver.findElement(By.cssSelector(".promoInfo")).getText();
		assertEquals(actual, "Code applied ..!");
		
		
	}
	
	static void addItems(WebDriver driver,String[] itemsNeeded) throws InterruptedException
	{
List  <WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		for(int i=0;i<products.size();i++)
		{
			
			String[] name=products.get(i).getText().split("-");
            String formattedName=name[0].trim();
            
			List itemsNeededList = Arrays.asList(itemsNeeded);
			if(itemsNeededList.contains(formattedName))
			{
				driver.findElements(By.xpath("//*[text()='ADD TO CART']")).get(i).click();
				Thread.sleep(5000);
			}
		}
	}
	

}
