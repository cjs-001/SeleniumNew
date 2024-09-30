package windows_activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Windows_actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//setProperty("webdriver.chrome.driver","C:\\Users\\sweth\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		//driver.get("www.google.com");
		//driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(5000);
		driver.get("https://rahulshettyacademy.com");
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
