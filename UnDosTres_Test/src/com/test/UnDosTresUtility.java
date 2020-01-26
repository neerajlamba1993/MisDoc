/**
 * 
 */

package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author Neeraj Lamba
 *
 */
public class UnDosTresUtility {
	static WebDriver driver;

	// browser

	public static WebDriver startBrowser(String browserName, String url) {
		if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"PATH");
			driver = new FirefoxDriver();
			driver.get(url);
		} else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Sunny\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
		} 
		return driver;
	}

	// browser method ends here


}
