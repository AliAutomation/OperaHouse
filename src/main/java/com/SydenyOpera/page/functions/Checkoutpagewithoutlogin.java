package com.SydenyOpera.page.functions;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.SydenyOpera.page.elements.CheckoutpageElement;

public class Checkoutpagewithoutlogin extends CheckoutpageElement 
{


	

	public class FAcebook 
	{
		public void facebooklogin(String  FacebookID , String password) throws InterruptedException
		{
			
			userdetails.facebook.click();
			
			/*Set Handles = driver.getWindowHandles();
			 
			// Switch focus to the second opened window (which doesn't have a title)
			int size = Handles.size();
			System.out.println("size is"+Handles.size());
			 
			driver.switchTo().window((String) Handles.toArray()[1]);*/
			
			
			 Facebook.Facebookemail.sendKeys(FacebookID);
			 Facebook.Facebookpassword.sendKeys(password);
			 Facebook.facebooksubmit.click();
			 
			// switch back to the original window
			 
			/*driver.switchTo().window((String) Handles.toArray()[0]);*/
			
			/*String  parent = driver.getWindowHandle();
			userdetails.facebook.click();
			
		  Set<String> allwindows = driver.getWindowHandles();
			
		  for (String handle : driver.getWindowHandles()) {

			    driver.switchTo().window(handle);}
		  
		  for(String select : allwindows)
		  {
			  driver.switchTo().window(select);
			  
			  System.err.println(select);
			  if(driver.getTitle().equals("Facebook"))
			  {
				  Facebook.Facebookemail.sendKeys(FacebookID);
				  Thread.sleep(1000);
				  Facebook.Facebookpassword.sendKeys(password);
				  Thread.sleep(1000);
				  Facebook.facebooksubmit.click();
				  
			  }
			    Thread.sleep(2000);
				 driver.close();
		  }
		  
		   driver.switchTo().window(parent);*/
		}
		
		
		

	}

	public class VoucherReedm 
	{
		public void verifyuserabletoclickonvocher()
		{
			reedemVoucher.giftbutton.click();
		}
		public void verifythatuserabletoentergiftvoucher(String code)
		{
			
			reedemVoucher.redeemcode.sendKeys(code);
			reedemVoucher.giftsubmit.click();
		}
		
		public void verifytheamountthatisbeingdeducted()
		{
			
		 System.out.println( "amount that is being reedem" + reedemVoucher.amountredeem.getText());	 
		 System.out.println("final amount to be paid" + reedemVoucher.restamount.getText());
		 
		}

	}

	public class GooglePlus 
	{
		public void googlelogin(String Gmail , String Gmailpassword) throws InterruptedException
		{
			String  parent = driver.getWindowHandle();
			
			userdetails.googleplus.click();
			
			 Set<String> allwindows = driver.getWindowHandles();
			 for(String select : allwindows)
			 {
				 
				driver.switchTo().window(select);
				
				if(driver.getTitle().equals("Sign in - Google Accounts"))
				{
					Googleplus.googleEmail.sendKeys(Gmail );


					Googleplus.googlenext.click();
					Thread.sleep(1000);
					Googleplus.googlepassword.sendKeys(Gmailpassword);
					Thread.sleep(1000);
					Googleplus.googlesign.click();
					
				}
				
				 Thread.sleep(2000);
				 driver.close();
			}
			 
			 driver.switchTo().window(parent);
			
		}

	}

