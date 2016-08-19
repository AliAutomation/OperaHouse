package com.SydenyOpera.page.elements;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.SydenyOpera.header.SydenyOperaHeaderFunctions;

public class LoginPageelement extends SydenyOperaHeaderFunctions {

	public LoginPageelement (WebDriver driver)
	{
		super(driver);

	}
	public static class Login
	{
		@FindBy(xpath=".//*[@id='username']")
		public WebElement email ;

	   @FindBy(xpath=".//*[@id='pwd']")
		public WebElement password ;
	   
		@FindBy(xpath=".//*[@id='canvas-']/div/div/div/div[1]/div/div/div/div/div/div/div/div/form/button")
		public WebElement SigninButton ;
		
		@FindBy(xpath="//*[@class='icon-facebook']")
		public WebElement facebook;
		
		@FindBy(xpath=".//*[@id='btnGooglePlusSignIn']/a")
		public WebElement googleplus;
		
	}
}



