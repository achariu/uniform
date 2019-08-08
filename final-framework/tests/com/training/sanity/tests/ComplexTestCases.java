package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.HomePagePOM;
//import com.training.pom.UnifirmLogInPOM;
import com.training.pom.UniformOrderPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ComplexTestCases {

	private WebDriver driver; 
	private String baseUrl; 
	private String adminURL; 
	//private HomePagePOM homePagePOM;
	private UniformOrderPOM uniformOrderPOM;
	//private UnifirmLogInPOM unifirmLogInPOM;
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
		//unifirmLogInPOM = new UnifirmLogInPOM(driver);
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


	
	// Complex Test case1
	@Test(priority=1)
	public void  MultipleCategory () {
		driver.navigate().to(adminURL);
		homePagePOM.sendUserName("admin");
		homePagePOM.sendPassword("admin@123");
		homePagePOM.clickAdminLogin();
		uniformOrderPOM.clickClckCatalog();
		uniformOrderPOM.clickClckCategories();
		uniformOrderPOM.clickClckAddicn();
		uniformOrderPOM.sendProductName("Blazer Girls(7-8)");
		uniformOrderPOM.sendCatgryDescription("Category Name");
		uniformOrderPOM.sendMetaTagTittle("Blazer for Girls");
		uniformOrderPOM.sendMetaTagDescription("Blazer");
		uniformOrderPOM.clickSave();
		uniformOrderPOM.clickLogOut();
		homePagePOM.sendUserName("admin");
		homePagePOM.sendPassword("admin@123");
		homePagePOM.clickAdminLogin();
		
	
	}
 	// Complex Test case2
 	 
	@Test(priority=2)
	public void  CatalogTestcase() {
		driver.navigate().to(adminURL);
		homePagePOM.sendUserName("admin");
		homePagePOM.sendPassword("admin@123");
		homePagePOM.clickAdminLogin();
		
		uniformOrderPOM.clickClckCatalog();
		List<WebElement> categeoryList = uniformOrderPOM.getCatalogDetails();
		for(int i=0; i<categeoryList.size(); i++) {
			System.out.println(categeoryList.get(i).getText());
		}
		
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
		uniformOrderPOM.clickSave();
		
	
	}

	
	
	 // Complex Test case3
	@Test(priority=3)
	public void  StoresCategory () {
		driver.navigate().to(adminURL);
		homePagePOM.sendUserName("admin");
		homePagePOM.sendPassword("admin@123");
		homePagePOM.clickAdminLogin();
		uniformOrderPOM.clickClckCatalog();
		uniformOrderPOM.clickClckCategories();
		uniformOrderPOM.clickClckAddicn();
		uniformOrderPOM.sendProductName("Sports");
		uniformOrderPOM.sendCatgryDescription("Sports shoes");
		uniformOrderPOM.sendMetaTagTittle("shoes");
		uniformOrderPOM.sendMetaTagDescription("Sports shoes");
		uniformOrderPOM.clickSave();
		uniformOrderPOM.clickLogOut();
		homePagePOM.sendUserName("admin");
		homePagePOM.sendPassword("admin@123");
		homePagePOM.clickAdminLogin();
		
	
	}
	
	
}
