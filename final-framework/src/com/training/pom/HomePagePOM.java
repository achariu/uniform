package com.training.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trianing.waits.WaitTypes;

public class HomePagePOM {

	private WebDriver driver; 

	public HomePagePOM(WebDriver driver) {
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
	@FindBy(xpath="//div[@class='list-group'] /*[text()='Order History']")
	private WebElement History; 
	public void clickHistory() {
		this.History.click();
	}
	@FindAll({@FindBy(xpath="//table[@class='table table-bordered table-hover']/thead//td")})
	private List<WebElement> productDetails;
	public List<WebElement> getProductDetails() {
	return this.productDetails;
	}
	@FindAll({@FindBy(xpath="//table[@class='table table-bordered table-hover']/tbody//td")})
	private List<WebElement> valueDetails;
	public List<WebElement> getValueDetails() {
	return this.valueDetails;
	}
	@FindBy(xpath="//i[@class='fa fa-eye']")
	private WebElement viewIcon; 
	public void clickViewIcon() {
		WaitTypes types = new WaitTypes(driver);
		types.waitForElement(this.viewIcon, 30);
		this.viewIcon.click();
	}
	
	
	//2nd Test case
	
	@FindBy(xpath="//*[text()='Edit Account']")
	private WebElement EditAccnt; 
	public void clickEditAccnt() {
		this.EditAccnt.click();
	}

	
	@FindBy(id="input-firstname")
	private WebElement firstName;    
	public void sendfirstName(String firstName) {
		this.firstName.clear();
		this.firstName.sendKeys(firstName);
	}
	
	@FindBy(id="input-lastname")
	private WebElement lastName;    
	public void sendlastName(String lastName) {
		this.lastName.clear();
		this.lastName.sendKeys(lastName);
	}
	

	@FindBy(id="input-email")
	private WebElement eMail; 
	public void sendeMail(String eMail) {
		this.eMail.clear();
		this.eMail.sendKeys(eMail);
	}
	@FindBy(id="input-telephone")
	private WebElement phNumber; 
	public void sendphNumber(String number) {  
		this.phNumber.clear();
		this.phNumber.sendKeys(number);
	}
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement ctnButton;    
	public void clickctnButton() {
		this.ctnButton.click();
	}
	
	
	
	
	//3rd Test case
	
	@FindBy(xpath="//*[text()='Password']")
	private WebElement chngPassword; 
	public void clickchngPassword() {
		this.chngPassword.click(); 
	}
	
	@FindBy(id="input-password")
	private WebElement newPasswd; 
	public void sendnewPasswd(String password) {
		this.newPasswd.sendKeys(password);
	}
	@FindBy(xpath="//input[@name='confirm']")
	private WebElement cnfPasswd; 
	public void sendcnfPasswd(String password) {
		this.cnfPasswd.sendKeys(password);
	}
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitChng; 
	public void clicksubmitChng() {
		this.submitChng.click(); 
	
	
}
		}









