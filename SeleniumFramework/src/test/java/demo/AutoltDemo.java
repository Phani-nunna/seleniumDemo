package demo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AutoltDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		test1();

	}
	
	public static void test1() throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		driver.get("http://tinyupload.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.tagName("textarea")).sendKeys("Upload file");  
		WebElement element  = driver.findElement(By.name("uploaded_file"));
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		//executor.executeScript("arguments[0].click();", element);
		//WebElement element = driver.findElement("yourElement");
        Actions builder = new Actions(driver);
        builder.moveToElement(element).click(element);
        builder.perform();
		
		//driver.findElement(By.cssSelector("This element might be pseudo element/comment/inside iframe from different src. Currently ChroPath doesn't support for them."))
		
		//Runtime.getRuntime().exec("F:\\Phani Work\\fileUpload.exe");
		
		Thread.sleep(3000);
		
		/*
		 * WebElement submit = driver.findElement(By.
		 * cssSelector("table:nth-child(1) tbody:nth-child(1) tr:nth-child(2) td:nth-child(1) > img:nth-child(9)"
		 * ));
		 * 
		 * JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		 * executor1.executeScript("arguments[0].click();", submit);
		 */
		
			
	}

}
