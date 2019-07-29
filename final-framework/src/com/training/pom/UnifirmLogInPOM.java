package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UnifirmLogInPOM {

	private WebDriver driver; 

	public UnifirmLogInPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//span[@class='caret']")
	private WebElement AccIcon; 
	public void clickAccIcon() {
		this.AccIcon.click(); 
	}
	@FindBy(xpath="//*[text()='Register']")
	private WebElement Regitration; 
	public void clickRegitration() {
		this.Regitration.click(); 
	}
	@FindBy(xpath="//div[@class='list-group'] /*[text()='Login']")
	private WebElement Login1; 
	public void clickLogin1() {
		this.Login1.click(); 
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement myEmail; 
	public void sendEmail(String email) {
		this.myEmail.sendKeys(email);
	}
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement myPasswd; 
	public void clickmyPasswd(String password) {
		this.myPasswd.sendKeys(password);
	}
	@FindBy(xpath="//input[@value='Login']")
	private WebElement Login2; 
	public void clickLogin2() {
		this.Login2.click();
	}
}
