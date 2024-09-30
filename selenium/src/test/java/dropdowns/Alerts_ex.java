package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_ex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		
		driver.findElement(By.cssSelector("button[onclick='showAlert()']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.cssSelector("button[onclick='myMessage()']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.cssSelector("button[onclick='myDesk()']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.cssSelector("button[onclick='myPromp()']")).click();
		driver.switchTo().alert().sendKeys("charan");
		Thread.sleep(5000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		
	}

}
