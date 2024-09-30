package streams_ex;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Sorting_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//th[@aria-label='Veg/fruit name: activate to sort column ascending']")).click();
		
		List<WebElement> veggies=driver.findElements(By.xpath("//tr/td[1]"));

		List<String> actualList = veggies.stream().map(s->s.getText()).collect(Collectors.toList());
		
		actualList.forEach(s->System.out.println(s));
		
		List<String> sortedList =actualList.stream().sorted().collect(Collectors.toList());
		
		sortedList.forEach(s->System.out.println(s));
		
		Assert.assertEquals(actualList, sortedList);
	
		//table[@class='table table-bordered']/tbody/tr/td[2]
		
		
	List<String> price=	veggies.stream().filter(s->s.getText().contains("Beans"))
				   .map(s->s.findElement(By.xpath("following-sibling::td")).getText())
				   .collect(Collectors.toList());
	price.forEach(s->System.out.println(s));
	}
	
	

}
