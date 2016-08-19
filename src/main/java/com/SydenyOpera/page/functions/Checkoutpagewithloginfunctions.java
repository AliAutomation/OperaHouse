package com.SydenyOpera.page.functions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.SydenyOpera.page.elements.CheckoutpagewithLogin;

public class Checkoutpagewithloginfunctions extends CheckoutpagewithLogin 
{

	public Checkoutpagewithloginfunctions(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public Checkoutpagewithloginfunctions.ordersectionf  odersection  = new ordersectionf();
	public Checkoutpagewithloginfunctions.yourdetails yourdetails = new yourdetails();
	public Checkoutpagewithloginfunctions.paymentdetails Paymentdetails = new paymentdetails();
	
	CheckoutpagewithLogin.ordersection Ordersection =PageFactory.initElements(driver, CheckoutpagewithLogin.ordersection.class);
	CheckoutpagewithLogin.yourdetails  yourdetail =PageFactory.initElements(driver,CheckoutpagewithLogin.yourdetails.class) ;
	CheckoutpagewithLogin.paymentdetails payementdetail = PageFactory.initElements(driver,CheckoutpagewithLogin.paymentdetails.class);
	
	public class ordersectionf{
	
	public void verifyifordersectionispresent()
	{
		try
		{
		   Ordersection.orderdection.isDisplayed();
		   Ordersection.backtocartlink.isDisplayed();
		   Ordersection.ammountdue.isDisplayed();
		} catch (Exception e)
		{
			System.out.println("Oder section is not present");
		}
	}
	public void verifyifuserbacktocartpage()
	{
		try
		{
			if(Ordersection.backtocartlink.isDisplayed())
			{
				Ordersection.backtocartlink.click();
			}
		}catch (Exception e)
		{
			System.out.println("user not able to navigate to back to cart");
		}
	}
	}
	
	public class yourdetails
	{
	public void verifyifyourdetailsectionispresent()
	{
		try
		{
			yourdetail.yourdetails.isDisplayed();
			yourdetail.emailid.isDisplayed();
			yourdetail.username.isDisplayed();
		} catch (Exception e)
		{
			System.out.println("user details section is not present ");
		}
	}
	}	
	public class paymentdetails
	{
	public void verifyifpayemntsectionispresent()
	{
		try 
		{
			payementdetail.payementsection.isDisplayed();
			payementdetail.Cardname.isDisplayed();
			payementdetail.cardNumber.isDisplayed();
			payementdetail.expirydate.isDisplayed();
			payementdetail.securecode.isDisplayed();
			payementdetail.paymentbt.isDisplayed();
		} catch (Exception e)
		{
			System.out.println("payement section is not in right format");
		}
	}
	
	public void enterCardname (String cardname)
	{
		try {
			
			 JavascriptExecutor jse = (JavascriptExecutor)driver;
			    jse.executeScript("scroll(0, 500);");
			payementdetail.Cardname.sendKeys(cardname);
		} catch(Exception e)
		{
			System.out.println("Card name not entered properly");
		}
		
	}
	
	public void enterCardnumber(String cardnumber)
	{
		try {
			 payementdetail.cardNumber.sendKeys(cardnumber);
		} catch (Exception e)
		{
			System.out.println("Card number is not entered");
		}
	}
	
	public void enterexpirerydate(String expirydate)
	{
		try{
			payementdetail.expirydate.sendKeys(expirydate);
		} catch (Exception e)
		{
			System.out.println("expiry date is not entered ");
		}
	}
	
	public void entersecurecode (String securecode )
	{
		try {
			 payementdetail.securecode.sendKeys( securecode);
		} catch (Exception e)
		{
			System.out.println("secure code is not entered properly");
		}
	}
	
	
	public void  clickoncheckbox()
	{
		try
		{
			javaClick(payementdetail.checkbox);
		} catch (Exception e)
		{
			System.out.println("click on checkout box");
		}
	}
	
	public void clickonpaymentbutton()
	{
		try {
			payementdetail.paymentbt.click();
		} catch( Exception e)
		{
			System.out.println("Payement button not clicked ");
		}
	}
	}	
	
}
