package com.SydenyOpera.page.functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.SydenyOpera.page.elements.OrderconfirmationPageElement;

public class OrderconfirmationPagefunctions extends OrderconfirmationPageElement {

	public OrderconfirmationPagefunctions(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public OrderconfirmationPagefunctions.orderConfirm OrderConfirm = new orderConfirm();
	OrderconfirmationPageElement.orderpage Orderpage = PageFactory.initElements(driver,
			OrderconfirmationPageElement.orderpage.class);

	public class orderConfirm {
		public void verifythatorderconfirmationispresent() {
			try {

				Orderpage.cardpage.isDisplayed();
				Orderpage.Confirmationmessage.isDisplayed();
				Orderpage.ordernumber.isDisplayed();
			} catch (Exception e) {
				System.out.println("Order confrimation page is not displaying");
			}
		}

		public void verifythatordernumberisdisplayed() {
			try {
				if (Orderpage.ordernumber.isDisplayed()) {
					System.err.println("order number = " + Orderpage.ordernumber.getText());
				}

			} catch (Exception e) {
				System.err.println("Order confirmation number is not present");
			}
		}
	}
}
