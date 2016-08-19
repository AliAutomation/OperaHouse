package com.SydenyOpera.page.functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.SydenyOpera.page.elements.LoginPageelement;

public class LoginPageFunctions extends LoginPageelement {

	public LoginPageFunctions(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public LoginPageFunctions.login login = new login();
	LoginPageelement.Login userlogin = PageFactory.initElements(driver, LoginPageelement.Login.class);

	public class login {

		public void verifythatallloginfieldarepresent() {
			try {
				userlogin.email.isDisplayed();
				userlogin.password.isDisplayed();
				userlogin.SigninButton.isDisplayed();
				userlogin.facebook.isDisplayed();
				userlogin.googleplus.isDisplayed();
			} catch (Exception e) {
				System.out.println("All fields are not present");
			}

		}

		public void verifythatuserabletologin(String email, String password) {
			try {
				if (userlogin.email.isDisplayed()) {
					userlogin.email.sendKeys(email);
				}
				if (userlogin.password.isDisplayed())

					userlogin.password.sendKeys(password);

			} catch (Exception e) {
				System.out.println("user not able to login due to error");
			}

		}

		public void performclickaction() {
			userlogin.SigninButton.click();
		}
	}

	// ************need be ***************
	/*
	 * public void windowhandlegoogleplus() { String parentWindowId =
	 * driver.getWindowHandle(); login.googleplus.click();
	 * 
	 * try { driver.switchTo().window("name of header");
	 * 
	 * }
	 */
}
