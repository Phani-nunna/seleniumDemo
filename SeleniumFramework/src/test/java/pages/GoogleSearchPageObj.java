package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObj {

	private WebDriver webDriver = null;

	By textBox_Search = By.name("q");
	By button_search  = By.name("btnK");

	public GoogleSearchPageObj(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	public void textSearchOnGooglePage(String text) {
		webDriver.findElement(textBox_Search).sendKeys(text);
	}

	public void button_search_googlePage() {
		webDriver.findElement(button_search).sendKeys(Keys.RETURN);
	}


}
