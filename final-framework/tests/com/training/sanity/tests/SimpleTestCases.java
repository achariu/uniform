package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.HomePagePOM;

import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
//import com.trianing.waits.WaitTypes;

public class SimpleTestCases {

	private WebDriver driver; 
	private String baseUrl; 
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
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.close();
	}

	@Test(priority=1)
	public void loginPassTest() {
		homePagePOM.clickAccIcon();
		homePagePOM.clickRegitration();
		homePagePOM.clickLogin1();
		homePagePOM.sendEmail("schari765@gmail.com");
		homePagePOM.clickmyPasswd("Achari123");
		homePagePOM.clickLogin2();
		homePagePOM.clickHistory();		

		screenShot.captureScreenShot("First");


		List<WebElement> tableElenemt = homePagePOM.getProductDetails();

		String[] ExpectedValues = {"Order ID","Customer","No. of Products","Status","Total","Date Added"};
		for (int i=0;i<tableElenemt.size()-1;i++)

		{
			if(tableElenemt.get(i).getText().equals(ExpectedValues[i])){ 
				System.out.println("Expendted values are: " + ExpectedValues[i]);
				System.out.println("Table values : " + tableElenemt.get(i).getText());
			}else
			{
				Assert.fail();
			}
		}
		List<WebElement> tableVlaue = homePagePOM.getValueDetails();

		String[] ExpectedResults = {"#363","Achari123 unda","2","Pending","851","23/07/2019"};
		for (int j=0;j<tableVlaue.size()-2;j++)
		{
			System.out.println("ExpectedResults are: " + ExpectedResults[j]);
			System.out.println("Table results : " + tableVlaue.get(j).getText());

			if(tableVlaue.get(j).getText().contains(ExpectedResults[j])){ 
				System.out.println("ExpectedResults are: " + ExpectedResults[j]);
				System.out.println("Table results : " + tableVlaue.get(j).getText());
			}else
			{
				Assert.fail();
			}
		}

		homePagePOM.clickViewIcon();
		screenShot.captureScreenShot("First");
	}
	
	//2nd Test case	(Edit Account Details)
	@Test(priority=2)
	public void EditAccount() {
		homePagePOM.clickAccIcon();
		homePagePOM.clickRegitration();
		homePagePOM.clickLogin1();
		homePagePOM.sendEmail("neha765@gmail.com");
		homePagePOM.clickmyPasswd("Neha123");
		homePagePOM.clickLogin2();
		homePagePOM.clickEditAccnt();
		homePagePOM.sendfirstName("Neha");
		homePagePOM.sendlastName("B");
		homePagePOM.sendeMail("neha987@gmail.com");
		homePagePOM.sendphNumber("9876543210");
		homePagePOM.clickctnButton();
		screenShot.captureScreenShot("First");
	}	

	//3rd Test case (Change password)
	@Test(priority=3)
	public void EditPassword() {
		homePagePOM.clickAccIcon();
		homePagePOM.clickRegitration();
		homePagePOM.clickLogin1();
		homePagePOM.sendEmail("neha123@gmail.com");
		homePagePOM.clickmyPasswd("schari123");
		homePagePOM.clickLogin2();
		homePagePOM.clickchngPassword();
		homePagePOM.sendnewPasswd("Neha123");
		homePagePOM.sendcnfPasswd("Neha123");
		homePagePOM.clicksubmitChng();
		screenShot.captureScreenShot("First");
	}

}






