package com.SydenyOpera.page.functions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.SydenyOpera.page.elements.GiftvoucherPageElement;

public class Giftvoucherpagefunctions extends GiftvoucherPageElement
{

	public Giftvoucherpagefunctions(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public Giftvoucherpagefunctions.Giftvoucherf  Giftvoucher = new Giftvoucherf();
	public Giftvoucherpagefunctions.Giftingto giftingto = new Giftingto();
	public Giftvoucherpagefunctions.Deliveryf delivery = new Deliveryf();
	public Giftvoucherpagefunctions.checkout Checkout = new checkout();
	
	GiftvoucherPageElement.GiftVoucher giftvouchers = PageFactory.initElements(driver,GiftvoucherPageElement.GiftVoucher.class);
    GiftvoucherPageElement.Giftingto giftingtos = PageFactory.initElements(driver,GiftvoucherPageElement.Giftingto.class);
	GiftvoucherPageElement.checkout checkouts = PageFactory.initElements(driver ,GiftvoucherPageElement.checkout.class );
	GiftvoucherPageElement.Delivery Deliver =PageFactory.initElements(driver ,GiftvoucherPageElement.Delivery.class);
	
	public class Giftvoucherf
	{
	
	public void verifyuserisatgiftcartpage()
	{
		try {
			
			giftvouchers.Giftvoucherconatiner.isDisplayed() ;
		}catch (Exception e)
		{
			System.out.println("user is not at giftvoucher page");
		}
			   
	}
		
	public void verifyifgiftamountisselected()
	{ 
		try
	  {
		if(giftvouchers.Giftvoucherconatiner.isDisplayed())
		{
			giftvouchers.addmoney.click();
		}
	}catch(Exception e)
	{
		System.out.println("user not able to select Gift Amount");
	}
	
}
	}
	
	public class Giftingto
	{
	public void verifyifuserabletoentermessage(String SenderName , String receivername , String Message )
	{
		try
		{
			if(giftingtos.Giftingtoconatiner.isDisplayed())

		{
			giftingtos.giftsendername.sendKeys(SenderName);
			Thread.sleep(100);
			giftingtos.giftreceivername.sendKeys(receivername);
			Thread.sleep(100);
			giftingtos.giftmessage.sendKeys(Message);
		}
		} catch (Exception e)
		{
			System.out.println("user not able to  enter message  ");
		}
	}

	}
	
	public class Deliveryf 
	{
	public void verifyifuserabletogiftvoucheremailtorecepit (String enteremailid)
	{
		try
		{
			if(Deliver.Deliveryconatiner.isDisplayed())
			{
				((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+Deliver.emailtorecepit.getLocation().x+")");
				javaClick(Deliver.emailtorecepit );
				Thread.sleep(100);
				Deliver.enteremailadd.sendKeys(enteremailid );
				
			}
		} catch (Exception e)
		{
			System.out.println("user not able to  send email to recepit ");
		}
	}
	
	public void verifyifuserabletoGiftvoucheremailtome ()
	{
		try {
			if(Deliver.Deliveryconatiner.isDisplayed())
			{
				((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+Deliver.emailtome.getLocation().x+")");
				
			      javaClick(Deliver.emailtome);
			}
		} catch (Exception e)
		{
			System.out.println("user not able to  send email to me");
		}
	}
	public void verifyifuserabletocollectatboxoffice()
	{
		try 
		{
			if(Deliver.Deliveryconatiner.isDisplayed())
			{
				Deliver.collectatboxoffice.click();
			}
		} catch (Exception e)
		{
			System.out.println("user not able to select collect at box office  ");
		}
	}
	
	}
	public class checkout{
	public void verifyifuserabletoclickonaddtocart()
	{
		try 
		{
			if(checkouts.checkoutbut.isDisplayed())
			{
			  checkouts.checkoutbut.click();
			}
		} catch( Exception e)
		{
			System.out.println("user not able to click on checkout button");
		}
	}
	}
}
