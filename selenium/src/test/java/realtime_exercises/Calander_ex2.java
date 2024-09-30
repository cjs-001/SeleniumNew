package realtime_exercises;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calander_ex2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String monthNumber = "6";

		String date = "15";

		String year = "2027";

		//String[] expectedList = {monthNumber,date,year};

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//button[@class='react-date-picker__calendar-button react-date-picker__button']")).click();
		
		driver.findElement(By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']"))
			      .click();
		
		
		driver.findElement(By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']"))
		.click();
		
		List<WebElement> years = driver.findElements(By.xpath("//div[@class='react-calendar__decade-view__years']/button"));
		
		for(int i=0;i<years.size();i++)
		{
			Thread.sleep(1000);
			if(years.get(i).getText().contains(year))
			{
				years.get(i).click();
				break;
			}
		}
		

		List<WebElement> months = driver.findElements(By.xpath("//div[@class='react-calendar__year-view__months']/button"));
		
		for(int i=0;i<months.size();i++)
		{
			if(months.get(i).getText().contains("June"))
			{
				months.get(i).click();
				break;
			}
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
