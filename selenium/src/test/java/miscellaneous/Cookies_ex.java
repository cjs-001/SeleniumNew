package miscellaneous;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies_ex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        WebDriver driver = new ChromeDriver();
		driver.get("https://www.airindia.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		System.out.println(driver.manage().getCookieNamed("AMCV_56C628E563E65FE60A495FBA%40AdobeOrg"));
		driver.manage().deleteCookieNamed("AMCV_56C628E563E65FE60A495FBA%40AdobeOrg");
		driver.manage().deleteAllCookies();
		
	}

}
