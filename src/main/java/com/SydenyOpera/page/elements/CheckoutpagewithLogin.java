package com.SydenyOpera.page.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.SydenyOpera.core.Actiondriver;

public class CheckoutpagewithLogin extends Actiondriver {

	public CheckoutpagewithLogin(WebDriver driver) {
		super(driver);
	
		// TODO Auto-generated constructor stub
	}
	
	public static class  ordersection 
	{
		@FindBy(xpath="//*[@id='sectionOrderDetailsDesktop']")
		public WebElement orderdection ;
		
		@FindBy(xpath="(//*[@class='soh-box-actions col-xs-4 col-sm-3 col-md-4']/a)[1]/span")
		public WebElement backtocartlink ;
		
		@FindBy(xpath="(//*[@class='total-amount'])[1]")
		public WebElement ammountdue ;	
	}
	
	public static class yourdetails
	{
		@FindBy(xpath=".//*[@id='sectionYourDetails']")
		public WebElement yourdetails ;
		
		@FindBy(xpath="//*[@id='wrapper-guest-details']/div[1]")
		public WebElement username ;
		
		@FindBy(xpath=".//*[@id='wrapper-guest-details']/div[2]")
		public WebElement emailid ;
		
	}
	
	public static class paymentdetails 
	{
		@FindBy(xpath=".//*[@id='yourPaymentSection']")
		public WebElement payementsection ;
		
		@FindBy(xpath = "//*[@id='card-holder-name']")
		public WebElement Cardname ;
		
		@FindBy(xpath="//*[@id='card-number']")
		public WebElement cardNumber ;
		
		
		@FindBy(xpath=".//*[@id='expiryDate']")
		public WebElement expirydate ;
		
		@FindBy(xpath ="//*[@id='security-code']")
		public WebElement securecode  ;
		
		@FindBy(xpath="(//*[@id='payment-disclaimer'])")
		public WebElement checkbox;
		
		@FindBy(xpath= "//*[@id='btn-place-order']")
		public WebElement paymentbt ;
		
	}

}
