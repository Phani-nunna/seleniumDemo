package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleTest {
	public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver", "F:\\Phani Work\\StepbyStepDemo\\SeleniumFramework\\drivers\\geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		String path = System.getProperty("user.dir");
		System.out.println("Path "+path);
		//System.setProperty("webdriver.chrome.driver", path+ "\\drivers\\chromedriver\\chromedriver.exe");
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.ie.driver", path+ "\\drivers\\IEdriver\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		driver.get("https://google.com/");
		WebElement txtBox = driver.findElement(By.name("q"));
	   txtBox.sendKeys("Phani");
		
		//driver.close();
	}

}
