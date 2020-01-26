/**
 * 
 */
package com.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



/**
 * @author Neeraj Lamba
 *
 */
public class UnDosTresTest {

	@Test
	public void checkValidUser() {
		WebDriver driver = UnDosTresUtility.startBrowser("chrome", "http://prueba.undostres.com.mx");
		UnDosTresPages sl = PageFactory.initElements(driver, UnDosTresPages.class);
		sl.UnDosTresRecharge();
		
		
	
	}

	


}
