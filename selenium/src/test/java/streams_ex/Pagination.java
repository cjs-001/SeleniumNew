package streams_ex;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Pagination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.xpath("//tr/th[1]")).click();

        List<String> price;

		// scan the name column with getText,print the price of the Rice

		do

		{

		List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));

		price = rows.stream().filter(s -> s.getText().contains("Rice"))

		.map(s -> getPriceVeggie(s)).collect(Collectors.toList());

		price.forEach(a -> System.out.println(a));

		if(price.size()<1)

		{

		driver.findElement(By.cssSelector("[aria-label='Next']")).click();

		}

		}while(price.size()<1);



		}



		private static String getPriceVeggie(WebElement s) {

		// TODO Auto-generated method stub

		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();



		return pricevalue;

		}
		
	

}
