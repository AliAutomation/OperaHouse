package com.SydenyOpera.core;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Actiondriver {
	
	/** The driver. */
	protected WebDriver driver;

	/** The ocb. */
	public static OpenandCloseDriver ocb = new OpenandCloseDriver();

	/** The wait. */
	public FluentWait<WebDriver> wait;

	protected Actions action;

	protected boolean flag;
	
	public String mssg;
	
	
	public Actiondriver ( WebDriver driver) {
		this.driver = driver;
		action = new Actions(driver);


this.wait = new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(100, TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);

	}
	
	public String generateRandomEmailId() {

		DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		Calendar cal = Calendar.getInstance();
		String rnd = generateRandomNumber(0, 9999) + "";
		String emailId = "au" + dateFormat.format(cal.getTime()) + "@ecommerce" + rnd + ".com";

		System.out.println(emailId);

		return emailId;

	}
	public static int generateRandomNumber(int min, int max) {

		// NOTE: Usually this should be a field rather than a method
		// variable so that it is not re-seeded every call.
		Random rand = new Random();

		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}
	
	public String getStackTrace(Exception e) {

		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		e.printStackTrace(pw);
		return sw.toString();

	}

	public void hoverOverElement(WebElement element) {

		try {
			Actions action = new Actions(driver);
			action.moveToElement(element).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			mssg = getStackTrace(e);
		}

	}
	

	public boolean ifElementIsPresentAndDisplayed(List<WebElement> webElement) {

		int counter = 0;
		if (webElement.size() > 0) {

			System.out.println("WebElement is present");
			for (int i = 0; i < webElement.size(); i++) {

				if (webElement.get(i).isDisplayed()) {
					System.out.println("WebElement is displayed");
					counter++;

				}
			}

			return counter > 0;

		} else {
			System.out.println("WebElement is not present");

			return false;
		}

	}

	public boolean waitForElementToBeClickable(WebElement element, int timeoutInSeconds) {

		try {
			wait.withTimeout(timeoutInSeconds, TimeUnit.SECONDS).pollingEvery(100, TimeUnit.MILLISECONDS)
					.ignoring(NoSuchElementException.class).ignoring(org.openqa.selenium.StaleElementReferenceException.class)
					.until(ExpectedConditions.elementToBeClickable(element));
			return true;
		} 
		catch (org.openqa.selenium.StaleElementReferenceException e) {
			
			e.printStackTrace();
			return false;

		}
	}

	public boolean waitForElementToBeVisible(WebElement element, int timeoutInSeconds) {

		wait.withTimeout(timeoutInSeconds, TimeUnit.SECONDS).pollingEvery(100, TimeUnit.MILLISECONDS)
				.ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOf(element));
		return true;

	}
	

	public boolean waitForElementToBeInVisible(WebElement element,
			int timeoutInSeconds) {

		wait.withTimeout(timeoutInSeconds, TimeUnit.SECONDS)
				.pollingEvery(100, TimeUnit.MILLISECONDS)
				.ignoring(NoSuchElementException.class)
				.until(ExpectedConditions.invisibilityOfElementLocated((By) element));
		return true;

	}
	
	
	public boolean isClickable(WebElement element)      
	{
	try
	{
	
	   wait.until(ExpectedConditions.elementToBeClickable(element));
	   return true;
	}
	catch (Exception e)
	{
	  return false;
	}
	}

	public void javaClick(WebElement element) {

		JavascriptExecutor ex = (JavascriptExecutor) driver;

		ex.executeScript("arguments[0].click();", element);
	} 

	public void clickAction(WebElement element) {
		action.moveToElement(element).build().perform();

		action.click(element).build().perform();

	}
	
	 

}
