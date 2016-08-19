package com.SydenyOpera.page.functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.SydenyOpera.page.elements.Cartpageelement;

public class Cartpagewithoutsessionfunctions extends Cartpageelement {

	public class Donation 
	{
		
		public void verifyifdonationboxispresent()
		{
		   cartpageElement.DonationBox.isDisplayed();	
		}
		
		public void verifyifuserabletoadddonation()
		{
			cartpageElement.DonationBoxATC.click();
			
		}
	}



	public Cartpagewithoutsessionfunctions(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public Cartpagewithoutsessionfunctions.cart Cart = new cart() ;
	public Cartpagewithoutsessionfunctions.Donation donation = new Donation();
	Cartpageelement cartpageElement = PageFactory.initElements(driver,Cartpageelement.class);
	
			
	
	public class cart {
	public void verifycartheading()
	{
		try 
		{
			cartpageElement.CartHeading.isDisplayed();
		} catch(Exception e)
		{
			System.out.println("user is in  check out page");
		}
	}
	
	public void verifycartdetails()
	{
		try 
		{
			 cartpageElement.CartHeading.isDisplayed();
			 cartpageElement.Itemname.isDisplayed();
			 cartpageElement.EditButton.isDisplayed();
			 cartpageElement.DeleteButton.isDisplayed();
			 cartpageElement.checkOut.isDisplayed();
			
		} catch (Exception e)
		{
			System.out.println("Some elements are not present");
		}
	}
	
	public void clickoncheckoutbutton()
	{
		try
		{
			 javaClick(cartpageElement.checkOut) ;
		} catch (Exception e)
		{
			System.out.println("click action not present");
		}
		
	}
	
	public void continuepopup()
	{
		try 
		{
			cartpageElement.EditButton.click();
			
			Thread.sleep(100);
			
			cartpageElement.continueBut.click();
		} catch (Exception e)
		{
			System.out.println("click on continue button  not implemented");
		}
	}
	
	public void backtocart()
	{
		try
		{
			cartpageElement.EditButton.click();
			Thread.sleep(100);
			cartpageElement.backtocart.click();
		} catch (Exception e)
		{
			System.out.println("click on back to cart button not implemented");
		}
	}
	
	public void deleteitem()
	{
		try
		{
			cartpageElement.DeleteButton.click();
			
		} catch (Exception e)
		{
			System.out.println("Delete action could not be implemented ");
		}
	}
	
	public void verifyifcartisempty()
	{

		try 
		{
			if ( !cartpageElement.Itemname.isDisplayed())
			{
				
			}

	  } 
		catch (Exception e)
		{
		  System.out.println("element is still present");
		}
	
	
}

	
	} 
	}
