package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemWithTestNG {
	ExtentHtmlReporter htmlReporter =null;
	ExtentReports extent = null;
	ExtentTest test = null;
	WebDriver driver = null;
	@BeforeSuite
	public void setup() {
		htmlReporter = new ExtentHtmlReporter("extentReport.html");

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		// creates a toggle for the given test, adds all log events under it    
		//test = extent.createTest("GoogleSearchTestOne", "Test to validate google search ");



	}
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
	}
	@AfterTest
	public void afterTest() {
		driver.close();
		
	}
	@Test
	public void test() throws IOException {
		ExtentTest test = extent.createTest("GoogleSearchTestOne", "Test to validate google search ");
		test.log(Status.INFO, "Test Started");
        driver.get("https://google.com");
        test.pass("Url Loaded successfully");
        
		// log(Status, details)
		test.log(Status.INFO, "This step shows usage of log(status, details)");

		// info(details)
		test.info("This step shows usage of info(details)");

		// log with snapshot
		//test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

		// test with snapshot
		test.addScreenCaptureFromPath("screenshot.png");


	}

	@AfterSuite
	public void tearDown() {
		extent.flush();

	}

}



