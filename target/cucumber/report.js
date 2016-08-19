$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("web/Tours.feature");
formatter.feature({
  "line": 2,
  "name": "As a User on  Sydeny opera House i want to book Tours",
  "description": "-Verify that user able to select a date and time and book tours as member user\n-Verify that user able to select a date and time and book tours as Guest user\n-Verify that user able to select a date and time and book tours by using  Social login\n-Verify that user able to  apply gift voucher  in transaction",
  "id": "as-a-user-on--sydeny-opera-house-i-want-to-book-tours",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Tours"
    }
  ]
});
formatter.scenarioOutline({
  "line": 9,
  "name": "Verify that user able to  add a tour and book tours as member user",
  "description": "",
  "id": "as-a-user-on--sydeny-opera-house-i-want-to-book-tours;verify-that-user-able-to--add-a-tour-and-book-tours-as-member-user",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@Bookingtours"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "user is at tour calender page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user Select a  month \"\u003cmonth\u003e\" and  date \"\u003cdate\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user navigate to tours-and-experiences page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user select tickets from tours list",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user click on add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user is at  Checkout page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user click on Sign-in button",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user enter  username \"\u003cusername\u003e\" and enter password \"\u003cpassword\u003e\" and click on signin button",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "then user come to payement  section",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user enter cardholder name in Card holder section \"\u003ccardHoldername\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "user enter cardnumber in cardnumber section \"\u003ccardnumber\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "user enter expirydate in expirydate section \"\u003cdate\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "user enter security code in cvv section \"\u003cCVV\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "user click on payment button",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "user enter cardholder name in Card holder section \"\u003ccardHoldername\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "user click on payment button",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "user navigate to order confirmation page",
  "keyword": "Then "
});
formatter.examples({
  "line": 28,
  "name": "",
  "description": "",
  "id": "as-a-user-on--sydeny-opera-house-i-want-to-book-tours;verify-that-user-able-to--add-a-tour-and-book-tours-as-member-user;",
  "rows": [
    {
      "cells": [
        "Month",
        "date",
        "username",
        "password",
        "cardHoldername",
        "cardnumber",
        "date",
        "CVV"
      ],
      "line": 29,
      "id": "as-a-user-on--sydeny-opera-house-i-want-to-book-tours;verify-that-user-able-to--add-a-tour-and-book-tours-as-member-user;;1"
    },
    {
      "cells": [
        "August",
        "29",
        "gmalik4@sapient.com",
        "secret11",
        "Jørn Utzon",
        "41111111111111111",
        "03/2020",
        "123"
      ],
      "line": 30,
      "id": "as-a-user-on--sydeny-opera-house-i-want-to-book-tours;verify-that-user-able-to--add-a-tour-and-book-tours-as-member-user;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 19434058857,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Verify that user able to  add a tour and book tours as member user",
  "description": "",
  "id": "as-a-user-on--sydeny-opera-house-i-want-to-book-tours;verify-that-user-able-to--add-a-tour-and-book-tours-as-member-user;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Tours"
    },
    {
      "line": 8,
      "name": "@Bookingtours"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "user is at tour calender page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user Select a  month \"\u003cmonth\u003e\" and  date \"29\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user navigate to tours-and-experiences page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user select tickets from tours list",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user click on add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user is at  Checkout page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user click on Sign-in button",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user enter  username \"gmalik4@sapient.com\" and enter password \"secret11\" and click on signin button",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "then user come to payement  section",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user enter cardholder name in Card holder section \"Jørn Utzon\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "user enter cardnumber in cardnumber section \"41111111111111111\"",
  "matchedColumns": [
    5
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "user enter expirydate in expirydate section \"29\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "user enter security code in cvv section \"123\"",
  "matchedColumns": [
    7
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "user click on payment button",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "user enter cardholder name in Card holder section \"Jørn Utzon\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "user click on payment button",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "user navigate to order confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "Tours.user_is_at_tour_calender_page()"
});
formatter.result({
  "duration": 233344130,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cmonth\u003e",
      "offset": 22
    },
    {
      "val": "29",
      "offset": 42
    }
  ],
  "location": "Tours.user_Select_a_month_and_date(String,String)"
});
formatter.result({
  "duration": 32060107,
  "status": "passed"
});
formatter.match({
  "location": "Tours.user_navigate_to_tours_and_experiences_page()"
});
formatter.result({
  "duration": 25056682558,
  "status": "passed"
});
formatter.match({
  "location": "Tours.user_select_tickets_from_tours_list()"
});
formatter.result({
  "duration": 25139976172,
  "status": "passed"
});
formatter.match({
  "location": "Tours.user_click_on_add_to_cart()"
});
formatter.result({
  "duration": 29638945,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutGuest.user_is_at_Checkout_page()"
});
