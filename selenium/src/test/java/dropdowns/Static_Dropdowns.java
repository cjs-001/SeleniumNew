package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html#google_vignette");
		
		// If the element having a tag name select than it is static
		
		WebElement element=driver.findElement(By.id("course"));
		
		Select dropdown = new Select(element);
		
		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("Java");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("js");
		System.out.println(dropdown.getFirstSelectedOption().getText());

	}

}
