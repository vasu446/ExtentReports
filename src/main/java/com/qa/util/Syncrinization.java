/**
 * 
 */
package com.qa.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author spudhari
 *
 */
public class Syncrinization {
	
		public static void sendKeys(WebDriver driver,WebElement element, int timeout,String value)

	{
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}

public static void click(WebDriver driver,WebElement element, int timeout)

{
	new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
	element.click();
}
}
