package com.SydenyOpera.core;

import com.SydenyOpera.page.functions.Checkoutpagewithloginfunctions;
import com.SydenyOpera.page.functions.Checkoutpagewithoutlogin;
import com.SydenyOpera.footer.SydenyoperaFooterFunctions;
import com.SydenyOpera.header.SydenyOperaHeaderFunctions;
import com.SydenyOpera.page.functions.Cartpagewithoutsessionfunctions;
import com.SydenyOpera.page.functions.Giftvoucherpagefunctions;
import com.SydenyOpera.page.functions.LoginPageFunctions;
import com.SydenyOpera.page.functions.OrderconfirmationPagefunctions;
import com.SydenyOpera.page.functions.Tourspagefunctions;

/**
 * @author aasgh2 All class created in .page.functions package are initialized
 *         in this class
 * 
 *         and there objects are being called in Step_defination package
 * 
 */
public class Initialize extends OpenandCloseDriver {
	protected Actiondriver ad;

	protected LoginPageFunctions lpf;

	protected Giftvoucherpagefunctions Gvf;

	protected Checkoutpagewithloginfunctions cplf;

	protected Cartpagewithoutsessionfunctions cpwsf;

	protected OrderconfirmationPagefunctions ocpf;

	protected Checkoutpagewithoutlogin cpwlf;
	
	protected Tourspagefunctions Tpf ;

	protected SydenyoperaFooterFunctions footersoh;

	protected SydenyOperaHeaderFunctions Header;

	public Initialize() {
		ad = new Actiondriver(driver);
		lpf = new LoginPageFunctions(driver);
		Gvf = new Giftvoucherpagefunctions(driver);
		cplf = new Checkoutpagewithloginfunctions(driver);
		cpwsf = new Cartpagewithoutsessionfunctions(driver);
		ocpf = new OrderconfirmationPagefunctions(driver);
		cpwlf = new Checkoutpagewithoutlogin(driver);
		footersoh = new SydenyoperaFooterFunctions(driver);
		Header = new SydenyOperaHeaderFunctions(driver);
		Tpf = new Tourspagefunctions(driver);
	}

}
