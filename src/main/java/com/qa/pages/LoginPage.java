/**
 * 
 */
package com.qa.pages;

import static org.testng.Assert.assertEquals;

import java.util.Properties;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;
import com.qa.util.takeScreenshot;

/**
 * @author spudhari
 *
 */
public class LoginPage extends TestBase{
	
	@FindBy(xpath ="//input[@id='username']")
	public WebElement username;

	@FindBy(xpath ="//input[@id='password']")
	public WebElement password;

	@FindBy(xpath ="//input[@id='Login']")
	public WebElement Login;


	public LoginPage() 
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	public  void LoginMethod(String un, String pwd) throws InterruptedException{
		System.out.println(" The Login Method");
		username.sendKeys(un);
		password.sendKeys(pwd);
		System.out.println("before login");
		Login.click();
		System.out.println("After login");
		

	}
	public void ValidatePageTitle() throws InterruptedException
	{
		
		try
		{
		Thread.sleep(9000);
		
	//	String ExpectedName="Lightning Experience";
		String ActualName = driver.getTitle();
		System.out.println("ActualName"+ActualName);
		//assertEquals(ActualName.equalsIgnoreCase("Home | Salesforce"), true);
		}catch(Exception e)
		{
			e.getMessage();
		}
	}
	
}
