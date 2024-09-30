package latest;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dimensions_of_WebElement {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/cart");
		
		WebElement logo = driver.findElement(By.cssSelector(".brand.greenLogo"));
		
		System.out.println(logo.getRect().getDimension().getHeight());

		System.out.println(logo.getRect().getDimension().getWidth());
		
		
		
	}
	
}
