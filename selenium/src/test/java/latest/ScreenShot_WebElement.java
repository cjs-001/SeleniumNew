package latest;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class ScreenShot_WebElement {

	public static void main(String[] args) throws IOException {
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
	    
	    WebElement ss=driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(logo));
	    File src= ss.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src, new File("C:\\charan's\\ex\\ss.png"));
	    
	    
	    //driver.close();
	    driver.quit();
	    
	}

}
