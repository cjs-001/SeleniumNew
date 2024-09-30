package miscellaneous;

import java.util.Arrays;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Block_PopUps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//to understand better commentout below two line of code
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.airindia.com/");
		//driver.wait(5000);
		Thread.sleep(5000);
		//driver.switchTo().alert().dismiss();
		System.out.println(driver.getTitle());
	}

}
