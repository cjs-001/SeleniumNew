package latest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Relative_locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		WebElement name = driver.findElement(By.cssSelector("p[class='product-price']"));
		
		//below
		driver.findElement(RelativeLocator.with(By.tagName("button")).below(name)).click();
		
		//above
		String  str = driver.findElement(RelativeLocator.with(By.tagName("h4")).above(name)).getText();
		System.out.println(str);
		
		//toRightOf
		WebElement logo = driver.findElement(By.cssSelector(".brand.greenLogo"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(logo)).sendKeys("carrot");
		
		//toLeftOf
		WebElement search = driver.findElement(By.className("search-button"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(search)).clear();
		
		//near
		WebElement search1 = driver.findElement(By.className("search-button"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).near(search1)).sendKeys("beetroot");
		
	}

}
