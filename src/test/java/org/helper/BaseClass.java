package org.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {

	public static WebDriver driver;

	static Actions a;

	public static void launchBrowser(String browserName) {

		if (browserName.equals("Chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

		else if (browserName.equals("Edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}

		else {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}

	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void passValue(WebElement ref, String value) {
		ref.sendKeys(value);
	}

	public static void click(WebElement refer) {
		refer.click();
	}

	public static String fetchTitle() {

		String title = driver.getTitle();
		return title;

	}
	
	public static String fetchText(WebElement r) {
		
		String text = r.getText();
		return text;

	}

	public static void close() {

		driver.close();

	}

}
