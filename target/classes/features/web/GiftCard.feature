@Giftvoucher
Feature: Gift Voucher
  As a Registered user of Sydeny opera House i would like to :
   -Verify a user buying an Online Gift Voucher.(delivery option via email )
   -Verify the delivery method chosen as Send to recipient by email
   -Verify the delivery method chosen as collect at box office 
   -Verify the Edit functionality at Gift voucher process_Continue
   -Verify the Edit functionality at Gift voucher process_Back To Cart
   -Verify the Delete functionality at Gift voucher process_delete
   -Verify the Donation box presence and addition of donation amount

  Background: Flow till Gift Voucher page
    Given i navigate to UAT Homepage
    Given i enter loginId "gmalik4@sapient.com" and password "secret11"
    And i click on signin button
    Then user navigate to cartpage

  @onlinebuy
  Scenario Outline: Verify a user buying an Online Gift Voucher
    Given user is at giftvoucher page
    When User select a giftvoucher price
    Given User enter toname "test" and enter fromename "tester" and provive message "Goodluck"
    Then select send via email as delivery option
    And click on addrocart button
    Then User navigate to cart page
    Then click on continuetocheckout
    Then click on continuetocheckout
    Given user enter  card name "<cardname>"
    Given user enter card number "<cardnumber>"
    Given user enter expiry date  "<expiry date>"
    Given user enter cvv "<cvv>"
    Then user click on check box
    Then user click on placeorder
    And user navigate to orderconfirmation page

    Examples: 
      | cardname   | cardnumber        | expiry date | cvv |
      | Jørn Utzon | 41111111111111111 | 03/2020     | 123 |

  @myemail
  Scenario Outline: Verify the delivery method chosen as Send to recipient by email
    Given user is at giftvoucher page
    When User select a giftvoucher price
    Given User enter toname "test" and enter fromename "tester" and provive message "Goodluck"
    Then user enter email address of sender"user@yopmail.com"
    And click on addrocart button
    Given user is at cart page
    Then click on continuetocheckout
    Given user enter  card name "<cardname>"
    Given user enter card number "<cardnumber>"
    Given user enter expiry date  "<expiry date>"
    Given user enter cvv "<cvv>"
    Then user click on check box
    Then user click on placeorder
    Then user navigate to orderconfirmation page

    Examples: 
      | cardname   | cardnumber        | expiry date | cvv |
      | Jørn Utzon | 41111111111111111 | 03/2020     | 123 |

  @boxoffice
  Scenario Outline: Verify the delivery method chosen as collect at box office
    Given user is at giftvoucher page
    When User select a giftvoucher price
    Given User enter toname "test" and enter fromename "tester" and provive message "Goodluck"
    Then select collect at box office  as delievry option
    And click on addrocart button
    Then User navigate to cart page
    Then click on continuetocheckout
    Given user enter  card name "<cardname>"
    Given user enter card number "<cardnumber>"
    Given user enter expiry date  "<expiry date>"
    Given user enter cvv "<cvv>"
    Then user click on check box
    Then user click on placeorder
    Then user navigate to orderconfirmation page

    Examples: 
      | cardname   | cardnumber        | expiry date | cvv |
      | Jørn Utzon | 41111111111111111 | 03/2020     | 123 |

  @continue
  Scenario: Verify the Edit functionality at Gift voucher process_Continue
    Given user is at giftvoucher page
    When User select a giftvoucher price
    Given User enter toname "test" and enter fromename "tester" and provive message "Goodluck"
    Then select collect at box office  as delievry option
    And click on addrocart button
    Given user is at cart page
    When user click on edit button and choose to press continue

  @backtocart
  Scenario: Verify the Edit functionality at Gift voucher process_Back To Cart
    Given user is at giftvoucher page
    When User select a giftvoucher price
    Given User enter toname "test" and enter fromename "tester" and provive message "Goodluck"
    Then select collect at box office  as delievry option
    And click on addrocart button
    Given user is at cart page
    When user click on edit button and choose to backtocart option
    Given user is at cart page

  @delete
  Scenario: Verify the Delete functionality at Gift voucher process_delete
    Given user is at giftvoucher page
    When User select a giftvoucher price
    Given User enter toname "test" and enter fromename "tester" and provive message "Goodluck"
    Then select collect at box office  as delievry option
    And click on addrocart button
    Given user is at cart page
    When user click on delete button
    Then cart gone empty

  @donation
  Scenario Outline: Verify the Donation box presence and addition of donation amount
    Given user is at giftvoucher page
    When User select a giftvoucher price
    Given User enter toname "test" and enter fromename "tester" and provive message "Goodluck"
    Then select collect at box office  as delievry option
    And click on addrocart button
    Given user is at cart page
    Then user add   donation to cart
    Then Again user navigate to cart page
    Given user enter  card name "<cardname>"
    Given user enter card number "<cardnumber>"
    Given user enter expiry date  "<expiry date>"
    Given user enter cvv "<cvv>"
    Then user click on check box
    Then user click on placeorder
    Given user enter  card name "<cardname>"
    Given user enter card number "<cardnumber>"
    Then user click on placeorder
    Then user navigate to orderconfirmation page

    Examples: 
      | cardname   | cardnumber        | expiry date | cvv |
      | Jørn Utzon | 41111111111111111 | 03/2020     | 123 |
