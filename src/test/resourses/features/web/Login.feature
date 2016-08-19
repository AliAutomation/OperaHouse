
@Log
Feature: Login
  As an Exsisting user of Sydeny Opera House I would like to login

  
  Scenario Outline: User able to login 
    Given i navigate to UAT Homepage
    Given i enter loginId "<loginId>" and password "<password>"
    And i click on signin button
    Then user navigate to cartpage

    Examples: 
    
      | loginId             | password |
      | gmalik4@sapient.com | secret11 |
      
