package com.UnDostest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UnDosTest {
	WebDriver driver;
	@BeforeTest
  public void invoke ChromeBrowser() {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sunny\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://prueba.undostres.com.mx/");
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
	@Test
	public void rechargeTest() {
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/a[1]/div/span[1]")).click();
		driver.findElement(By.name("operator")).sendKeys("Telecel");
		driver.findElement(By.xpath("/ html / body / div [3] / div [2] / div [2] / div / div [1] / form / div / div [1] / div [1] / div [2] / ul / li [ 1] / div / div / div / ul / li [1] / a / div / b")).click();
		driver.findElement(By.name("mobile")).sendKeys("5523261151");
		driver.findElement(By.name("amount")).click();
		driver.findElement(By.xpath("/ html / body / div [3] / div [2] / div [2] / div / div [1] / form / div / div [1] / div [1] / div [2] / ul / li [ 3] / div / div / div / ul [1] / li [1] / a")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//WebDriverWait wait = new WebDriverWait(driver,30);
		driver.findElement(By.className("buttonRecharge")).click();
		//driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div[1]/form/div/div[1]/div[1]/div[3]/div/button/font/font")).click();
		
		driver.findElement(By.xpath("/html/body/div[19]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div/div/div/div/div[4]/div/div/form/div[1]/div[1]/div/div/input")).sendKeys("test");
		driver.findElement(By.xpath("/html/body/div[19]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div/div/div/div/div[4]/div/div/form/div[1]/div[2]/div/div/div[1]/input")).sendKeys("4111111111111111");
		driver.findElement(By.xpath("/html/body/div[19]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div/div/div/div/div[4]/div/div/form/div[1]/div[3]/div[1]/div/div[1]/input")).sendKeys("11");
		driver.findElement(By.xpath("/html/body/div[19]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div/div/div/div/div[4]/div/div/form/div[1]/div[3]/div[1]/div/div[2]/input")).sendKeys("2025");
		driver.findElement(By.xpath("/html/body/div[19]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div/div/div/div/div[4]/div/div/form/div[1]/div[3]/div[2]/div/input")).sendKeys("111");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("txtEmail")).sendKeys("test@test.com");
		//driver.findElement(By.xpath("//*[@id=\"payment-form\"]")).sendKeys("test@test.com");
		driver.findElement(By.xpath("/html/body/div[19]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div/div/div/div/div[4]/div/div/form/div[6]/div")).click();
		driver.findElement(By.name("email")).sendKeys("marze.zr@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		//driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div/span/div[1]")).click();
		//driver.switchTo().frame("a-slhuezw1uzc9");
		//driver.findElement(By.className("recaptcha-checkbox-border")).click();
		try {
			Robot robot = new Robot();  // Robot class throws AWT Exception	
			Thread.sleep(2000); // Thread.sleep throws InterruptedException	
			robot.keyPress(KeyEvent.VK_TAB);	
			Thread.sleep(2000);	
			robot.keyPress(KeyEvent.VK_ENTER);
			driver.switchTo().defaultContent();
			Thread.sleep(3000);	
			driver.findElement(By.id("loginBtn")).click();
		} catch (AWTException e) {
			 //TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			 //TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
