package latest;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Switching_Tab_Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/cart");
		
		
		
		
		
		
		
		//driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> it = windows.iterator();
	    String parent = it.next();
	    String child =it.next();
	    
	    driver.switchTo().window(child);
	    
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	    
	    String str =driver.findElement(By.cssSelector(".brand.greenLogo")).getText();
	    
	    System.out.println(str);
	    
	    driver.switchTo().window(parent);
	    
	    WebElement logo = driver.findElement(By.cssSelector(".brand.greenLogo"));
	    driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(logo)).sendKeys(str);
	    
	    //driver.close();
	    driver.quit();
	    
	}

}
