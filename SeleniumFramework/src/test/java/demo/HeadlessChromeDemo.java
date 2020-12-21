package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo {
	
	public static void main(String[] args) {
		test1();
		
	}
	
	public static void test1() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+ "\\drivers\\chromedriver\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		//options.addArguments("–headless","–disable-gpu", "–start-maximized", "window-size=1920,1080");
		options.addArguments("headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");

		//options.addArguments("headless");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://google.com");
		
		System.out.println("title "+driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Phani");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		//driver.close();
	}

}
