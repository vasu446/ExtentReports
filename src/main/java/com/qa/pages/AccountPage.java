/**
 * 
 */
package com.qa.pages;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;
import com.qa.util.Syncrinization;
import com.qa.util.takeScreenshot;

/**
 * @author spudhari
 *
 */
public class AccountPage extends TestBase{
	
	private static final String Public = null;

	@FindBy(xpath ="//input[contains(id,'username')]")
	public WebElement username;

	@FindBy(xpath ="//input[contains(id,'password')]")
	public WebElement password;

	@FindBy(xpath ="//input[contains(id,'Login')]")
	public WebElement Login;

	@FindBy(xpath ="//div[@class='slds-icon-waffle']")
	public WebElement menubutton;
	
	@FindBy(xpath ="//div[@class='al-menu-dropdown-list']//following::lightning-button")
	public WebElement menulist;
	
	@FindBy(xpath ="//one-app-launcher-modal//input[@type='search']")
	public WebElement searchobj;
	
	@FindBy(xpath ="//button[contains(@class,'closeIcon')]/following::a[contains(@href,'Account')]")
	public WebElement Accountobj;
	
	
	
	//@FindBy(xpath ="//button[@class='slds-button slds-button_neutral search-button slds-truncate']")
	//@FindBy(xpath ="//input[@placeholder='Search...']")
	@FindBy(xpath ="//input[@placeholder='Search...' or 'Căutare...' or 'Căutare Conturi și altele...']")
	
	public WebElement cssearchbtn;

	@FindBy(xpath ="//lightning-input[@class='saInput slds-grow slds-form-element']//input[@type='search']")
	//@FindBy(xpath ="//input[@type='search']")
	public WebElement cssearchbox;
	
	@FindBy(xpath ="//one-app-nav-bar-item-root//a[@title='Accounts']")
	public WebElement Account;
	@FindBy(xpath ="//a[@title='New']//div[contains(text(),'New')]")
	public WebElement New1;

	@FindBy(xpath ="//div//span[contains(text(),'Direct')]")
	public WebElement Directconsumer;

	@FindBy(xpath ="//button//span[contains(text(),'Next')]")
	public WebElement next;

	@FindBy(xpath ="//div//input[@name='lastName']")
	public WebElement lastname;

	@FindBy(xpath ="//div//input[@name='PersonEmail']")
	public WebElement email;

	@FindBy(xpath ="//div//input[@name='PersonMobilePhone']")
	public WebElement phone;

	@FindBy(xpath ="//label[contains(text(),'Account Source')]//following::input[1]")
	public WebElement accountsource;

	@FindBy(xpath ="//label[contains(text(),'Account Source')]//following::div[starts-with(@id,'dropdown-element')][1]")
	public WebElement accountsourcedrop;

	@FindBy(xpath ="//li/div//span[@title='Glo']")
	public WebElement globrand;

	@FindBy(xpath ="//div[contains(text(),'Brand House')]/following::button[1]")
	//@FindBy(xpath ="//div[contains(text(),'Brand House')]/following :: span[contains(text(),'Move selection to Chosen')]")
	public WebElement Addbtn;

	@FindBy(xpath ="//input[@name='Age_verified__c']")
	public WebElement Agebtn;

	@FindBy(xpath ="//div//input[@name='Birth_Date__c']")
	public WebElement dob;

	@FindBy(xpath ="//label[contains(text(),'Gen')]//following::div[@class='slds-form-element__control'][1]")
	public WebElement Gender;

	@FindBy(xpath ="//div//input[contains(@name,'Generic_Permission__c')]")
	public WebElement newsletter;

	@FindBy(xpath ="//div//input[contains(@name,'Registration_Permission__c')]")
	public WebElement personaldata;

	@FindBy(xpath ="//div//input[contains(@name,'SMS_Opt_Out__c')]")
	public WebElement smsoptout;

	@FindBy(xpath ="//button[contains(@name,'SaveEdit')]")
	public WebElement savebtn;
	
	@FindBy(xpath="//div[contains(text(),\"didn't find\")]")
	public WebElement noSearchResults;

	
	
	@FindBy(xpath="//div[@class='slds-icon-waffle']/following::a[@role='button'][2]")
	public WebElement newbtn;
	
	@FindBy(xpath="//button[contains(@class,'close')]/following::span[contains(text(),'Close')][1]/following::input[1]")
	public WebElement mobile1;
	
