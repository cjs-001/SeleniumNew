package streams_ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
		
		List  <WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		for(String asd:itemsNeeded)
		{
			products.stream().filter(s->s.getText().contains(asd))
			.forEach(s->getPriceVeggie(s));
		}
		
	}
	
	public static void getPriceVeggie(WebElement s) {

		

		s.findElement(By.xpath("following-sibling::div[2]/button")).click();
	}

}
