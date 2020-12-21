package demo;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitDemo {
	
	public static void main(String[] args) {
       seleniumWait();
	}
	
	public static void seleniumWait() {
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);

		driver.get("https://google.com");

		driver.findElement(By.name("q")).sendKeys("Phani");
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("adcfr")));
		
		driver.findElement(By.name("abcd")).clear();
		
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.close();
	}

}

