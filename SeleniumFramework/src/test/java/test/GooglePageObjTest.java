package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObj;

public class GooglePageObjTest {
	public static void main(String[] args) {

		googlePageTest();
	}

	private static void googlePageTest() {
		WebDriver driver = new ChromeDriver();
		GoogleSearchPageObj googleSearchPageObj = new GoogleSearchPageObj(driver);
		driver.get("https://google.com");
		googleSearchPageObj.textSearchOnGooglePage("Automation Step");
		googleSearchPageObj.button_search_googlePage();
	}

}
