package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DesiredCapabilitiesDemo {
	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.ie.driver", path+ "\\drivers\\IEdriver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("A");
	    driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	   // driver.close();
	    driver.quit();
	}

}
