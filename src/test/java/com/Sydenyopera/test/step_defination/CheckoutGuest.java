package com.Sydenyopera.test.step_defination;

import com.SydenyOpera.core.Initialize;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author aasgh2
 *  This is  step defination file  for  Checkout guest.feature  
 *  Checkoutpagewithoutlogin  = cpwlf ( it is initialized in Initialize class in core package 
 *  
 */
public class CheckoutGuest extends Initialize 
{
	@Given("^user is at  Checkout page$")
	public void user_is_at_Checkout_page() 
	{
	    cpwlf.userdetail.verifythatallelementsarepresent();
	    
	}

	@When("^user click on Sign-in button$")
	public void user_click_on_Sign_in_button() 
	{
	    cpwlf.userdetail.clickonsign();
	    
	}

	@Then("^user enter  username \"(.*?)\" and enter password \"(.*?)\" and click on signin button$")
	public void user_enter_username_and_enter_password_and_click_on_signin_button(String email, String password) throws InterruptedException 
	{
	 cpwlf.memberLogin.verifythatuserabletologin(email, password);
	}

	@Then("^then user come to payement  section$")
	public void then_user_come_to_payement_section() throws Throwable 
	{
	  cpwlf.paymentOption.verifyifpayemntsectionispresent();   
	}

	@Given("^user enter cardholder name in Card holder section \"(.*?)\"$")
	public void user_enter_cardholder_name_in_Card_holder_section(String cardname) 
	{
		 cpwlf.paymentOption.enterCardname(cardname);
		 //cplf.Paymentdetails.enterCardname(cardname);
	}

	@Given("^user enter cardnumber in cardnumber section \"(.*?)\"$")
	public void user_enter_cardnumber_in_cardnumber_section(String cardnumber) 
	{
	   
		 cplf.Paymentdetails.enterCardnumber(cardnumber);
	}

	@Given("^user enter expirydate in expirydate section \"(.*?)\"$")
	public void user_enter_expirydate_in_expirydate_section(String expirydate)
	{
		 cplf.Paymentdetails.enterexpirerydate(expirydate);  
	}

	@Given("^user enter security code in cvv section \"(.*?)\"$")
	public void user_enter_security_code_in_cvv_section(String securecode) 
	{
		cplf.Paymentdetails.entersecurecode(securecode);
		cplf.Paymentdetails.clickoncheckbox();
	}

	@Then("^user click on payment button$")
	public void user_click_on_payment_button() 
	{
		 cplf.Paymentdetails.clickonpaymentbutton();
	}

	@Then("^user navigate to order confirmation page$")
	public void user_navigate_to_order_confirmation_page() 
	{
		ocpf.OrderConfirm.verifythatordernumberisdisplayed();
		ocpf.OrderConfirm.verifythatorderconfirmationispresent();
	}
	
	
	@When("^user click on  continue as a Guest$")
	public void user_click_on_continue_as_a_Guest() 
	{
	  cpwlf.userdetail.clickonguestsign();
	}

	@Given("^user enter emailaddress\"(.*?)\" and user enter firstname\"(.*?)\" and Lastname \"(.*?)\" and click on signinbutton$")
	public void user_enter_emailaddress_and_user_enter_firstname_and_Lastname_and_click_on_signinbutton(String guestemail, String guestname, String guestlastname) 
	{
	    // Write code here that turns the phrase above into concrete actions
	 
       cpwlf.guestLogin.verifythatguestuserabletologin(guestemail, guestname, guestlastname);
       
	}

	@Given("^user click on Gplus signin user enter gmailadress\"(.*?)\" and enter googlepassword \"(.*?)\"$")
	public void user_click_on_Gplus_signin_user_enter_gmailadress_and_enter_googlepassword(String Gmail, String Gmailpassword) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		cpwlf.googleplus.googlelogin(Gmail, Gmailpassword);
	    
	}
	

	@Given("^user enter facebookID\"(.*?)\" , enter password\"(.*?)\" and click on signin button$")
	public void user_enter_facebookID_enter_password_and_click_on_signin_button(String FacebookID, String password) throws InterruptedException 
	{
	    cpwlf.facebook.facebooklogin(FacebookID, password);
	}

	
	
	@Then("^user navigate to landing page and click on back to cart$")
	public void user_navigate_to_landing_page_and_click_on_back_to_cart() 
	{
	   cpwlf.userdetail.verifythatallelementsoflandingpageispresent();
	   cpwlf.userdetail.backtocart();
	  
	}

	@Then("^user navigate to cart page$")
	public void user_navigate_to_cart_page()  
	{
	  cpwsf.Cart.verifycartdetails();
	}
	
	@When("^user click on add voucher$")
	public void user_click_on_add_voucher() throws Throwable {
	   cpwlf.voucherreedm.verifyuserabletoclickonvocher();
	}

	@Given("^User enter giftvouchercode\"(.*?)\" and press submit button$")
	public void user_enter_giftvouchercode_and_press_submit_button(String GiftVoucher) throws Throwable {
	  cpwlf.voucherreedm.verifythatuserabletoentergiftvoucher(GiftVoucher);
	   
	}

	@Then("^due amount should be remaing of giftvoucher$")
	public void due_amount_should_be_remaing_of_giftvoucher() throws Throwable
	{
		
	   cpwlf.voucherreedm.verifytheamountthatisbeingdeducted();
	}


	

}
