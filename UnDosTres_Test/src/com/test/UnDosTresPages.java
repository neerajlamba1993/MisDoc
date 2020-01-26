/**
 * 
 */
package com.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



/**
 * @author Neeraj Lamba  
 *         
 */
public class UnDosTresPages {
	WebDriver driver;

	public UnDosTresPages(WebDriver driver) {
		this.driver = driver;
	}


	
	@FindBy(xpath = "/html/body/div[3]/div[2]/div[1]/a[1]/div/span[1]")
	WebElement recharge;

	@FindBy(name = "operator")                                                                                                                                                       
	WebElement operator;

	@FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/div/div[1]/form/div/div[1]/div[1]/div[2]/ul/li[1]/div/div/div/ul/li[1]/a/div/b")
	WebElement Telecel;
	
	@FindBy(name="mobile")
	WebElement mobile;
	
	@FindBy(name="amount")
	WebElement amount;
	
	@FindBy(xpath="/ html / body / div [3] / div [2] / div [2] / div / div [1] / form / div / div [1] / div [1] / div [2] / ul / li [ 3] / div / div / div / ul [1] / li [1] / a")
	WebElement TenDollar;
	
	@FindBy(className="buttonRecharge")
	WebElement rechargeBtn;
	
	@FindBy(xpath="/html/body/div[19]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div/div/div/div/div[4]/div/div/form/div[1]/div[1]/div/div/input")
	WebElement cardName;
	
	@FindBy(xpath="/html/body/div[19]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div/div/div/div/div[4]/div/div/form/div[1]/div[2]/div/div/div[1]/input")
	WebElement cardNumber;
	
	@FindBy(xpath="/html/body/div[19]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div/div/div/div/div[4]/div/div/form/div[1]/div[3]/div[1]/div/div[1]/input")
	WebElement expDay;
	
	@FindBy(xpath="/html/body/div[19]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div/div/div/div/div[4]/div/div/form/div[1]/div[3]/div[1]/div/div[2]/input")
	WebElement expYear;
	
	@FindBy(xpath="/html/body/div[19]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div/div/div/div/div[4]/div/div/form/div[1]/div[3]/div[2]/div/input")
	WebElement ccv;
	
	@FindBy(name="txtEmail")
	WebElement email;
	
	@FindBy(xpath="/html/body/div[19]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div/div/div/div/div[4]/div/div/form/div[6]/div")
	WebElement payBtn;
	
	@FindBy(name="email")
	WebElement registerEmail;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="loginBtn")
	WebElement login;
	
	public void UnDosTresRecharge() {

		recharge.click();
		operator.sendKeys("Telecel");
		Telecel.click();
		mobile.sendKeys("5523261151");
		amount.click();
		TenDollar.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rechargeBtn.click();
		cardName.sendKeys("test");
		cardNumber.sendKeys("4111111111111111");
		expDay.sendKeys("11");
		expYear.sendKeys("2025");
		ccv.sendKeys("111");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		email.sendKeys("test@test.com");
		payBtn.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		registerEmail.sendKeys("marze.zr@gmail.com");
		password.sendKeys("123456");
		try {
			Robot robot = new Robot();  // Robot class throws AWT Exception	
			Thread.sleep(2000); // Thread.sleep throws InterruptedException	
			robot.keyPress(KeyEvent.VK_TAB);	
			Thread.sleep(2000);	
			robot.keyPress(KeyEvent.VK_ENTER);
			driver.switchTo().defaultContent();
			Thread.sleep(3000);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		login.click();
		
			
	}


}
