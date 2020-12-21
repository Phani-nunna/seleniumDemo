package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo {
	
	WebDriver driver = null;
	
	@Parameters("browserName")
	@BeforeTest
	public void setUp(String browserName) {
		
		System.out.println("BrowserName is = "+browserName);
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			
		}else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "F:\\Phani Work\\StepbyStepDemo\\SeleniumFramework\\drivers\\geckodriver\\geckodriver.exe");

			driver = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("IE")) {
			driver = new InternetExplorerDriver();
		}
			
	}
	
	@Test
	public void test() throws InterruptedException {
		
		driver.get("https://google.com");
		Thread.sleep(3000);
		
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
		System.out.println("Test Completed");
		
	}

}
