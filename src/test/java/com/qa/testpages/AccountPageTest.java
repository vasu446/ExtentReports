/**
 * 
 */
package com.qa.testpages;

import static org.testng.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.AccountPage;
import com.qa.pages.LoginPage;

/**
 * @author spudhari
 *
 */
public class AccountPageTest extends TestBase{
	public LoginPage login;
	public AccountPage account;
	//public WebElement noSearchResults;
	
	public AccountPageTest()
	{
		super();
	}

	
	@Test(priority = 0)
	public void setup()
	{
		initialization();
		login = new LoginPage();
		account = new AccountPage();
		
	}
	
	@Test(priority = 1)
	public void LoginMethod() throws InterruptedException
	{
		System.out.println("LoginMethod");
		login.LoginMethod(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority = 2)
	public void ValidatePageTitle() throws InterruptedException 
	{
		System.out.println("ValidatePageTitle");
		login.ValidatePageTitle();	
	}
		
	@Test(priority = 3)
	public void AccountSearch() throws Exception
	{
//		//account = new AccountPage();
//		System.out.println("AccountSearch");
//		WebElement noSearchResults = account.AccountSearch();
//		System.out.println("noSearchResults" +noSearchResults);
//	if(noSearchResults.isDisplayed())
//	{
		System.out.println("AccountCreation");
		account.AccountCreation();
	}
//	
//	}
//	
//	@Test (priority = 4)
//	public void AccountCreation() throws Exception
//	{
//		//account = new AccountPage();
//		System.out.println("AccountCreation");
//	//	account.AccountCreation();
//	}
	
	@AfterClass
	public void tearDown()
	{
		System.out.println("tearDown");
		
	//	driver.quit();
		
	}

}
