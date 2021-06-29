/**
 * 
 */
package com.qa.testpages;

import org.junit.validator.PublicClassValidator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;

/**
 * @author spudhari
 *
 */
public class LoginPageTest extends TestBase {
	
	public LoginPage login;
	public LoginPageTest()
	{
		super();
	}

	@BeforeMethod
	public void setup()
	{
		initialization();
	login	 = new LoginPage(	);
		
	}
	@Test
	public void LoginMethod() throws InterruptedException
	{
		login.LoginMethod(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test
	public void ValidatePageTitle() throws InterruptedException 
	{
	
	login.ValidatePageTitle();	
	}
	
	@AfterMethod
	
	public void tearDown()
	{
		
		driver.quit();
		
	}
}
