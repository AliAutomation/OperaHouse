package com.SydenyOpera.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SydenyOpera.core.Actiondriver;

public class SydenyOperaHeaderElements  extends Actiondriver
{

	public SydenyOperaHeaderElements(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
  
	public static class topnavigation
	{
		@FindBy(xpath=".//*[@id='nav-main']")
		public WebElement navigationmenu ;
		
		
		@FindBy(xpath=".//*[@id='nav-main']/li[2]/a")
		public WebElement events;
		
		@FindBy(xpath="//*[@id='nav-main']/li[3]/a")
		public WebElement Tours;
		
		@FindBy(xpath=".//*[@id='nav-main']/li[4]/a")
		public WebElement Visit ;
		
		@FindBy(xpath=".//*[@class='search-text-container']")
		public WebElement Searchbar ;
		
		@FindBy(xpath=".//*[@class='submit-button desktop']")
		public WebElement SearchButton ;
		
		@FindBy(xpath=".//*[@id='presenters-wrapper']")
		public WebElement presenters ;
					
	}
	
	public static class logo
	{
		@FindBy(xpath=".//*[@class='takeMeHome']/h1")
		public WebElement operaLogo ;
		
		@FindBy(xpath=".//*[@class='hdr-samsung']/img")
		public WebElement SamsungLogo ;
	}
	
	public static  class login
	{
		@FindBy(xpath=".//*[@id='ctl00_ctl09_AdminNav1_nav_login']/a")
		public WebElement login ;
	}
}
