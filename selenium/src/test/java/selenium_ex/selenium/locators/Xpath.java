package selenium_ex.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//using normal xpath
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("asdf");
		
		//using *
		driver.findElement(By.xpath("//*[@name='inputPassword']")).sendKeys("1234r");
		
		//using contains
		driver.findElement(By.xpath("//*[contains(@class,'sub')]")).click();
		
		Thread.sleep(5000);
		
		//using text
		String str=driver.findElement(By.xpath("//p[text()='* Incorrect username or password']")).getText();
		System.out.println(str);
		
		//using parent to child by tagname
		driver.findElement(By.xpath("//div/a")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("qwer");
		
		//using following-sibling
		driver.findElement(By.xpath("//input[@placeholder='Name']/following-sibling::input")).sendKeys("qwerf");
		
		//parent to child
		driver.findElement(By.xpath("//div[@class='form-container sign-up-container']/child::form/input[3]")).sendKeys("1234");
		Thread.sleep(5000);
		
		//child to parent
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']/parent::div/button[@class='reset-pwd-btn']")).click();
		
	}

}
