package selenium_ex.selenium.locators;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		String tittle=driver.getTitle();
		System.out.println(tittle);
		String currenturl= driver.getCurrentUrl();
		System.out.println(currenturl);
		
		String uname="charan";
		
		driver.findElement(By.id("inputUsername")).sendKeys(uname);
		driver.findElement(By.name("inputPassword")).sendKeys("123qweASD");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(5000);
		String str=driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(str);
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("charan");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("charan.com");
        driver.findElement(By.xpath("//div[@class='form-container sign-up-container']/child::form/input[3]")).sendKeys("1234");
		Thread.sleep(5000);
		//child to parent
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']/parent::div/button[@class='reset-pwd-btn']")).click();
		String password=driver.findElement(By.cssSelector("p.infoMsg")).getText();
		System.out.println(password);
		String pass=password.split("'")[1];

		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("charan");
		driver.findElement(By.name("inputPassword")).sendKeys(pass);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".submit.signInBtn")).click();
		
		Thread.sleep(5000);
		
		String resultactual=driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText();
		assertEquals(resultactual, "You are successfully logged in.");
		
		String username= driver.findElement(By.cssSelector(".login-container h2")).getText();
		String name=username.split(" ")[1].split(",")[0];
		
		assertEquals(name, uname);
		driver.close();
		
		

	}

}
