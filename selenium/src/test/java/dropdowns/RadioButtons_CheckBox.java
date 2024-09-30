package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons_CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		int radiobuttons =driver.findElements(By.cssSelector("div[class='css-1dbjc4n'] svg circle")).size();
		System.out.println(radiobuttons);
		
		
		
		boolean br=driver.findElement(By.xpath("//div[@data-testid='round-trip-radio-button']")).isEnabled();
		
		boolean bw=driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']")).isEnabled();
		
		driver.findElement(By.xpath("//div[@data-testid='round-trip-radio-button']")).click();
		boolean rb=driver.findElement(By.xpath("//div[@data-testid='round-trip-radio-button']")).isSelected();
		Thread.sleep(3000);
		boolean as=driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']")).isDisplayed();
		boolean qw=driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']")).isEnabled();
		
		
		System.out.println(rb);
		System.out.println(bw);
		System.out.println(br);
		System.out.println(qw);
		System.out.println(as);
		
	}

}
