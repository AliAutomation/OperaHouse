package com.SydenyOpera.page.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SydenyOpera.core.Actiondriver;

public class OrderconfirmationPageElement extends Actiondriver {

	public OrderconfirmationPageElement(WebDriver driver)
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public static class orderpage

	{
		@FindBy(xpath=".//*[@class='card'] ")
		public WebElement cardpage;
		
		@FindBy(xpath=".//*[@class='container order-confirmation']/h1")
		public WebElement  Confirmationmessage ;
		
		@FindBy(xpath=".//*[@class='card']/h2")
		public WebElement ordernumber;
		
	}
}
