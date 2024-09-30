package selenium_ex.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//types of css selectors
		
		//using id
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("charan");
		
		//using normal css
		driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys("12w3e");
		
		//using classname
		driver.findElement(By.cssSelector(".submit.signInBtn")).click();
		
		Thread.sleep(5000);
		
		//using child combinator (>)
		String str=driver.findElement(By.cssSelector("div>form>p")).getText();
		System.out.println(str);
		
		driver.findElement(By.cssSelector(".forgot-pwd-container a")).click();
		
		// using :nth-child
		driver.findElement(By.cssSelector("form input:nth-child(2)")).sendKeys("charan");
		
		//:nth-of-type
		driver.findElement(By.cssSelector("form input:nth-of-type(2)")).sendKeys("qwe.com");
		
		//regular expression
		driver.findElement(By.cssSelector("input[type*=pass]")).sendKeys("123erfg");
		
		
	}

}