	public Checkoutpagewithoutlogin(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public Checkoutpagewithoutlogin.Userdetails userdetail = new Userdetails();
	public Checkoutpagewithoutlogin.DeliveryOption deliveryOption = new DeliveryOption();
	public Checkoutpagewithoutlogin.GuestLogin guestLogin = new GuestLogin();
	public Checkoutpagewithoutlogin.MemeberLogin memberLogin = new MemeberLogin();
	public Checkoutpagewithoutlogin.PaymentOption paymentOption = new PaymentOption();
	public Checkoutpagewithoutlogin.GooglePlus  googleplus = new GooglePlus();
	public Checkoutpagewithoutlogin.VoucherReedm voucherreedm = new VoucherReedm();
	public Checkoutpagewithoutlogin.FAcebook facebook = new FAcebook();

	CheckoutpageElement.Memberlogin memberlogin = PageFactory.initElements(driver,CheckoutpageElement .Memberlogin.class);
	CheckoutpageElement.Guestlogin  guestlogin =PageFactory.initElements(driver,CheckoutpageElement.Guestlogin.class);
	CheckoutpageElement.UserDetails userdetails =PageFactory.initElements(driver,CheckoutpageElement.UserDetails.class);
	CheckoutpageElement.Deliveryoption deliveryoption =PageFactory.initElements(driver,CheckoutpageElement.Deliveryoption.class);
	CheckoutpageElement.landingpage Landingpage =PageFactory.initElements(driver,CheckoutpageElement.landingpage.class);
	CheckoutpageElement.paymentoption Paymentoption = PageFactory.initElements(driver,CheckoutpageElement.paymentoption.class);
	CheckoutpageElement.googleplus Googleplus = PageFactory.initElements(driver ,CheckoutpageElement.googleplus.class);
	CheckoutpageElement.Reedvoucher reedemVoucher = PageFactory.initElements(driver ,CheckoutpageElement.Reedvoucher.class);
	CheckoutpageElement.facebook Facebook = PageFactory.initElements(driver , CheckoutpageElement.facebook.class);
	
	public class Userdetails 
	{
		public void verifythatallelementsarepresent()
		{
	           userdetails.signin.isDisplayed();
	           userdetails.guest.isDisplayed();
	           userdetails.googleplus.isDisplayed();
	           userdetails.facebook.isDisplayed();            
		}
		
		public void verifythatallelementsoflandingpageispresent()
		{
			try{
				
				Landingpage.landingpage.isDisplayed();
				Landingpage.totalamount.isDisplayed();
				Landingpage.Backtocart.isDisplayed();
				
			} catch(Exception e)
			{
				System.out.println("all the elements are not present");
			}
			
		}
		
		public void clickonsign()
		{
			try
			{
				userdetails.signin.click();
			} catch(Exception e)
			{
				System.out.println("signin button not present");
			}
			
		}
		
		public void clickonguestsign()
		{
			try
			{
				userdetails.guest.click();
			} catch (Exception e)
			{
				System.out.println("Guest signin button not present ");
			}
		}
		
		public  void clickonfacebook()
		{
			try 
			{
				userdetails.facebook.click();
			} catch (Exception e)
			{
				System.out.println("User not able to click on facebook icon");
			}
		}
		
		public void clickongoogleplus()
		{
			try
			{
				userdetails.googleplus.click();
			}catch (Exception e)
			{
				System.out.println("user not able to click on googleplus icon");
			}
		}
		
		public void backtocart()
		{
			try
			{
				if (Landingpage.Backtocart.isDisplayed())
				{
					Landingpage.Backtocart.click();
				}
			} catch (Exception e)
			{
				System.out.println("user not able to navigate");
			}
		}
	}
	
	public class MemeberLogin
	{
		public void verifythatuserabletologin(String email , String password) throws InterruptedException
		{
			try {
				    if(userdetails.signin.isDisplayed());
				    
			      	memberlogin.email.sendKeys(email);
			    	memberlogin.password.sendKeys(password);
			    	memberlogin.GregBut.isDisplayed();
			    	memberlogin.SigninButton.click();
			    	
				
			} catch(Exception e)
			{
				System.out.println("user not able to login due to login error");
			}
		}
	}
	
	public class GuestLogin
	{
		public void verifythatguestuserabletologin(String guestemail , String guestname ,String guestlastname)
		{
			 try {
				   if(userdetails.guest.isDisplayed());
				   
				   guestlogin.GEmail.sendKeys(guestemail);
				   guestlogin.GFirstName.sendKeys(guestname);
				   guestlogin.GLastName.sendKeys(guestlastname);
				   guestlogin.Gsign.isDisplayed();
				   guestlogin.gsubmit.click();		
				   
			 } catch(Exception e)
			 {
				 System.out.println("not able to register as  Guest");
			 }
		}
	}
	
	public class DeliveryOption
	{
		public void verifythatuserabletoselectdeliveryviaemail()
		{
			try 
			{
			if(deliveryoption.ReceiveEmail.isDisplayed())
			deliveryoption.ReceiveEmail.click();
			waitForElementToBeClickable(deliveryoption.ReceiveEmail , 100);
			
		} catch (Exception e)
			{
			 System.out.println("user not able to deliver via email ");
			}
		}
		public void verifythatuserabletoselectdeliveyviacollectatboxoffice()
		{
			try
			{
		 	if(deliveryoption.CollectBoxoffice.isDisplayed())
		 		deliveryoption.CollectBoxoffice.click();
		 	waitForElementToBeClickable(deliveryoption.CollectBoxOfficeBt , 100);
			} catch (Exception e)
			{
			  System.out.println("user not able deliver via box office");	
			}
				
		}
		
		public void verifythatuserabletoselectdeliveryoptionasbypost()
		{
			try
			{
				if (deliveryoption.CollectPost.isDisplayed())
					deliveryoption.CollectPost.click();
				waitForElementToBeClickable(deliveryoption.CollectPostBt, 100);
			} catch (Exception e)
			{
				System.out.println("user not able to select ");
			}
		}
	}
	
  public class PaymentOption
  {
	  public void verifyifpayemntsectionispresent()
		{
			try 
			{
				Paymentoption.paymentopt.isDisplayed();
				Paymentoption.Cardname.isDisplayed();
				Paymentoption.cardNumber.isDisplayed();
				Paymentoption.expirydate.isDisplayed();
				Paymentoption.securecode.isDisplayed();
				Paymentoption.paymentbt.isDisplayed();
			} catch (Exception e)
			{
				System.out.println("payement section is not in right format");
			}
		}
		
		public void enterCardname (String cardname)
		{
			try {
				
				/*Paymentoption.Cardname.click();
				 Thread.sleep(100);*/
				javaClick(Paymentoption.Cardname);
				((JavascriptExecutor) driver).executeScript( "arguments[0].scrollIntoView();", Paymentoption.Cardname);
	           // ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+Paymentoption.Cardname.getLocation().x+")");
	           
				Paymentoption.Cardname.sendKeys(cardname);
			
			} 
			catch(Exception e)
			{
				System.out.println("Card name not entered properly");
			}
			
		}
		
		
	public class VoucherReedm 
	{
		public void verifythatuserabletoentergiftvoucher(String code)
		{
			reedemVoucher.giftbutton.click();
			reedemVoucher.redeemcode.sendKeys(code);
			reedemVoucher.giftsubmit.click();
		}
		
		public void verifytheamountthatisbeingdeducted()
		{
			
		 System.out.println( "amount that is being reedem" + reedemVoucher.amountredeem.getText());	 
		 System.out.println("final amount to be paid" + reedemVoucher.restamount.getText());
		 
		}
	}

	
	

		
		
  }
  }

