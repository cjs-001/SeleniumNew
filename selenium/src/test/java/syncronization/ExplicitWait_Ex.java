package syncronization;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Ex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		
		
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
		
		
		addItems(driver, itemsNeeded);
		
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//*[text()='PROCEED TO CHECKOUT']")).click();
		wait(driver, 5, By.cssSelector(".promoCode"));
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		wait(driver, 5, By.cssSelector(".promoInfo"));
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
	
	static void wait(WebDriver driver,int sec,By locator)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
		
	}


