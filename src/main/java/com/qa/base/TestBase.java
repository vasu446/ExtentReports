/**
 * 
 */
package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author spudhari
 *
 */
public class TestBase {
	public static Properties prop;
	public static WebDriver driver;
	public TestBase()
	{
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("C:\\Users\\spudhari\\eclipse-workspace\\ROAccount2\\src\\main"
					+"\\java\\com\\qa\\config\\config.properties"); 
			prop.load(ip);
			System.out.println("Properties");
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
	}

	public void initialization()
	{
		
		String browserName = prop.getProperty("browser");
		System.out.println("browser"+browserName);
		if(browserName.equals("chrome"))
		{
			ChromeOptions opt= new ChromeOptions();
			opt.addArguments("--disable-notifications");
			//System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\spudhari\\\\Desktop\\\\old\\\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(opt);
		System.out.println("driver" + driver);
			
		}
		else
		{
			System.out.println("No matching found");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(com.bat.util.TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(com.bat.util.TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	////	
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60L, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(6L, TimeUnit.SECONDS);
		
		System.out.println("URL is "+ prop.getProperty("url"));
		System.out.println("Driver is "+ driver);
		driver.get(prop.getProperty("url"));
		System.out.println("initialization");
	}


	}

