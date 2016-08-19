package com.SydenyOpera.footer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SydenyOpera.core.Actiondriver;

public class SydenyoperaFooterElements extends Actiondriver 
{
	
	
	public SydenyoperaFooterElements (WebDriver driver )
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public static class footer {
	
	@FindBy(xpath=".//*[@id='footer-wrapper']")
	public WebElement footersection ;
	
	@FindBy(xpath=".//*[@id='footer']/div[1]/div")
	public WebElement Socialmedia ;
	
	@FindBy(xpath=".//*[@id='footer']/div[3]/div[2]")
	public WebElement operarightNaviagation ;
	
	@FindBy(xpath=".//*[@id='footer-soh-vouchers']")
	public WebElement giftvoucher ;
	
	@FindBy(xpath=".//*[@id='footer']/div[2]/div[3]")
	public WebElement thingstodo ;
	
	@FindBy(xpath=".//*[@id='footer-todo-tours']")
	public WebElement tours ;
	
	@FindBy(xpath = ".//*[@id='footer-todo-bookings']/a")
	public WebElement Groupbooking ;
	
	@FindBy(xpath =".//*[@id='footer']/div[2]/div[2]" )
	public WebElement VisitorInfo ;
	
	
	@FindBy (xpath=".//*[@id='footer']/div[2]/div[1]")
	public WebElement contactus ;
	
	
	@FindBy(xpath=".//*[@id='footer']/div[5]/p")
	public WebElement copyright ;
	
}
}
