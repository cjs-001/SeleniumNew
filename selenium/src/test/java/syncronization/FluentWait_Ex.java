package syncronization;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("#start button")).click();
	
		
		Wait wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				    .pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		
		
		WebElement foo = (WebElement) wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		    	 
		    	 if(driver.findElement(By.cssSelector("#finish h4")).isDisplayed())
		    	 {
		    		 return driver.findElement(By.cssSelector("#finish h4")); 
		    	 }
		    	 else
		    	 {
		    		 return null;
		    	 }
		    	 
		     }
		   });
		
		
		
		System.out.println(driver.findElement(By.cssSelector("#finish h4")).getText());
		
	}

}
