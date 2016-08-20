package com.Sydenyopera.test.step_defination;

import org.openqa.selenium.JavascriptExecutor;

import com.SydenyOpera.core.Initialize;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



/**
 * @author aasgh2
 *
 */
public class Tours extends Initialize 
{
	@Given("^user is at tour calender page$")
	public void user_is_at_tour_calender_page()
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 500);");
		Tpf.Tourspages.verifyifallelementsarepresent();
	    
	}

	@Then("^user Select a  month \"(.*?)\" and  date \"(.*?)\"$")
	public void user_Select_a_month_and_date(String Month, String date) throws InterruptedException 
	{
	   Tpf.DateandTime.verifythatuserabletoselectdate(Month, date);
	}

	@Then("^user navigate to tours-and-experiences page$") 
	public void user_navigate_to_tours_and_experiences_page()  
	{
	   Tpf.Tourspage.verifythataddfieldsarepresent();
	  // throw new PendingException();
	}

	@Then("^user select tickets from tours list$")
	public void user_select_tickets_from_tours_list() 
	{
		 Tpf.Selectseat.verifythatuserabletoselectatickit();
		//throw new PendingException();
	}

	@Then("^user click on add to cart$")
	public void user_click_on_add_to_cart() 
	{
	    
	  Tpf.Addtocart.verifythatuserableaddticketstocart();
	 // throw new PendingException();
	}


}
