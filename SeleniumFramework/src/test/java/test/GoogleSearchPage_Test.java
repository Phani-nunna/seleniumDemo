package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;

public class GoogleSearchPage_Test {
	public static void main(String[] args) {
	   googleSearch();		
	}
	
	
	public static void googleSearch() {
		WebDriver driver = new ChromeDriver();
		//sdriver.manage().window().maximize();
		driver.get("https://google.com");
		
		
		//driver.findElement(By.name("q")).sendKeys("Automation step by step");	
		GoogleSearchPage.textBox_Search(driver).sendKeys("Automation step by step");
		GoogleSearchPage.textButton_Search(driver).sendKeys(Keys.RETURN);
		// click on  search
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}

}
