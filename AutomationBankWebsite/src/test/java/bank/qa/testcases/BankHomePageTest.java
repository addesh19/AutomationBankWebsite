package bank.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import bank.qa.base.TestBase;
import bank.qa.pages.BankHomePage;
import bank.qa.pages.BankLoginPage;

public class BankHomePageTest extends TestBase {
	BankLoginPage loginPage;
	BankHomePage homePage;

	public BankHomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setup(){
		//Called initialization of Base class to avoid null pointer exception
		initialization();
		
		//create object of loginPage class and login to go to homepage
		loginPage =new BankLoginPage();
		homePage= loginPage.login(prop.getProperty("username"),prop.getProperty("pasword"));
	}
	
	@Test
	public void verifyHomePageTitleTest(){
		String HomePageTitle= homePage.verifyHomePageTitle();
	//	Assert.assertEquals(HomePageTitle, expected);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
