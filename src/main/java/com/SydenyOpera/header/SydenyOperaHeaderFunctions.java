package com.SydenyOpera.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SydenyOperaHeaderFunctions extends SydenyOperaHeaderElements {

	public SydenyOperaHeaderFunctions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public SydenyOperaHeaderFunctions.topnavigation navigation = new topnavigation();
	public SydenyOperaHeaderFunctions.logo SydenyOperaLogo = new logo();
	public SydenyOperaHeaderFunctions.login Login = new login();

	SydenyOperaHeaderElements.login loGin = PageFactory.initElements(driver, SydenyOperaHeaderElements.login.class);
	SydenyOperaHeaderElements.logo Logo = PageFactory.initElements(driver, SydenyOperaHeaderElements.logo.class);
	SydenyOperaHeaderElements.topnavigation Navigation = PageFactory.initElements(driver,
			SydenyOperaHeaderElements.topnavigation.class);

	public class topnavigation {

		public void verifyifnavigationbarispresent() {
			try {

				Navigation.navigationmenu.isDisplayed();
			} catch (Exception e) {
				System.out.println("navigation bar is present");
			}
		}

		public void Verifyifalltheelementsofnavigationbarispresent() {
			try {
				Navigation.events.isDisplayed();
				Navigation.Tours.isDisplayed();
				Navigation.Visit.isDisplayed();
				Navigation.Searchbar.isDisplayed();
				Navigation.SearchButton.isDisplayed();
				Navigation.presenters.isDisplayed();
			} catch (Exception e) {
				System.out.println("All the Elements of Navigation bar is Present");
			}
		}

		public void verifyifuserabletoentervalueinsearchbar(String value) {
			try {
				if (Navigation.Searchbar.isDisplayed()) {
					Navigation.Searchbar.sendKeys(value);
					Thread.sleep(10);
					if (Navigation.SearchButton.isDisplayed())
						Navigation.SearchButton.click();
				}
			} catch (Exception e) {
				System.out.println("user not able to enter value ");
			}

		}

		public void verifyifuseabletoselectEvent() {
			try {
				if (Navigation.events.isDisplayed()) {
					Navigation.events.click();
				}
			} catch (Exception e) {
				System.out.println("user not able to click on event");
			}

		}

		public void verifyifuserabletoselecttours() {
			try {
				if (Navigation.Tours.isDisplayed()) {
					Navigation.Tours.click();
				}
			} catch (Exception e) {
				System.out.println("user not able to click on tours");
			}
		}

	}

	public class logo {
		public void verifyifsydneyoperalogoispresent() {
			try {
				Logo.operaLogo.isDisplayed();
				Logo.SamsungLogo.isDisplayed();
			} catch (Exception e) {
				System.out.println("Sydeny opera logo is Present ");
			}
		}
	}

	public class login {
		public void verifyifloginbuttonispresent() {
			try {

				loGin.login.isDisplayed();

			} catch (Exception e) {
				System.out.println("Login button is present");
			}
		}

		public void verifyifuserabletoselectlogin() {
			try {
				if (loGin.login.isDisplayed()) {
					loGin.login.click();
				}
			} catch (Exception e) {
				System.out.println("user not able to click on login button");
			}
		}
	}

}
