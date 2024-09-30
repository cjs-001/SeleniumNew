package actions_ex;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		Actions act = new Actions(driver);
		
		
		
		act.moveToElement(driver.findElement(By.xpath("//div[text()='Add-ons']")))
		.moveToElement(driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73']")))
		.click().keyDown(Keys.SHIFT).sendKeys("ben").doubleClick().contextClick().keyDown(Keys.CONTROL).sendKeys(Keys.F5)
		.build().perform();
		
	}

}
