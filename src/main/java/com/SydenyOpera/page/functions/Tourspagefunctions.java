package com.SydenyOpera.page.functions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.SydenyOpera.page.elements.TourspageElement;

public class Tourspagefunctions extends TourspageElement {

	public Tourspagefunctions(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);

	}

	TourspageElement.calenderMonth month = PageFactory.initElements(driver, TourspageElement.calenderMonth.class);
	TourspageElement.date Date = PageFactory.initElements(driver, TourspageElement.date.class);
	TourspageElement.time Time = PageFactory.initElements(driver, TourspageElement.time.class);
	TourspageElement.tours Tours = PageFactory.initElements(driver, TourspageElement.tours.class);
	TourspageElement.toursoption Toursoption = PageFactory.initElements(driver, TourspageElement.toursoption.class);

	
	public class dateandtime {
		
	public void verifythatuserabletoselectdate(String Month, String date) throws InterruptedException {

		String mName = month.monthname.getText();
		if (mName.equals(Month)) {
			List<WebElement> dates = Date.alldates;

			for (WebElement Daates : dates) {
				String Datess = Daates.getText();

				if (Datess.equals(date)) {
					Daates.click();
					Thread.sleep(100);
					waitForElementToBeVisible(Time.Firsttime, 100);
					javaClick(Time.Firsttime);
				}
			}

		} else
		{
			
			
		}

	}
	}
	
	public class selectseat{
		
	
	 public void verifythatuserabletoselectatickit()
	 {
		 try {
			  if(Toursoption.adultadd.isDisplayed())
			      Toursoption.adultadd.click();
			  else if (Toursoption.childadd.isDisplayed())
			  {
				  Toursoption.childadd.click();
			  }
		 }
		 catch (Exception e)
		 {
			System.out.println("user not able to  select a seat"); 
		 }
	 }
	 
	}
	
	public class addtocart {
		
		public void verifythatuserableaddticketstocart()
		{
			try {
				 if (Toursoption.addtocart.isDisplayed())
					 Toursoption.addtocart.click();
			} catch (Exception e)
			{
				System.out.println("user not able to add cart");
			}
			
		}
	}
	
	
	public  class toursPage {
		
		public void verifythataddfieldsarepresent()
		{
			try {
				  Tours.tourtitile.isDisplayed();
				  Tours.touroptions.isDisplayed();
				  Tours.addpromo.isDisplayed();
				  Tours.showcalendar.isDisplayed();
				  Tours.showfilter.isDisplayed();
			} catch (Exception e)
			{
				System.out.println(" all fileds are present");
			}
		}
		
		public void verifythatuseabletoaddpromocode(String promocode)
		{
			try {
				  if (Tours.addpromo.isDisplayed())
				  {
					  Tours.addpromo.click();
				  }
				  
				  Thread.sleep(100);
				  Tours.promotext.sendKeys(promocode);
				  Thread.sleep(100);
				  Tours.promosubmit.click();
			}
			 catch (Exception e)
			{
				 System.out.println("user not able to enter promo");
			}
		}
	}
	
}
