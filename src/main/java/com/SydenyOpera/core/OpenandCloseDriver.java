package com.SydenyOpera.core;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


/**
 * @author aasgh2
 *
 * This is the main class driver is initiated from this class 
 * 
 * By default selenium ( 2.6 ) support firefox  browser and for  chrome and IE we used 
 * external drivers that are stored in tools folder
 * 
 *  
 */
public class OpenandCloseDriver {
	Logger APPLICATION_LOGS = Logger.getLogger("devpinoyLogger");
	String browserType = null;
	Properties CONFIG = null;
	public static WebDriver driver = null;
	public static String baseURL = null;
	// "https://secure.uat.sydneyoperahouse.com/content/soh/account/login.html";

	public OpenandCloseDriver() {

		if (CONFIG == null) {

			try {
				// initialize OR

				CONFIG = new Properties();
				FileInputStream fs = new FileInputStream(
			   System.getProperty("user.dir") + "\\src\\main\\resourses\\Profile\\UATConfig.properties");
				CONFIG.load(fs);

			} catch (Exception e) 
			{
				System.out.println("Error on intializing properties files");
			}

		}

	}

	public void log(String msg) {
		APPLICATION_LOGS.debug(msg);
	}

	public void createDriver() throws MalformedURLException, InterruptedException {

		String browserType = CONFIG.getProperty("browser");
		String baseURL = CONFIG.getProperty("siteURL");
		System.out.println(browserType);
		System.out.println(baseURL);

		if (browserType.equals("Mozilla")) {
			driver = new FirefoxDriver();
			System.out.println(driver);

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

			driver.get(baseURL);

		} else if (browserType.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//tools//Chromedriver//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

			driver.get(baseURL);
		} else if (browserType.equals("IE")) {
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + "//tools//IEdriver//IEDriverServer.exe");
		    
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
			
			driver.get(baseURL);
		}
		
		else 
		{
			driver = new FirefoxDriver();
		}

	}

	public void teardown() {

		driver.close();

	}
}
