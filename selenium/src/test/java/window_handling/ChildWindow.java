package window_handling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		driver.findElement(By.className("blinkingText")).click();
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentWindow=it.next();
		String childWindow=it.next();
		driver.switchTo().window(childWindow);
		
		System.out.println(driver.findElement(By.cssSelector("p[class='im-para red']")).getText());
		String uname=driver.findElement(By.cssSelector("p[class='im-para red']")).getText().split("at")[1].split("with")[0].trim();
		
		driver.switchTo().window(parentWindow);
		driver.findElement(By.name("username")).sendKeys(uname);
	}

}
