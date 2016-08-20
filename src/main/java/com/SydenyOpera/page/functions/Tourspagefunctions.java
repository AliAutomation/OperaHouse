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

	public Tourspagefunctions.dateandtime DateandTime = new dateandtime();
	public Tourspagefunctions.selectseat Selectseat = new selectseat();
	public Tourspagefunctions.addtocart Addtocart = new addtocart();
	public Tourspagefunctions.toursPage Tourspage = new toursPage();
	public Tourspagefunctions.Tourpage Tourspages = new Tourpage() ;
	
	TourspageElement.calenderMonth month = PageFactory.initElements(driver, TourspageElement.calenderMonth.class);
	TourspageElement.date Date = PageFactory.initElements(driver, TourspageElement.date.class);
	TourspageElement.time Time = PageFactory.initElements(driver, TourspageElement.time.class);
	TourspageElement.tours Tours = PageFactory.initElements(driver, TourspageElement.tours.class);
	TourspageElement.toursoption Toursoption = PageFactory.initElements(driver, TourspageElement.toursoption.class);

	
	public class Tourpage {
		
		public void verifyifallelementsarepresent()
		{
			try 
			{
				month.toursheading.isDisplayed();
				//waitForElementToBeVisible(month.calender , 100 ) ;
				
			} catch (Exception e)
			{
				System.out.println("Main components are not present");
			}
		
		}	
		
	}
	
	public class dateandtime {
		
	public void verifythatuserabletoselectdate(String Month, String date) throws InterruptedException {

		
		String mName = month.monthname.getText();
		if (mName.equals(Month)) {
		
			List<WebElement> dates = Date.alldates;

			for (WebElement Selectdate : dates) {
				String Dates=Selectdate.getText() ;	
				if (Dates.equalsIgnoreCase(date)) 
				{
					Selectdate.click();
					System.err.println(Dates);
					 Thread.sleep(100);
					String timeprice = Time.Firsttime.getText();
					javaClick(Time.Firsttime);
					System.out.println(timeprice);
				}
			}

		}
	else
		{
			System.out.println("the month is not that great");
			
		}

	}
	}
	
		public class selectseat {

			public void verifythatuserabletoselectatickit() {
				try {
					if (Toursoption.adultadd.isDisplayed())
						Toursoption.adultadd.click();
					else if (Toursoption.childadd.isDisplayed()) {
						Toursoption.childadd.click();
					}
				} catch (Exception e) {
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

	
	
	


