package com.Sydenyopera.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(
		features = "src/test/resourses/features", tags ={"@Tag"} ,
    glue = "com.Sydenyopera.test.step_defination",
      plugin = { 
        "pretty",
          "html:target/cucumber" }
  
)

public class TestRunWebSuite {

}

