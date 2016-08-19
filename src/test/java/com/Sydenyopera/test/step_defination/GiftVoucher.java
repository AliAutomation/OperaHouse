package com.Sydenyopera.test.step_defination;

import com.SydenyOpera.core.Initialize;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GiftVoucher extends Initialize {

	@Given("^user is at giftvoucher page$")
	public void user_is_at_giftvoucher_page() {
		Gvf.Giftvoucher.verifyuserisatgiftcartpage();

	}

	// Gift voucher page functions //
	@When("^User select a giftvoucher price$")
	public void user_select_a_giftvoucher_price() {
		Gvf.Giftvoucher.verifyifgiftamountisselected();
	}

	@Given("^User enter toname \"(.*?)\" and enter fromename \"(.*?)\" and provive message \"(.*?)\"$")
	public void user_enter_toname_and_enter_fromename_and_provive_message(String SenderName, String receivername,
			String Message) {

		Gvf.giftingto.verifyifuserabletoentermessage(SenderName, receivername, Message);

	}

	@Then("^select send via email as delivery option$")
	public void select_send_via_email_as_delivery_option() {
		Gvf.delivery.verifyifuserabletoGiftvoucheremailtome();
	}

	@Then("^click on addrocart button$")
	public void click_on_addrocart_button() {
		Gvf.Checkout.verifyifuserabletoclickonaddtocart();

	}

	@Then("^click on continuetocheckout$")
	public void click_on_continuetocheckout() {
		cpwsf.Cart.clickoncheckoutbutton();
	}

	@Given("^user enter  card name \"(.*?)\"$")
	public void user_enter_card_name(String cardname) {
		cplf.Paymentdetails.enterCardname(cardname);
	}

	@Given("^user enter card number \"(.*?)\"$")
	public void user_enter_card_number(String cardnumber) {
		cplf.Paymentdetails.enterCardnumber(cardnumber);
	}

	@Given("^user enter expiry date  \"(.*?)\"$")
	public void user_enter_expiry_date(String expirydate) {
		cplf.Paymentdetails.enterexpirerydate(expirydate);
	}

	@Given("^user enter cvv \"(.*?)\"$")
	public void user_enter_cvv(String securecode) {
		cplf.Paymentdetails.entersecurecode(securecode);
	}

	@Then("^user click on check box$")
	public void user_click_on_check_box() {
		cplf.Paymentdetails.clickoncheckbox();
	}

	@Then("^user click on placeorder$")
	public void user_click_on_placeorder() {

		cplf.Paymentdetails.clickonpaymentbutton();
	}

	@Given("^user is at cart page$")
	public void user_is_at_cart_page() {

	}

	@Then("^select collect at box office  as delievry option$")
	public void select_collect_at_box_office_as_delievry_option() {

		Gvf.delivery.verifyifuserabletocollectatboxoffice();
	}

	@Then("^user enter email address of sender\"(.*?)\"$")
	public void user_enter_email_address_of_sender(String enteremailid) {
		Gvf.delivery.verifyifuserabletogiftvoucheremailtorecepit(enteremailid);
	}

	@When("^user click on edit button and choose to press continue$")
	public void user_click_on_edit_button_and_choose_to_press_continue() {
		cpwsf.Cart.continuepopup();

	}

	@When("^user click on edit button and choose to backtocart option$")
	public void user_click_on_edit_button_and_choose_to_backtocart_option() {
		cpwsf.Cart.backtocart();
	}

	@When("^user click on delete button$")
	public void user_click_on_delete_button() {
		cpwsf.Cart.deleteitem();
	}

	@Then("^cart gone empty$")
	public void cart_gone_empty() throws Throwable {
		cpwsf.Cart.verifyifcartisempty();
	}

	/*
	 * @When("^user navigate giftcart  page$") public void
	 * user_navigate_giftcart_page() {
	 * 
	 * Gvf.Giftvoucher.verifyuserisatgiftcartpage(); }
	 */

	@Then("^User navigate to cart page$")
	public void user_navigate_to_cart_page() throws Throwable {
		cpwsf.Cart.verifycartheading();

	}

	@Then("^user navigate to orderconfirmation page$")
	public void user_navigate_to_orderconfirmation_page() throws Throwable {
		ocpf.OrderConfirm.verifythatordernumberisdisplayed();

	}

	@Then("^user add   donation to cart$")
	public void user_add_add_donation_to_cart() throws InterruptedException {
		cpwsf.donation.verifyifuserabletoadddonation();

	}

	@Then("^Again user navigate to cart page$")
	public void again_user_navigate_to_cart_page() throws Throwable {
		cpwsf.Cart.verifycartdetails();
		cpwsf.Cart.clickoncheckoutbutton();
	}

	/*
	 * @When("^user navigate giftcart  page$") public void
	 * user_navigate_giftcart_page() throws Throwable { // Write code here that
	 * turns the phrase above into concrete actions throw new
	 * PendingException(); }
	 */

}
