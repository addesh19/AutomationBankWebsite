package bank.qa.testcases;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import bank.qa.pages.BankHomePage;
import bank.qa.pages.BankLoginPage;
import bank.qa.base.TestBase;

public class BankLoginPageTest extends TestBase {
	
	BankLoginPage loginPage;
	BankHomePage homePage;
	public BankLoginPageTest(){
		// to call Test Base class constructor  
		super();
	}
	@BeforeMethod
	public void setup(){
		//Called initialization of Base class to avoid null pointer exception
		initialization();
		
		//create object of loginPage class
		loginPage =new BankLoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title= loginPage.ValidateLoginPageTitle();
		Assert.assertEquals(title,"ParaBank | Welcome | Online Banking");
	}
	
	@Test(priority=2)
	public void LoginTest(){
		
		homePage= loginPage.login(prop.getProperty("username"),prop.getProperty("pasword"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
