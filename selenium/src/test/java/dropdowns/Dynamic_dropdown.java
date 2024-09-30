package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='r-1862ga2 r-1loqt21 r-1enofrn r-tceitz r-u8s1d css-76zvg2']")).click();
		driver.findElement(By.xpath("//*[text()='BLR']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='MAA']")).click();
		
		List<WebElement> months=driver.findElements(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79']"));
		List<WebElement> dates=driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1pi2tsx r-1777fci r-13qz1uu']"));
		for(int i=0;i<12;i++)
		{
			String month=months.get(i).getText();
			Thread.sleep(3000);
			
			if(month.contains("November 2024"))
			{
			
				Thread.sleep(3000);
				for(int j=0;j<31;j++)
				{
					System.out.println("inside");
					String date =dates.get(j).getText();
					System.out.println(date);
					if(date.contains("8"))
					{
						dates.get(j).click();
						break;
					}
				}
			}
			
			if(!months.get(i+1).getText().contains("November 2024"))
			{
				driver.findElement(By.cssSelector("div[class='css-1dbjc4n r-14lw9ot r-11u4nky r-rs99b7 r-6koalj r-eqz5dr r-1pi2tsx r-pm9dpa r-1knelpx r-13qz1uu'] div")).click();
				System.out.println(month);
				
			}
		}
	}

}
