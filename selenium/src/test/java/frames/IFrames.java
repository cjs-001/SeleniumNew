package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='tox-icon']")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));
		
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//*[@id='tinymce']/p")).getText());
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
	}

}
