@SeatSelection
Feature: As a User on  Sydeny opera House I want to book Tickets for an event
  -Verify that user able to  select a seat by map  and proceed with payment
  
  -Verify that user able to select a seat by value and proceed with payment

  @SeatSelectionByvalue
  Scenario: Verify that user able to  select a seat by map  and proceed with payment
    Given User is at Seat selection Home page
    Then user Select a  month "<Month and Year>" and  date "<date>"
    And user navigate to seat selection page 
    Then user select the option for Seat selection by map
    
