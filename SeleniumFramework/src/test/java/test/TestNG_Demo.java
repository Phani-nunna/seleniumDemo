package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;
import demo.Log4jDemo;

public class TestNG_Demo {
	WebDriver driver = null;
	Logger logger= LogManager.getLogger(Log4jDemo.class);
	public static String browserName;

	@BeforeTest
	public void setUp() {
		PropertiesFile.getProperties();
		logger.info("Test started");
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			logger.info("Picked Up Chrome browser");
		}else if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			logger.info("Picked Up Firefox browser");
		}


	}

	@Test
	public void googleSearchTest() {

		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		
		//logger.info("Entered search box text as Automation");
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		//logger.info("Clicked search button");
		


	}

	@AfterTest
	public void tearDownTest() {
       driver.close();
	//	logger.debug("Browser closed");

	}

}
