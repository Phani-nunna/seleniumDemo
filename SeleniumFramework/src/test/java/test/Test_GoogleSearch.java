package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_GoogleSearch {
	WebDriver driver = null;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "F:\\Phani Work\\StepbyStepDemo\\SeleniumFramework\\drivers\\geckodriver\\geckodriver.exe");
//
		System.setProperty("webdriver.gecko.driver","F:\\Phani Work\\StepbyStepDemo\\SeleniumFramework\\drivers\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();

	}

	@Test
	public  void googleSearch() {

		driver.get("https://google.com");


		driver.findElement(By.name("q")).sendKeys("Automation step by step");	

		// click on  search
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}

	@AfterTest
	public void tearDownTest() {
		//driver.close();
	}

}
