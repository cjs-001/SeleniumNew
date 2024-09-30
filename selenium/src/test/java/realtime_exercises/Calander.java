package realtime_exercises;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calander {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String monthNumber = "6";

		String date = "15";

		String year = "2027";

		//String[] expectedList = {monthNumber,date,year};

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//button[@class='react-date-picker__calendar-button react-date-picker__button']")).click();
		
		String month= driver.findElement(By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']"))
				      .getText();
		
		String yearr= driver.findElement(By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']"))
			         .getText();
		
		
		
		while(!driver.findElement(By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']"))
		         .getText().contains(year))
		{
			driver.findElement(By.xpath("//button[@class='react-calendar__navigation__arrow react-calendar__navigation__next2-button']")).click();

		}
		while(!driver.findElement(By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']"))
			      .getText().contains("June"))
		{
			driver.findElement(By.xpath("//button[@class='react-calendar__navigation__arrow react-calendar__navigation__next-button']")).click();

		}
		
		List<WebElement> dates= driver.findElements(By.xpath("//*[contains(@class,'react-calendar__tile react-calendar__month-view__days__day')]"));
		
		for(int i =0;i<dates.size();i++)
		{
			String datee= dates.get(i).getText();
			
			if(datee.contains("15"))
			{
				dates.get(i).click();
			}
		}
		
	}

}
