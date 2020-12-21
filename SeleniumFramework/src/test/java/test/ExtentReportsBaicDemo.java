package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsBaicDemo {

	public static void main(String[] args) {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");

		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test = extent.createTest("GoogleSearchTestOne", "Test to validate google search ");


		WebDriver  driver = new ChromeDriver();
		test.log(Status.INFO	, "Starting test case");
		driver.get("https://google.com");
		test.pass("Navigated too google.com");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");	
		test.pass("Entrered text in search box");

		// click on  search
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

		test.pass("Press enter key in kb");


		driver.close();
		driver.quit();

		test.pass("Closed the browser");
		test.info("Test completed");
		
		extent.flush();


	}

}
