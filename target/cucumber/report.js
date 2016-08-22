$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("web/GiftCard.feature");
formatter.feature({
  "line": 2,
  "name": "Gift Voucher",
  "description": "As a Registered user of Sydeny opera House i would like to :\r\n -Verify a user buying an Online Gift Voucher.(delivery option via email )\r\n -Verify the delivery method chosen as Send to recipient by email\n -Verify the delivery method chosen as collect at box office \n -Verify the Edit functionality at Gift voucher process_Continue\n -Verify the Edit functionality at Gift voucher process_Back To Cart\n -Verify the Delete functionality at Gift voucher process_delete\n -Verify the Donation box presence and addition of donation amount",
  "id": "gift-voucher",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Giftvoucher"
    }
  ]
});
formatter.scenarioOutline({
  "line": 19,
  "name": "Verify a user buying an Online Gift Voucher",
  "description": "",
  "id": "gift-voucher;verify-a-user-buying-an-online-gift-voucher",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@onlinebuy"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "user is at giftvoucher page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "User select a giftvoucher price",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User enter toname \"test\" and enter fromename \"tester\" and provive message \"Goodluck\"",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "select send via email as delivery option",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "click on addrocart button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User navigate to cart page",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "click on continuetocheckout",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "click on continuetocheckout",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user enter  card name \"\u003ccardname\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "user enter card number \"\u003ccardnumber\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "user enter expiry date  \"\u003cexpiry date\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "user enter cvv \"\u003ccvv\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "user click on check box",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "user click on placeorder",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "user navigate to orderconfirmation page",
  "keyword": "And "
});
formatter.examples({
  "line": 36,
  "name": "",
  "description": "",
  "id": "gift-voucher;verify-a-user-buying-an-online-gift-voucher;",
  "rows": [
    {
      "cells": [
        "cardname",
        "cardnumber",
        "expiry date",
        "cvv"
      ],
      "line": 37,
      "id": "gift-voucher;verify-a-user-buying-an-online-gift-voucher;;1"
    },
    {
      "cells": [
        "Jørn Utzon",
        "41111111111111111",
        "03/2020",
        "123"
      ],
      "line": 38,
      "id": "gift-voucher;verify-a-user-buying-an-online-gift-voucher;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7462364166,
  "status": "passed"
});
formatter.background({
  "line": 12,
  "name": "Flow till Gift Voucher page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 13,
  "name": "i navigate to UAT Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "i enter loginId \"gmalik4@sapient.com\" and password \"secret11\"",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "i click on signin button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user navigate to cartpage",
  "keyword": "Then "
});
formatter.match({
  "location": "Userlogin.i_navigate_to_UAT_Homepage()"
});
formatter.result({
  "duration": 297462933,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "gmalik4@sapient.com",
      "offset": 17
    },
    {
      "val": "secret11",
      "offset": 52
    }
  ],
  "location": "Userlogin.i_enter_loginId_and_password(String,String)"
});
formatter.result({
  "duration": 305289053,
  "status": "passed"
});
formatter.match({
  "location": "Userlogin.i_click_on_signin_button()"
});
formatter.result({
  "duration": 112108497,
  "status": "passed"
});
formatter.match({
  "location": "Userlogin.user_navigate_to_cartpage()"
});
formatter.result({
  "duration": 9885277765,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "Verify a user buying an Online Gift Voucher",
  "description": "",
  "id": "gift-voucher;verify-a-user-buying-an-online-gift-voucher;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Giftvoucher"
    },
    {
      "line": 18,
      "name": "@onlinebuy"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "user is at giftvoucher page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "User select a giftvoucher price",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User enter toname \"test\" and enter fromename \"tester\" and provive message \"Goodluck\"",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "select send via email as delivery option",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "click on addrocart button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User navigate to cart page",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "click on continuetocheckout",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "click on continuetocheckout",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user enter  card name \"Jørn Utzon\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "user enter card number \"41111111111111111\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "user enter expiry date  \"03/2020\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "user enter cvv \"123\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "user click on check box",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "user click on placeorder",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "user navigate to orderconfirmation page",
  "keyword": "And "
});
formatter.match({
  "location": "GiftVoucher.user_is_at_giftvoucher_page()"
});
formatter.result({
  "duration": 38372352,
  "status": "passed"
});
formatter.match({
  "location": "GiftVoucher.user_select_a_giftvoucher_price()"
});
formatter.result({
  "duration": 110493589,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 19
    },
    {
      "val": "tester",
      "offset": 46
    },
    {
      "val": "Goodluck",
      "offset": 75
    }
  ],
  "location": "GiftVoucher.user_enter_toname_and_enter_fromename_and_provive_message(String,String,String)"
});
formatter.result({
  "duration": 477439871,
  "status": "passed"
});
formatter.match({
  "location": "GiftVoucher.select_send_via_email_as_delivery_option()"
});
formatter.result({
  "duration": 83233320,
  "status": "passed"
});
formatter.match({
  "location": "GiftVoucher.click_on_addrocart_button()"
});
formatter.result({
  "duration": 124000266,
  "status": "passed"
});
formatter.match({
  "location": "GiftVoucher.user_navigate_to_cart_page()"
});
formatter.result({
  "duration": 21716552969,
  "status": "passed"
});
formatter.match({
  "location": "GiftVoucher.click_on_continuetocheckout()"
});
formatter.result({
  "duration": 78899025,
  "status": "passed"
});
formatter.match({
  "location": "GiftVoucher.click_on_continuetocheckout()"
});
