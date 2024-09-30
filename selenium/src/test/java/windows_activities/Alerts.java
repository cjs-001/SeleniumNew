package windows_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   String username ="admin";
	   String password ="admin";
	   String domain="the-internet.herokuapp.com/basic_auth";
	   String url = "https://" + username + ":" + password + "@" + domain;
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		String result=driver.findElement(By.cssSelector(".example p")).getText();
		System.out.println(result);
	}

}
