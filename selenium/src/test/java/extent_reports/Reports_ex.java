package extent_reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports_ex {

	ExtentReports report;
	
	@BeforeMethod
	public void report()
	{
		String path = System.getProperty("user.dir")+"\\reports\\indx.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Automation Test Results");
		reporter.config().setDocumentTitle("Rahulshetty website");
		report = new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Tester", "Charan");
		
	}
	
	@Test
	public void demo()
	{
		ExtentTest test = report.createTest("webpage");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.close();
		report.flush();
	}

}
