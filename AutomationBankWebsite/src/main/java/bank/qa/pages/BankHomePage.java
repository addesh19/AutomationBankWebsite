package bank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bank.qa.base.TestBase;

public class BankHomePage extends TestBase {
	
	@FindBy(xpath="//a[text()='Open New Account']")
	WebElement OpenNewAccount;
	
	@FindBy(xpath="//a[text()='Accounts Overview']")
	WebElement AccountsOverview;
	
	@FindBy(xpath="//a[text()='Transfer Funds']")
	WebElement Trnasferfunds;
	
	public BankHomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	public AccountsOverview clickAccountsOverview(){
		AccountsOverview.click();
		return new AccountsOverview();
	}

}
