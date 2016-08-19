package com.Sydenyopera.test.step_defination;


import java.net.MalformedURLException;

import com.SydenyOpera.core.OpenandCloseDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	
	OpenandCloseDriver df = new OpenandCloseDriver();

	@Before
	  public void beforeScenario() throws MalformedURLException, InterruptedException{

	  df.createDriver();
	  }

	@After
	  public void afterScenario(){
	  df.teardown();
	  }
}