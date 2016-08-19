package com.SydenyOpera.page.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import com.SydenyOpera.core.Actiondriver;

public class GiftvoucherPageElement extends Actiondriver  {

	public GiftvoucherPageElement(WebDriver driver) {
		super(driver);
		
		// TODO Auto-generated constructor stub
	}
	
 
	public static  class GiftVoucher 
	{
		@FindBy(xpath="((//*[@class='col-md-6']/div)[2]/div/button)[3]")
		public WebElement addmoney ;
		
		@FindBy(xpath=".//*[@class='amount-container clearfix']")
		public WebElement Giftvoucherconatiner ;	
	}
	
	public static class Giftingto
	{
		@FindBy(xpath=".//*[@class='gifting-to-container clearfix']")
		public WebElement Giftingtoconatiner;
		
		@FindBy(xpath=".//*[@id='giftReceiver']")
		public WebElement giftreceivername ;
		
		@FindBy(xpath=".//*[@id='giftSender']")
		public WebElement giftsendername ;
		
		@FindBy (xpath="//*[@id='message']")
		public WebElement giftmessage ;
			
	}
	
	public static class Delivery
	{
		@FindBy(xpath=".//*[@class='delivery-container clearfix']")
		public WebElement Deliveryconatiner;
		
		// Locators for selecting and sending gift card 
		@FindBy(how=How.ID,using="otherEmailDelivery")
		public WebElement emailtorecepit ;

		
		@FindBy(how=How.ID,using="otherEmailAddress")
		public WebElement enteremailadd ;
		
		// Locators for Selecting option of self email 
		@FindBy(how=How.ID,using="selfEmailDelivery")
		public WebElement emailtome ;

		
		// Collect at box office selection 
		@FindBy(xpath="((//*[@class='delivery-container clearfix']/div)[2]/div/p)[3]")
		public WebElement collectatboxoffice ;
		
	}
	
	public static class checkout 
	{
		@FindBy(xpath=".//*[@id='btnAddGiftToCart']")
		public WebElement checkoutbut ;
	}
	
}
