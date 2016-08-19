package com.SydenyOpera.page.elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SydenyOpera.core.Actiondriver;

public class TourspageElement extends Actiondriver {

	public TourspageElement(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static class calenderMonth 
	{
		@FindBy(xpath = "(//*[@class='month-nav']/button)[1]")
		public WebElement backbutton;

		@FindBy(xpath = "(//*[@class='month-nav']/button)[2]")
		public WebElement forwardButton;

		@FindBy(xpath = ".//*[@class='month-name']")
		public WebElement monthname;
		
		
		@FindBy(xpath=".//*[@id='soh-page']/div/main/header/div[2]/div/h1/span")
		public WebElement toursheading;
		
		@FindBy(xpath=".//*[@id='soh-page']/div/main/div")
		public WebElement calender;

	}

	public static class date {
		@FindBy(xpath = ".//*[@class='wrap-days']/div/div")
		public List<WebElement> alldates;

	}

	public static class time {
		@FindBy(xpath = ".//*[@class='performance']/span)[1]")
		public WebElement Firsttime;

		@FindBy(xpath = ".//*[@class='btn btn-marker btn-marker-left']")
		public WebElement leftsection;

		@FindBy(xpath = ".//*[@class='btn-marker btn-marker-right']")
		public WebElement rightsection;
	}

	public static class tours {
		@FindBy(xpath = ".//*[@class='btn btn-secondary btn-add']")
		public WebElement addpromo;

		@FindBy(xpath = ".//*[@class='event-title']")
		public WebElement tourtitile;

		@FindBy(xpath = ".//*[@class='btn btn-show-filter']")
		public WebElement showfilter;

		@FindBy(xpath = ".//*[@class='btn btn-calendar']")
		public WebElement showcalendar;

		@FindBy(xpath = ".//*[@id='zone66121']")
		public WebElement touroptions;

		@FindBy(xpath=".//*[@class='promo-code']/input")
		public WebElement promotext ;
		
		@FindBy(xpath=".//*[@class='btn btn-secondary']")
		public WebElement promosubmit ;
		
	}
	
	public static class toursoption
	{
		@FindBy(xpath="(.//*[@class='btn btn-more'])[1]")
		public WebElement adultadd;
		
		@FindBy(xpath="(.//*[@class='btn btn-less'])[1]")
		public WebElement adultdec;
		
		@FindBy(xpath="(//*[@class='btn btn-more'])[6]")
		public WebElement childadd;
		
		@FindBy(xpath="(//*[@class='btn btn-less'])[6]")
		public WebElement childdec;
		
		@FindBy(xpath="(.//*[@class='btn btn-primary'])[1]")
		public WebElement addtocart;
		
		@FindBy(xpath=".//*[@class='soh-accordion-toggle']")
		public WebElement pricedetails ;
		
		
		
	}
}
