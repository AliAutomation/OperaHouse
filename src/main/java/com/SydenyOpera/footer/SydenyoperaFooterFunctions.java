package com.SydenyOpera.footer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SydenyoperaFooterFunctions extends SydenyoperaFooterElements
{

	public SydenyoperaFooterFunctions(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
    
	public SydenyoperaFooterFunctions.SOHfooter SohFooter  = new SOHfooter();
	SydenyoperaFooterElements.footer Footer = PageFactory.initElements(driver,SydenyoperaFooterElements.footer.class);
	

	public class SOHfooter 
	{
   public void verifyfootersectionispresent()
   {
	   try{
		    Footer.footersection.isDisplayed();
		    
	   } catch (Exception e)
	   {
		   System.out.print("footersection is absent");
	   }
   }
   
   public void verifysocialmediasectionispresent()
   {
	   try {
		    Footer.Socialmedia.isDisplayed();
	   }catch (Exception e)
	   {
		   System.out.println("socialMedia section is not present");
	   }
   }
	
   public void verifySydenyoperahousesectionispresent()
   {
	   try {
            Footer.operarightNaviagation.isDisplayed();
	   }catch (Exception e)
	   {
		   System.out.println("Sydeny opera House navigation section is not present");
	   }
   }
	
   public void verifygiftvoucherispresent()
   {
	   try {
		   
		  Footer. giftvoucher.isDisplayed();
	   }catch (Exception e)
	   {
		   System.out.println(" gift voucher section is not present");
	   }
   }
   public void verifythingstodoispresent()
   {
	   try {
		    Footer.thingstodo.isDisplayed();
	   }
	   catch (Exception e)
	   {
		   System.out.println("thingstodo section is not present");
	   }
   }
   public void verifytoursispresent()
   {
	   try {
		 Footer.tours .isDisplayed();
	   }
	   catch (Exception e)
	   {
		   System.out.println("tours section is not present");
	   }
   }
   public void verifygroupbookingispresent()
   {
	   try {
		  Footer.Groupbooking.isDisplayed();
	   }
	   catch (Exception e)
	   {
		   System.out.println("Groupbooking section is not present");
	   }
   }
   public void verifyvisitorinfoispresent()
   {
	   try
	   {
		    Footer. VisitorInfo.isDisplayed();
		    
	   }
	   catch (Exception e)
	   {
		   System.out.println("Visitor info section is not present");
	   }
   }
   public void verifycontactusispresent()
   {
	   try 
	   {
		  Footer. contactus.isDisplayed();
	   }
	   catch (Exception e)
	   {
		   System.out.println("contact us section is not present");
	   }
   }
   public void verifycopyrightispresent()
   {
	   try 
	   {
		  Footer. copyright.isDisplayed();
	   }
	   catch (Exception e)
	   {
		   System.out.println("copyright section is not present");
	   }
   }
   
   public void clickongiftvoucher()
   {
	   try 
	   {
		   Footer.giftvoucher.click();
		   
	   }
	   catch (Exception e)
	   {
		   System.out.println("not able to click on gift voucher ");
	   }
   }
   public void clickontours()
   {
	   try 
	   {
		   Footer.tours.click();
	   } catch (Exception e)
	   {
		   System.out.println("not able to select on tours");
	   }
   }
   public void clickongroupbooking()
   {
	   try 
	   {
		  Footer. Groupbooking.click();
	   } catch (Exception e)
	   {
		   System.out.println("not able to select group booking ");
	   }
   }
   
}
}
