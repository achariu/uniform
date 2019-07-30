package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.HomePagePOM;
import com.training.pom.UnifirmLogInPOM;
import com.training.pom.UniformOrderPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class MediumTestCase {

	private WebDriver driver; 
	private String baseUrl; 
	private String adminURL; 
	//private HomePagePOM homePagePOM;
	private UniformOrderPOM uniformOrderPOM;
	private UnifirmLogInPOM unifirmLogInPOM;
	private HomePagePOM homePagePOM;
	private static Properties properties; 
	private ScreenShot screenShot; 

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		homePagePOM = new HomePagePOM(driver); 
		uniformOrderPOM = new UniformOrderPOM(driver);
		unifirmLogInPOM = new UnifirmLogInPOM(driver);
		homePagePOM = new HomePagePOM(driver);
		baseUrl = properties.getProperty("baseURL");
		adminURL = properties.getProperty("adminURL");
		screenShot = new ScreenShot(driver); 
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.close();
	}


 	// Medium Test case 1
 	 
	@Test(priority=1)
	public void  ShopUniformsTest() {

		uniformOrderPOM.clickShopUniform();
		uniformOrderPOM.clickUnifrmImg();
		uniformOrderPOM.clickSelChest();
		uniformOrderPOM.clickAddCart();
		uniformOrderPOM.clickClckViewCart();
		uniformOrderPOM.clickCheckout();
		uniformOrderPOM.clickGuestCheckout();
		uniformOrderPOM.clickContinue();
		uniformOrderPOM.sendfirstName("Mohith");
		uniformOrderPOM.sendlastName("Undava");
		uniformOrderPOM.sendeMail("schariu@gmail.com");
		uniformOrderPOM.sendphNumber("9987767853");
		uniformOrderPOM.sendAddress1("846");
		uniformOrderPOM.sendCity("Bangalore");
		uniformOrderPOM.sendPstCode("560022");
		uniformOrderPOM.clickCountry(); 
		uniformOrderPOM.clickState();
		uniformOrderPOM.clickCheckbox();
		uniformOrderPOM.clickClckCheckbox();
		uniformOrderPOM.clickClckContinue();
		uniformOrderPOM.sendEntrText("Order is Ready");
		uniformOrderPOM.clickDelverContinue();
		uniformOrderPOM.clickSelectCheckBox();
		uniformOrderPOM.clickCodContinue();
		uniformOrderPOM.clickCnfOrder();

		screenShot.captureScreenShot("First");

	}

	
	
	 // Medium Test case 2
	@Test(priority=2)
	public void  CatalogTestcase() {
		driver.navigate().to(adminURL);
		homePagePOM.sendUserName("admin");
		homePagePOM.sendPassword("admin@123");
		homePagePOM.clickAdminLogin();
		uniformOrderPOM.clickClckCatalog();
		uniformOrderPOM.clickClckPrdctLnk();
		uniformOrderPOM.clickClckAddicn();
		uniformOrderPOM.sendProductName("Blazer Girls(7-8)");
		uniformOrderPOM.sendMetaTagTittle("Blazer for Girls");
		uniformOrderPOM.clickDataTab();
		uniformOrderPOM.sendDataModel("BLG-112");
		uniformOrderPOM.sendDataPrice("3000");
		uniformOrderPOM.sendDataQuantity("100");
		uniformOrderPOM.clickDataLinks();
		uniformOrderPOM.clickLinkCategories();
		uniformOrderPOM.clickLinkCategryList();
		uniformOrderPOM.clickSelDiscount();
		uniformOrderPOM.clickClckAddDiscount();
		uniformOrderPOM.sendDiscountQnty("5");
		uniformOrderPOM.sendkDiscountPrice("200");
		uniformOrderPOM.clickClckCalndr();
		uniformOrderPOM.clickClckStartDate();
		uniformOrderPOM.clickClckEndDateClndr();
		uniformOrderPOM.clickClckEndDate();
		uniformOrderPOM.clickSelReward();
		uniformOrderPOM.sendRewardPoints("20");
		uniformOrderPOM.clickSave();
		screenShot.captureScreenShot("First");
	}
	
	
	
	
	
	// Medium Test case 3
	@Test(priority=3)
	public void  ReturnOrder() {
	
		homePagePOM.clickAccIcon();
		homePagePOM.clickRegitration();
		homePagePOM.clickLogin1();
		unifirmLogInPOM.sendEmail("mohith@gmail.com");
		unifirmLogInPOM.clickmyPasswd("achari123");
		unifirmLogInPOM.clickLogin2();
		homePagePOM.clickHistory();		
		homePagePOM.clickViewIcon();
		screenShot.captureScreenShot("First");
		uniformOrderPOM.clickReturn();
		uniformOrderPOM.clickReturnReason();
		uniformOrderPOM.clickSelectProductOpened();
		uniformOrderPOM.sendFaultyDetails("Incorrect Item");
		uniformOrderPOM.clickReturnPolicyCheck();
		uniformOrderPOM.clickReturnSubmit();
		screenShot.captureScreenShot("First");
}


}


