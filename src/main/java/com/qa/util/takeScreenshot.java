/**
 * 
 */
package com.qa.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import com.qa.base.TestBase;

/**
 * @author spudhari
 *
 */
public class takeScreenshot {
	
	public static void capturescreenshot(WebDriver driver) throws Exception
	{
	

	
	try {
		Thread.sleep(5000);
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);	
		
		FileUtils.copyFile(source, new File("C:\\Users\\spudhari\\eclipse-workspace\\ROAccount\\Screenshots\\test1.png"));
	} catch (Exception e) {
	
		
		System.out.println("Exception while taking screenshot");
		e.printStackTrace();
	}
	
	}
	
}	