	@FindBy(xpath="//button[contains(@class,'close')]/following::span[contains(text(),'Close')][1]/following::button[3]")
	public WebElement bypass01;
	
	
	@FindBy(xpath="//button[contains(@class,'close')]/following::span[contains(text(),'Close')][1]/following::input[1]")
	public WebElement email01;
	
	@FindBy(xpath="//button[contains(@class,'close')]/following::span[contains(text(),'Close')][1]/following::button[2]")
	public WebElement bypass02;
	@FindBy(xpath="//div//span[@title='BAT - Service']")
	public WebElement CSAccount;
	
	@FindBy(xpath="//div//span[@title='BAT - Admin']")
	public WebElement AdminAccount;
	
	public  Random randomGenerator = new Random();
	public String randomInt= String.format("%02d", randomGenerator.nextInt(100));
	public  String email1= "srinu1"+randomInt+"@mailinator.com";
	public  String Phone1= "+407111231"+randomInt;
	public String name1="srinutest"+randomInt;
	
	

	
	public AccountPage() 
	{
		super();
		PageFactory.initElements(driver, this);
		
	}

//public  WebElement AccountSearch() throws Exception{
//		
//		try {
//			String country ="RO";
//			System.out.println("The Country is " +country);
//			Thread.sleep(6000);
//			
//
//			System.out.println("searchobj" +searchobj );
//			
//			
//			switch(country) {
//			case "RO":
//				Syncrinization.sendKeys(driver, mobile1, 10, Phone1);
//				System.out.println("email1" +Phone1 );
//				Syncrinization.click(driver, bypass01, 30);
//				Syncrinization.sendKeys(driver, email01, 10, email1);
//				Syncrinization.click(driver, bypass02, 30);
//				break;
//				
//			case "ZA":
//				Syncrinization.sendKeys(driver, cssearchbtn, 10, email1);
//				System.out.println("email1" +email1 );
//				break;
//			}
//		//	cssearchbtn.sendKeys(Keys.ENTER);
//		//cssearchbox.sendKeys(Keys.ENTER);
//		
//		}catch(Exception e)
//		{
//			 System.out.println(e.getMessage());
//		 System.out.println("Taking screenshot");
//		 takeScreenshot.capturescreenshot(driver);
//		}
//	 return noSearchResults;
//	}
public  void AccountCreation() throws Exception{	     
	System.out.println("waiting for an Account");
	Thread.sleep(8000);
	Syncrinization.click(driver, menubutton, 30);
	Thread.sleep(8000);
	Syncrinization.click(driver, menulist, 30);
	Thread.sleep(5000);
	 JavascriptExecutor execautor0 = (JavascriptExecutor)driver;
	WebElement element0 = driver.findElement(By.xpath("//button[contains(@class,'closeIcon')]/following::a[contains(@href,'Account')]"));
	execautor0.executeScript("arguments[0].click();", element0);
	
	WebElement element01 = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']/following::a[@role='button'][2]"));
	execautor0.executeScript("arguments[0].click();", element01);
	System.out.println("clicked on Account");
	Thread.sleep(8000);
	System.out.println("waiting for new button");
	WebElement element02 = driver.findElement(By.xpath("//img[contains(@src,'account')]/following::a[@role='button'][1]"));
	execautor0.executeScript("arguments[0].click();", element02);
    System.out.println("clicked on new button");

	System.out.println("trying to create Account");
//	if(CSAccount.isDisplayed())
//			{
//		System.out.println("inside Account");
//		Thread.sleep(8000);
//		System.out.println("phone number");
//		Syncrinization.sendKeys(driver, mobile1, 30,Phone1);
//		Thread.sleep(3000);
//		Syncrinization.click(driver, bypass01, 30);
//		
//		Thread.sleep(5000);
//		System.out.println("email");
//		Syncrinization.sendKeys(driver, email01, 10,email1);
//		Syncrinization.click(driver, bypass02, 30);
	
//	System.out.println("selecting dob");
//	Syncrinization.sendKeys(driver, dob, 10,"07.04.2001");
//		
//			}
	if (AdminAccount.isDisplayed())
	{
		// Select direct consumer
		
		System.out.println("selecting direct consumer Account");
		Syncrinization.click(driver, Directconsumer, 10);
		//Directconsumer.click();
		Syncrinization.click(driver, next, 30);
		System.out.println("phone number");
		Syncrinization.sendKeys(driver, phone, 10,Phone1);
		//phone.sendKeys(Phone1);
		//next.click();
		System.out.println("email");
		Syncrinization.sendKeys(driver, email, 10, email1);
		//email.sendKeys(email1);

		System.out.println("accountsource option");
		Syncrinization.click(driver, accountsource, 10);
		//accountsource.click();
		List<WebElement> webelements =driver.findElements(By.xpath("//label[contains(text(),'Account Source')]//following::div[starts-with(@id,'dropdown-element')][1]//span[@class='slds-truncate']"));
		System.out.println(webelements);
		for(WebElement ele: webelements)
		{
			String s1= ele.getText();
			System.out.println("name = "+s1);
			if(s1.equals("Glo"))
			{
		    JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		    jse2.executeScript("arguments[0].scrollIntoView()", ele); 
		    Syncrinization.click(driver, ele, 10);
		//ele.click();
		System.out.println("Seelcted " + ele);
		break;
			}
		}	
//		System.out.println("selecting dob");
//		Syncrinization.sendKeys(driver, dob, 10,"07/04/2001");
	}
	

	System.out.println("lastname");
//	lastname.sendKeys("srinu1");   
	Syncrinization.sendKeys(driver, lastname, 10, name1);
 

	System.out.println("selecting brnad");
    JavascriptExecutor execautor2 = (JavascriptExecutor)driver;
    execautor2.executeScript("arguments[0].click();", globrand);
    //globrand.click();
    System.out.println("selecting brnad");
    JavascriptExecutor executor3 = (JavascriptExecutor)driver;
    executor3.executeScript("arguments[0].click();", Addbtn);
   // Addbtn.click();
    
    System.out.println("selecting Age Verified check box ");
    JavascriptExecutor executor4 = (JavascriptExecutor)driver;
    executor4.executeScript("arguments[0].click();", Agebtn);
    //Agebtn.click();
	System.out.println("selecting dob");
	Syncrinization.sendKeys(driver, dob, 10,"07/04/2001");
//	//dob.sendKeys("07.04.2001");
    Thread.sleep(8000);
	
	System.out.println("selecting Gender");
	Syncrinization.click(driver, Gender, 10);
	//Gender.click();
	
	//List<WebElement> webelements =driver.findElements(By.xpath("//label[contains(text(),'Account Source')]//following::div[starts-with(@id,'dropdown-element')][1]//span[@class='slds-truncate']"));
			
	
	List<WebElement> gender1 =driver.findElements(By.xpath("//label[contains(text(),'Gen')]//following::div[starts-with(@id,'dropdown-element')][1]//span[@class='slds-truncate']"));
	System.out.println(gender1);
	for(WebElement gen: gender1)
	{
     	String s2= gen.getText();
		System.out.println("name = "+s2);
		if(s2.equals("M"))
		{
		Syncrinization.click(driver, gen, 10);
	   //gen.click();
    	System.out.println("Seelcted " + gen);
	    break;
		}
	}			
	  
	System.out.println("selecting news letter consent");
	Thread.sleep(4000);
//	Syncrinization.click(driver, newsletter, 30);
	//newsletter.click();
 
	System.out.println("selecting personal data consent");
    WebElement ele1 = driver.findElement(By.xpath("//label[contains(text(),'Gen')]//following::div//input[@name='Generic_Permission__c']"));
  
    JavascriptExecutor executor1 = (JavascriptExecutor)driver;
    executor1.executeScript("arguments[0].click();", ele1);
    Thread.sleep(2000);
	System.out.println("selecting personal data consent");
    WebElement ele = driver.findElement(By.xpath("//label[contains(text(),'Gen')]//following::div//input[@name='Registration_Permission__c']"));
   // JavascriptExecutor executor1 = (JavascriptExecutor)driver;
    executor1.executeScript("arguments[0].click();", ele);
    Thread.sleep(2000);
	System.out.println("selecting SMS optout  option");
	
	  WebElement sms = driver.findElement(By.xpath("//label[contains(text(),'Gen')]//following::div//input[@name='SMS_Opt_Out__c']"));
	 executor1.executeScript("arguments[0].click();", sms);
	 Thread.sleep(4000);
	 System.out.println("saving the account");
	 Syncrinization.click(driver, savebtn, 10);
	 //savebtn.click();
	 Thread.sleep(5000);
	 System.out.println("Taking screenshot");
	 takeScreenshot.capturescreenshot(driver);
    
}


}


