@Tours
Feature: As a User on  Sydeny opera House i want to book Tours
  -Verify that user able to select a date and time and book tours as member user
  -Verify that user able to select a date and time and book tours as Guest user
  -Verify that user able to select a date and time and book tours by using  Social login
  -Verify that user able to  apply gift voucher  in transaction

  @Bookingtours
  Scenario Outline: Verify that user able to  add a tour and book tours as member user
    Given user is at tour calender page
    Then user Select a  month "<month>" and  date "<date>"
    And user navigate to tours-and-experiences page
    Then user select tickets from tours list
    And user click on add to cart
    Given user is at  Checkout page
    When user click on Sign-in button
    Then user enter  username "<username>" and enter password "<password>" and click on signin button
    And then user come to payement  section
    Given user enter cardholder name in Card holder section "<cardHoldername>"
    Given user enter cardnumber in cardnumber section "<cardnumber>"
    Given user enter expirydate in expirydate section "<date>"
    Given user enter security code in cvv section "<CVV>"
    Then user click on payment button
    Given user enter cardholder name in Card holder section "<cardHoldername>"
    Then user click on payment button
    Then user navigate to order confirmation page

    Examples: 
      | Month  | date | username            | password | cardHoldername | cardnumber        | date    | CVV |
      | August |   29 | gmalik4@sapient.com | secret11 | Jørn Utzon     | 41111111111111111 | 03/2020 | 123 |
