package com.Sydenyopera.test.step_defination;

import com.SydenyOpera.core.Initialize;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class userlogin extends Initialize 
{
	
	
	@Given("^i navigate to UAT Homepage$")
	public void i_navigate_to_UAT_Homepage() 
	{
	  lpf.login.verifythatallloginfieldarepresent();
	   
	}

	@Given("^i enter loginId \"(.*?)\" and password \"(.*?)\"$")
	public void i_enter_loginId_and_password(String loginID, String password)
	{
	   lpf.login.verifythatuserabletologin(loginID, password) ;
	}

	@When("^i click on signin button$")
	public void i_click_on_signin_button() 
	{
	   
	    lpf.login.performclickaction();
	}

	@Then("^user navigate to cartpage$")
	public void user_navigate_to_cartpage()  
	{
		Gvf.Giftvoucher.verifyuserisatgiftcartpage();
	    
	}

}
