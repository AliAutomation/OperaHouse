@Checkout
Feature: Checkout - Your Details | Member Login
  As I already added item in my cart , I want to
  -Verify that user able to perform Member login and place order
  -Verify that user able to perform Guest login and place order
  -Verify that user able to perform Social login through GooglePlus and place order
  -Verify that user able to perform Socail Login through facebook  and place order
  -Verify that user able to apply gift voucher at check out page

  Background: Flow till Checkoutpage
    Given user is at giftvoucher page
    When User select a giftvoucher price
    Given User enter toname "test" and enter fromename "tester" and provive message "Goodluck"
    Then select send via email as delivery option
    And click on addrocart button
    Then User navigate to cart page
    Then click on continuetocheckout

  @Memberlogin
  Scenario Outline: Verify that user able to perform Member login and place order
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
      | username            | password | cardHoldername | cardnumber        | date    | CVV |
      | gmalik4@sapient.com | secret11 | Jørn Utzon     | 41111111111111111 | 03/2020 | 123 |

  @Guestlogin
  Scenario Outline: Verify that user able to perform Guest login and place order
    Given user is at  Checkout page
    When user click on  continue as a Guest
    Given user enter emailaddress"<emailaddress>" and user enter firstname"<firstname>" and Lastname "<lastname>" and click on signinbutton
    And then user come to payement  section
    Given user enter cardholder name in Card holder section "<cardHoldername>"
    Given user enter cardnumber in cardnumber section "<cardnumber>"
    Given user enter expirydate in expirydate section "<date>"
    Given user enter security code in cvv section "<CVV>"
    Then user click on payment button
    Given user enter cardholder name in Card holder section "<cardHoldername>"
    Given user enter cardnumber in cardnumber section "<cardnumber>"
    Then user click on payment button
    Then user navigate to order confirmation page

    Examples: 
      | firstname | lastname | emailaddress           | cardHoldername | cardnumber        | date    | CVV |
      | tester    | user     | usertester@yopmail.com | Jørn Utzon     | 41111111111111111 | 03/2020 | 123 |

  @googlepluslogin
  Scenario Outline: Verify that user able to perform Social login through GooglePlus and place order
    Given user is at  Checkout page
    Given user click on Gplus signin user enter gmailadress"<Gmail>" and enter googlepassword "<Gmailpassword>"
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
      | Gmail                | Gmailpassword | cardHoldername | cardnumber        | date    | CVV |
      | sohtest911@gmail.com | Sapient123    | Jørn Utzon     | 41111111111111111 | 03/2020 | 123 |

 # @facebooklogin
  #Scenario Outline: Verify that user able to perform Socail Login through facebook  and place order
   # Given user is at  Checkout page
   # Given user enter facebookID"<FacebookID>" , enter password"<password>" and click on signin button
   # And then user come to payement  section
   # Given user enter cardholder name in Card holder section "<cardHoldername>"
   # Given user enter cardnumber in cardnumber section "<cardnumber>"
   # Given user enter expirydate in expirydate section "<date>"
   # Given user enter security code in cvv section "<CVV>"
   # Then user click on payment button
   # Given user enter cardholder name in Card holder section "<cardHoldername>"
   # Then user click on payment button
    #Then user navigate to order confirmation page

   # Examples: 
    #  | FacebookID           | password   | cardHoldername | cardnumber        | date    | CVV |
    #  | sohtest911@gmail.com | Sapient123 | Jørn Utzon     | 41111111111111111 | 03/2020 | 123 |

  @ApplyGiftVoucher
  Scenario Outline: Verify that user able to apply gift voucher at check out page
    Given user is at  Checkout page
    When user click on add voucher
    Given User enter giftvouchercode"<GiftVoucher>" and press submit button
    Then due amount should be remaing of giftvoucher
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
      | GiftVoucher  | username            | password | cardHoldername | cardnumber        | date    | CVV |
      | AFB2-6206558 | gmalik4@sapient.com | secret11 | Jørn Utzon     | 41111111111111111 | 03/2020 | 123 |
