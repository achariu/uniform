package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.training.generics.GenericMethods;
import com.trianing.waits.WaitTypes;

public class UniformOrderPOM {

	private WebDriver driver; 
	private GenericMethods genericMethods;
	private WaitTypes types;

	public UniformOrderPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="bottomfooter")
	private WebElement copyRightsLbl;

	//1st Test case
	
	@FindBy(xpath="//a[@href='http://uniform.upskills.in/']/img")
	private WebElement ShopUniform; 
	public void clickShopUniform() {
		genericMethods = new GenericMethods(driver);
		types = new WaitTypes(driver);
		types.waitForElement(this.copyRightsLbl, 60);
		genericMethods.scrollIntoView(this.copyRightsLbl);
		this.ShopUniform.click();
	}
	@FindBy(xpath="//*[@id=\"featured-grid\"]/div[2]/div/div/div[1]/a/img")
	private WebElement UnifrmImg; 
	public void clickUnifrmImg() {
		this.UnifrmImg.click();
	}
	@FindBy(xpath="//*[@id='input-option368']/div[6]/label/input")
	private WebElement SelChest; 
	public void clickSelChest() {
		this.SelChest.click();
	}
	@FindBy(id="button-cart")
	private WebElement AddCart; 
	public void clickAddCart() {
		this.AddCart.click();
	}
	@FindBy(xpath="//*[@id='cart']/button")
	private WebElement ClckViewCart; 
	public void clickClckViewCart() {
		this.ClckViewCart.click();
	}
	@FindBy(xpath="//*[text()=' Checkout']")
	private WebElement Checkout; 
	public void clickCheckout() {
		this.Checkout.click();
	}
	@FindBy(xpath="//input[@name='account' and @value='guest']")
	private WebElement GuestCheckout; 
	public void clickGuestCheckout() {
		this.GuestCheckout.click();
	}
	@FindBy(xpath="//input[@id='button-account']")
	private WebElement Continue; 
	public void clickContinue() {
		this.Continue.click();
	}
	@FindBy(id="input-payment-firstname")
	private WebElement firstName;    
	public void sendfirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}
	@FindBy(id="input-payment-lastname")
	private WebElement lastName;    
	public void sendlastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}
	@FindBy(id="input-payment-email")
	private WebElement eMail; 
	public void sendeMail(String eMail) {
		this.eMail.sendKeys(eMail);
	}
	@FindBy(id="input-payment-telephone")
	private WebElement phNumber; 
	public void sendphNumber(String number) {  
		this.phNumber.sendKeys(number);
	}
	@FindBy(id="input-payment-address-1")
	private WebElement Address1; 
	public void sendAddress1(String number) {  
		this.Address1.sendKeys(number);
	}
	@FindBy(id="input-payment-city")
	private WebElement City; 
	public void sendCity(String number) {  
		this.City.sendKeys(number);
	}
	@FindBy(id="input-payment-postcode")
	private WebElement PstCode; 
	public void sendPstCode(String number) {  
		this.PstCode.sendKeys(number);
	}
	@FindBy(xpath="//*[@id='input-payment-country' ]/*[text()='India']")
	private WebElement Country; 
	public void clickCountry() {
		this.Country.click();
	}
	@FindBy(xpath="//*[@id='input-payment-zone' ]/*[text()='Karnataka']")
	private WebElement State; 
	public void clickState() {
		this.State.click();
	}
	@FindBy(xpath="//input[@name='shipping_address' and @value='1']")
	private WebElement Checkbox; 
	public void clickCheckbox() {
		this.Checkbox.click();
	}
	@FindBy(xpath="//input[@name='shipping_address' and @value='1']")
	private WebElement ClckCheckbox; 
	public void clickClckCheckbox() {
		this.ClckCheckbox.click();
	}
	@FindBy(id="button-guest")
	private WebElement ClckContinue; 
	public void clickClckContinue() {
		this.ClckContinue.click();
	}
	@FindBy(xpath="//textarea[@class='form-control']")
	private WebElement EntrText; 
	public void sendEntrText(String text) {  
		this.EntrText.sendKeys(text);
	}
	@FindBy(xpath="//input[@value='Continue' and @id='button-shipping-method']")
	private WebElement DelverContinue; 
	public void clickDelverContinue() {
		this.DelverContinue.click();
	}
	@FindBy(xpath="//div[@class='pull-right'] /*[@value='1']")
	private WebElement SelectCheckBox; 
	public void clickSelectCheckBox() {
		genericMethods = new GenericMethods(driver);
		genericMethods.jsClick(this.SelectCheckBox);
		//this.SelectCheckBox.click();
	}
	@FindBy(xpath="//input[@type='button' and @id='button-payment-method']")
	private WebElement CodContinue; 
	public void clickCodContinue() {
		this.CodContinue.click();
	}
	@FindBy(xpath="//input[@type='button' and @id='button-confirm']")
	private WebElement CnfOrder; 
	public void clickCnfOrder() {
		this.CnfOrder.click();
	}

	//2nd Testcase

	@FindBy(xpath="//i[@class='fa fa-tags fa-fw']")
	private WebElement ClckCatalog; 
	public void clickClckCatalog() {
		this.ClckCatalog.click();
	}

	@FindBy(xpath="//*[@id='catalog']/ul/li[2]/a")
	private WebElement ClckPrdctLnk; 
	public void clickClckPrdctLnk() {
		this.ClckPrdctLnk.click();
	}

	@FindBy(xpath="//*[@id='content']/div[1]/div/div/a")
	private WebElement ClckAddicn; 
	public void clickClckAddicn() {
		this.ClckAddicn.click();
	}

	@FindBy(id="input-name1")
	private WebElement ProductName; 
	public void sendProductName(String text) {  
		this.ProductName.sendKeys(text);
	}

	@FindBy(id="input-meta-title1")
	private WebElement MetaTagTittle; 
	public void sendMetaTagTittle(String text) {  
		this.MetaTagTittle.sendKeys(text);
	}

	@FindBy(xpath="//a[text()='Data']")
	private WebElement DataTab; 
	public void clickDataTab() {  
		this.DataTab.click();
	}

	@FindBy(id="input-model")
	private WebElement DataModel; 
	public void sendDataModel(String data) {  
		this.DataModel.sendKeys(data);
	}
	@FindBy(id="input-price")
	private WebElement DataPrice; 
	public void sendDataPrice(String number) {  
		this.DataPrice.sendKeys(number);
	}

	@FindBy(id="input-quantity")
	private WebElement DataQuantity; 
	public void sendDataQuantity(String number) { 
		this.DataQuantity.clear();
		this.DataQuantity.sendKeys(number);
	}
	@FindBy(xpath="//a[text()='Links']")
	private WebElement DataLinks; 
	public void clickDataLinks() {  
		this.DataLinks.click();
	}
	@FindBy(id="input-category")
	private WebElement LinkCategories; 
	public void clickLinkCategories() {  
		this.LinkCategories.click();
	}
	@FindBy(xpath="//a[text()='Sports uniform']")
	private WebElement LinkCategryList; 
	public void clickLinkCategryList() {  
		this.LinkCategryList.click();
	}
	@FindBy(xpath="//a[text()='Discount']")
	private WebElement SelDiscount; 
	public void clickSelDiscount() {  
		this.SelDiscount.click();
	}
	@FindBy(xpath="//button[@onclick='addDiscount();']")
	private WebElement ClckAddDiscount; 
	public void clickClckAddDiscount() {  
		this.ClckAddDiscount.click();
	}
	@FindBy(xpath="//input[@name='product_discount[0][quantity]']")
	private WebElement DiscountQnty;
	public void sendDiscountQnty(String value) {  
		this.DiscountQnty.sendKeys(value);
	}
	@FindBy(xpath="//input[@name='product_discount[0][price]']")
	private WebElement DiscountPrice;
	public void sendkDiscountPrice(String value) {  
		this.DiscountPrice.sendKeys(value);
	}
	@FindBy(xpath="//*[@id=\"discount-row0\"]/td[5]/div/span/button/i")   //is there any other way to simplyfy xpath
	private WebElement ClckCalndr; 
	public void clickClckCalndr() {  
		this.ClckCalndr.click();
	}	

	@FindBy(xpath="//td[@class='day active today']")  //is there any other way to simplyfy xpath
	private WebElement ClckStartDate; 
	public void clickClckStartDate() {  
		genericMethods = new GenericMethods(driver);
		genericMethods.jsClick(this.ClckStartDate);
	}
	
	
	@FindBy(xpath="//*[@id=\"discount-row0\"]/td[6]/div/span/button/i")  //is there any other way to simplyfy xpath
	private WebElement ClckEndDateClndr; 
	public void clickClckEndDateClndr() {  
		this.ClckEndDateClndr.click();
	}
	
	@FindBy(xpath="/html/body/div[6]/div/div[1]/table/tbody/tr[5]/td[3]")  //is there any other way to simplyfy xpath
	private WebElement ClckEndDate; 
	public void clickClckEndDate() {  
		this.ClckEndDate.click();
	}
	
	@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[10]/a")
	private WebElement SelReward; 
	public void clickSelReward() {  
		this.SelReward.click();
	}

	@FindBy(id="input-points")
	private WebElement RewardPoints; 
	public void sendRewardPoints(String number) { 
		this.RewardPoints.sendKeys(number);
	}

	@FindBy(xpath="//button[@type='submit']")
	private WebElement Save; 
	public void clickSave() {  
		this.Save.click();
	}


	//3rd Testcase
	
	@FindBy(xpath="//i[@class='fa fa-reply']")
	private WebElement Return; 
	public void clickReturn() {  
		this.Return.click();
	}
	
	@FindBy(xpath="//input[@name='return_reason_id' and @value=3]")
	private WebElement ReturnReason; 
	public void clickReturnReason() {  
		this.ReturnReason.click();
	}
	
	@FindBy(xpath="//input[@name='opened' and @value=1]")
	private WebElement SelectProductOpened; 
	public void clickSelectProductOpened() {  
		this.SelectProductOpened.click();
	}
	
	@FindBy(id="input-comment")
	private WebElement FaultyDetails; 
	public void sendFaultyDetails(String text) { 
		this.FaultyDetails.sendKeys(text);
	}
	
	@FindBy(xpath="//input[@type='checkbox' and @value=1]")
	private WebElement ReturnPolicyCheck; 
	public void clickReturnPolicyCheck() {  
		this.ReturnPolicyCheck.click();
	}
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement ReturnSubmit; 
	public void clickReturnSubmit() {  
		this.ReturnSubmit.click();
	}
	
	
}
