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
  "name": "user Select a  month \"\u003cMonth and Year\u003e\" and  date \"\u003cdate\u003e\"",
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
        "Month and Year",
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
        "AUGUST 2016",
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
  "duration": 10405909859,
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
  "name": "user Select a  month \"AUGUST 2016\" and  date \"29\"",
  "matchedColumns": [
    0,
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
  "duration": 224173232,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AUGUST 2016",
      "offset": 22
    },
    {
      "val": "29",
      "offset": 46
    }
  ],
  "location": "Tours.user_Select_a_month_and_date(String,String)"
});
formatter.result({
  "duration": 31753425,
  "status": "passed"
});
formatter.match({
  "location": "Tours.user_navigate_to_tours_and_experiences_page()"
});
formatter.result({
  "duration": 25107895840,
  "status": "passed"
});
formatter.match({
  "location": "Tours.user_select_tickets_from_tours_list()"
});
formatter.result({
  "duration": 11068787466,
  "status": "passed"
});
formatter.match({
  "location": "Tours.user_click_on_add_to_cart()"
});
formatter.result({
  "duration": 1416075060,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutGuest.user_is_at_Checkout_page()"
});
formatter.result({
  "duration": 12741295691,
  "error_message": "org.openqa.selenium.remote.UnreachableBrowserException: Error communicating with the remote browser. It may have died.\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027delaasgh231199\u0027, ip: \u002710.202.60.205\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: driver.version: RemoteWebDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d47.0.1, platform\u003dWINDOWS, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 1cda2307-737a-474f-b0b9-3e05aaddda40\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:665)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:59)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:37)\r\n\tat com.sun.proxy.$Proxy15.isDisplayed(Unknown Source)\r\n\tat com.SydenyOpera.page.functions.Checkoutpagewithoutlogin$Userdetails.verifythatallelementsarepresent(Checkoutpagewithoutlogin.java:166)\r\n\tat com.Sydenyopera.test.step_defination.CheckoutGuest.user_is_at_Checkout_page(CheckoutGuest.java:20)\r\n\tat ✽.Given user is at  Checkout page(web/Tours.feature:15)\r\nCaused by: org.apache.http.conn.HttpHostConnectException: Connect to 127.0.0.1:7056 [/127.0.0.1] failed: Connection refused: connect\r\n\tat org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:158)\r\n\tat org.apache.http.impl.conn.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:353)\r\n\tat org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:380)\r\n\tat org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:236)\r\n\tat org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:184)\r\n\tat org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:88)\r\n\tat org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:110)\r\n\tat org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:184)\r\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:71)\r\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:55)\r\n\tat org.openqa.selenium.remote.internal.ApacheHttpClient.fallBackExecute(ApacheHttpClient.java:162)\r\n\tat org.openqa.selenium.remote.internal.ApacheHttpClient.execute(ApacheHttpClient.java:90)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:142)\r\n\tat org.openqa.selenium.firefox.internal.NewProfileExtensionConnection.execute(NewProfileExtensionConnection.java:160)\r\n\tat org.openqa.selenium.firefox.FirefoxDriver$LazyCommandExecutor.execute(FirefoxDriver.java:380)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:644)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:59)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:37)\r\n\tat com.sun.proxy.$Proxy15.isDisplayed(Unknown Source)\r\n\tat com.SydenyOpera.page.functions.Checkoutpagewithoutlogin$Userdetails.verifythatallelementsarepresent(Checkoutpagewithoutlogin.java:166)\r\n\tat com.Sydenyopera.test.step_defination.CheckoutGuest.user_is_at_Checkout_page(CheckoutGuest.java:20)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:298)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:678)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)\r\nCaused by: java.net.ConnectException: Connection refused: connect\r\n\tat java.net.DualStackPlainSocketImpl.waitForConnect(Native Method)\r\n\tat java.net.DualStackPlainSocketImpl.socketConnect(DualStackPlainSocketImpl.java:85)\r\n\tat java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)\r\n\tat java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)\r\n\tat java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)\r\n\tat java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172)\r\n\tat java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)\r\n\tat java.net.Socket.connect(Socket.java:589)\r\n\tat org.apache.http.conn.socket.PlainConnectionSocketFactory.connectSocket(PlainConnectionSocketFactory.java:74)\r\n\tat org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:141)\r\n\t... 80 more\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CheckoutGuest.user_click_on_Sign_in_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "gmalik4@sapient.com",
      "offset": 22
    },
    {
      "val": "secret11",
      "offset": 63
    }
  ],
  "location": "CheckoutGuest.user_enter_username_and_enter_password_and_click_on_signin_button(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CheckoutGuest.then_user_come_to_payement_section()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Jørn Utzon",
      "offset": 51
    }
  ],
  "location": "CheckoutGuest.user_enter_cardholder_name_in_Card_holder_section(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "41111111111111111",
      "offset": 45
    }
  ],
  "location": "CheckoutGuest.user_enter_cardnumber_in_cardnumber_section(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "29",
      "offset": 45
    }
  ],
  "location": "CheckoutGuest.user_enter_expirydate_in_expirydate_section(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 41
    }
  ],
  "location": "CheckoutGuest.user_enter_security_code_in_cvv_section(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CheckoutGuest.user_click_on_payment_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Jørn Utzon",
      "offset": 51
    }
  ],
  "location": "CheckoutGuest.user_enter_cardholder_name_in_Card_holder_section(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CheckoutGuest.user_click_on_payment_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CheckoutGuest.user_navigate_to_order_confirmation_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1011847427,
  "error_message": "org.openqa.selenium.remote.UnreachableBrowserException: Error communicating with the remote browser. It may have died.\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027delaasgh231199\u0027, ip: \u002710.202.60.205\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: driver.version: OpenandCloseDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d47.0.1, platform\u003dWINDOWS, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 1cda2307-737a-474f-b0b9-3e05aaddda40\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:665)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:701)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.close(RemoteWebDriver.java:521)\r\n\tat com.SydenyOpera.core.OpenandCloseDriver.teardown(OpenandCloseDriver.java:102)\r\n\tat com.Sydenyopera.test.step_defination.Hook.afterScenario(Hook.java:23)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:59)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:222)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:210)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:204)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:50)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:678)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)\r\nCaused by: org.apache.http.conn.HttpHostConnectException: Connect to 127.0.0.1:7056 [/127.0.0.1] failed: Connection refused: connect\r\n\tat org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:158)\r\n\tat org.apache.http.impl.conn.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:353)\r\n\tat org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:380)\r\n\tat org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:236)\r\n\tat org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:184)\r\n\tat org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:88)\r\n\tat org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:110)\r\n\tat org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:184)\r\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:71)\r\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:55)\r\n\tat org.openqa.selenium.remote.internal.ApacheHttpClient.fallBackExecute(ApacheHttpClient.java:144)\r\n\tat org.openqa.selenium.remote.internal.ApacheHttpClient.execute(ApacheHttpClient.java:90)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:142)\r\n\tat org.openqa.selenium.firefox.internal.NewProfileExtensionConnection.execute(NewProfileExtensionConnection.java:160)\r\n\tat org.openqa.selenium.firefox.FirefoxDriver$LazyCommandExecutor.execute(FirefoxDriver.java:380)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:644)\r\n\t... 59 more\r\nCaused by: java.net.ConnectException: Connection refused: connect\r\n\tat java.net.DualStackPlainSocketImpl.waitForConnect(Native Method)\r\n\tat java.net.DualStackPlainSocketImpl.socketConnect(DualStackPlainSocketImpl.java:85)\r\n\tat java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)\r\n\tat java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)\r\n\tat java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)\r\n\tat java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172)\r\n\tat java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)\r\n\tat java.net.Socket.connect(Socket.java:589)\r\n\tat org.apache.http.conn.socket.PlainConnectionSocketFactory.connectSocket(PlainConnectionSocketFactory.java:74)\r\n\tat org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:141)\r\n\t... 74 more\r\n",
  "status": "failed"
});
});