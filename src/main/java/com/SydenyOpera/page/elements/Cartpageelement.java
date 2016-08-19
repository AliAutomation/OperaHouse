package com.SydenyOpera.page.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.SydenyOpera.core.Actiondriver;

/**
 * @author aasgh2
 * This class contain all the locators of Cart page 
 * 
 */
public class Cartpageelement extends Actiondriver {

	public Cartpageelement(WebDriver driver) 
	{
		super(driver);
	
		// TODO Auto-generated constructor stub
	}
 
	@FindBy(xpath="//*[@id='sessionTimer']")
	public WebElement sessionTimer ;
	
	@FindBy(xpath="//*[@id='pageCart']/div/div/h1")
	public WebElement  CartHeading ;
	
	@FindBy(xpath="(//*[@class='soh-box-header'])[1]")
	public WebElement Itemname ;
	
	@FindBy(xpath="(//*[@class='actions']/a)[1]")
	public WebElement EditButton ;
	
	@FindBy(xpath="(.//*[@class='space']/button)[1]")
	public WebElement continueBut ;
	
	@FindBy(xpath= "(.//*[@class='space']/button)[2]")
	public WebElement backtocart ;
	
	@FindBy(xpath="(//*[@class='actions']/a)[2]")
	public WebElement  DeleteButton ;
	
	@FindBy(xpath="//*[@class='soh-box-cart-add-content']")
	public WebElement DonationBox ;
	
	@FindBy(xpath="//.[@class='action action-add-to-cart add-to-cart']") 
	public WebElement DonationBoxATC ;
	
	@FindBy(xpath="//*[@class='insurance-sec']")
	public WebElement InsuranceBox ;
	
	@FindBy(xpath="(//*[@class='soh-form-checkbox insurance-radio'])[1]")
	public WebElement InsuranceBoxNo ;
	
	@FindBy(xpath="(//*[@class='soh-form-checkbox insurance-radio'])[2]")
	public WebElement InsuranceBoxYes ;
	
	@FindBy(xpath="//*[@id='toCheckout']")
	public WebElement checkOut ;
	
}
