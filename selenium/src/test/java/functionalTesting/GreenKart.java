package functionalTesting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
		
		
		
		List  <WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		for(int i=0;i<products.size();i++)
		{
			
			String[] name=products.get(i).getText().split("-");
            String formattedName=name[0].trim();
            
			List itemsNeededList = Arrays.asList(itemsNeeded);
			if(itemsNeededList.contains(formattedName))
			{
				driver.findElements(By.xpath("//*[text()='ADD TO CART']")).get(i).click();
				Thread.sleep(5000);
			}
		}
		
		
	}

}
