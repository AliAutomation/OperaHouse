package com.SydenyOpera.page.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.SydenyOpera.core.Actiondriver;

/**
 * @author aasgh2
 *
 *This class contain Locators of Checkout page 
 */
public class CheckoutpageElement extends Actiondriver 
{
	
	public CheckoutpageElement(WebDriver driver) {
		super(driver);
	
		// TODO Auto-generated constructor stub
	}

	public static class landingpage 
	{
	    @FindBy(xpath="(//*[@class='soh-box'])[1]")
	     public WebElement landingpage ;
	
	     @FindBy(xpath="//*[@class='soh-box-actions col-xs-4 col-sm-3 col-md-4']/a")
	     public WebElement Backtocart;
	
	     @FindBy(xpath="(//*[@class='total-amount'])[1]")
	     public WebElement  totalamount ;
	}
	
	public static class UserDetails 
	{
	
	  @FindBy(xpath="(//*[@id='wrapper-sign-in-options']/a)[1]")
	  public WebElement signin ;
	
	  @FindBy(xpath="(//*[@id='wrapper-sign-in-options']/a)[2]")
	  public WebElement guest;
	
	  @FindBy(xpath="//*[@class='icon-facebook']")
	  public WebElement facebook;
	
	  @FindBy(xpath=".//*[@id='btnGooglePlusSignIn']/a")
	  public WebElement googleplus;
	
	}
		
    public static class  Memberlogin 
	{
	     @FindBy(xpath="//*[@id='signInEmail']")
	     public WebElement email ;
	
	   @FindBy(xpath="//*[@id='signInPassword']")
	   public WebElement password;
	
	    @FindBy(xpath=".//*[@id='frm-member-sign-in']/button")
	    public WebElement SigninButton ;
	
	   @FindBy(xpath="//*[@class='member-sign-in-form show']")
	    public WebElement GregBut;
	} 
	
	public static class Guestlogin 
	{
	  @FindBy(xpath= "//*[@id='guestFirstName']")
	  public WebElement GFirstName ;
	
	   @FindBy(xpath="//*[@id='guestLastName']")
	   public WebElement GLastName ;
	
	   @FindBy(xpath="//*[@id='guestSignInEmail']")
	   public WebElement GEmail ;
	
	   @FindBy(xpath=".//*[@id='frm-guest-sign-in']/button")
    	public WebElement gsubmit;
	
	   @FindBy(xpath="//*[@id='guest-form-wrapper']/div[2]/a")
	   public WebElement Gsign;
	}
	
	public static class googleplus
	{
		@FindBy(xpath=".//*[@id='Email']")
		public WebElement googleEmail ;
		
		@FindBy(xpath=".//*[@id='next']")
		public WebElement  googlenext;
		
		@FindBy(xpath=".//*[@id='Passwd']")
		public WebElement googlepassword ;
		
		@FindBy(xpath=".//*[@id='signIn']")
		public WebElement googlesign ;
	}
	
	
	
 public static class Deliveryoption 
 {
  
	@FindBy(xpath="//*[@id='your-delivery-section']/header")
	public WebElement delivery;
 
	@FindBy(xpath = "(//*[@class='content delivery-options-wrapper']/ul/li/p)[1]")
	public WebElement ReceiveEmail ;
	
	@FindBy (xpath="//*[@id='wrapper-deliveryViaEmail']/form/p/button")
	public WebElement ReceiveEmailBt ;
	
	@FindBy(xpath="(//*[@class='content delivery-options-wrapper']/ul/li/p)[2]")
	public WebElement CollectBoxoffice ;
	
	@FindBy(xpath=".//*[@id='wrapper-deliveryAtBoxOffice']/form/p/button")
	public WebElement  CollectBoxOfficeBt ;
	
	@FindBy (xpath = "(//*[@class='content delivery-options-wrapper']/ul/li/p)[3]")
	public WebElement CollectPost ;
	
	@FindBy(xpath = "//*[@id='formStaticAddressDeliveryOptions']/div[2]/div/button")
    public WebElement CollectPostBt ;
	
	
 }	
 
public static class paymentoption 
{
	

	//@FindBy(xpath = ".//*[@id='card-holder-name']")
	
	
	
	@FindBy(how=How.ID,using="card-holder-name")
	public WebElement Cardname ;
	
	@FindBy(xpath="//*[@id='card-number']")
	public WebElement cardNumber ;
	
	
	@FindBy(xpath=".//*[@id='expiryDate']")
	public WebElement expirydate ;
	
	@FindBy(xpath ="//*[@id='security-code']")
	public WebElement securecode  ;
	
	@FindBy(xpath= "//*[@id='btn-place-order']")
	public WebElement paymentbt ;
	
	@FindBy(xpath="//*[@id='yourPaymentSection']")
	public WebElement paymentopt ;

}

   public static class facebook
    {
        @FindBy(xpath="//*[@class='icon-facebook']")
        public WebElement facebook;
        
        @FindBy(xpath=".//*[@id='email']")
        public WebElement Facebookemail ;
        
        @FindBy(xpath=".//*[@id='pass']")
        public WebElement Facebookpassword;
        
        @FindBy(xpath=".//*[@id='u_0_2']")
        public WebElement facebooksubmit ;
       
     }
   
   public  static class Reedvoucher
   {
	   @FindBy(xpath="(//*[@class='redeemSection']/div)[1]" )
	   public WebElement giftvouchersection ;
	   
	   @FindBy(xpath="((//*[@class='redeemSection']/div)[1])/button")
	   public WebElement giftbutton;
	   
	   @FindBy(xpath="(.//*[@id='redeemApply'])[1]")
	   public WebElement  redeemcode ;
	   
	   @FindBy(xpath="(//*[@id='btn-gift-voucher-redeem'])[1]")
	   public WebElement giftsubmit;
	
	  @FindBy(xpath="(//*[@class='checkout-money-detail redeem-applied']/span[3])[1]")
	  public WebElement amountredeem ;
	  
	  @FindBy(xpath="(.//*[@class='total-amount']/div/span[2])[1]")
	  public WebElement restamount ;
	   
   }
}
