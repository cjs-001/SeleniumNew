package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//div[text()='Passengers']")).click();
		
		List<WebElement> str = driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-1wtj0ep r-1x0uki6']"));
		
		for(int i=0;i<3;i++)
		{
			
			WebElement ele= str.get(i);
			System.out.println(ele.getText());
			
			if(ele.getText().contains("Infant"))
			{
				driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid']")).get(i).click();
			}
			
			System.out.println("-------------------------------");
		}
	}

}
