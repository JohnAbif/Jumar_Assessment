$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Dev2/Jumar_project/src/main/java/Features/createAccount.feature");
formatter.feature({
  "line": 1,
  "name": "Customer journey",
  "description": " This feature will create a new account and register a new user and find the most expensive dress",
  "id": "customer-journey",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Verify that a user can register and find a dress",
  "description": "",
  "id": "customer-journey;verify-that-a-user-can-register-and-find-a-dress",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "that user has navigated to the web application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user has clicked on the Sign in link",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "enters email address in the create account section",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "clicks on \u0027Create an Account\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user successfully fills out the details form",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user clicks on the \u0027Register\u0027 button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user\u0027s account would be created successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user is able to log in with valid \"\u003cemailaddress\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "find the most expensive dress",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "add it to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "logs out successfully",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user is able to log back in successfully with valid \"\u003cemailaddress\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "ensure that the dress is still in the cart.",
  "keyword": "And "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "customer-journey;verify-that-a-user-can-register-and-find-a-dress;",
  "rows": [
    {
      "cells": [
        "emailaddress",
        "password"
      ],
      "line": 23,
      "id": "customer-journey;verify-that-a-user-can-register-and-find-a-dress;;1"
    },
    {
      "cells": [
        "hive91@day.com",
        "Autumn2014!"
      ],
      "line": 24,
      "id": "customer-journey;verify-that-a-user-can-register-and-find-a-dress;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 24,
  "name": "Verify that a user can register and find a dress",
  "description": "",
  "id": "customer-journey;verify-that-a-user-can-register-and-find-a-dress;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "that user has navigated to the web application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user has clicked on the Sign in link",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "enters email address in the create account section",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "clicks on \u0027Create an Account\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user successfully fills out the details form",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user clicks on the \u0027Register\u0027 button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user\u0027s account would be created successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user is able to log in with valid \"hive91@day.com\" and \"Autumn2014!\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "find the most expensive dress",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "add it to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "logs out successfully",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user is able to log back in successfully with valid \"hive91@day.com\" and \"Autumn2014!\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "ensure that the dress is still in the cart.",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAccountStepDefinition.that_user_has_navigated_to_the_web_application()"
});
formatter.result({
  "duration": 9695147400,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountStepDefinition.user_has_clicked_on_the_Sign_in_link()"
});
formatter.result({
  "duration": 2140682000,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountStepDefinition.enters_email_address_in_the_create_account_section()"
});
formatter.result({
  "duration": 138188200,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountStepDefinition.clicks_on_Create_an_Account_button()"
});
formatter.result({
  "duration": 153022900,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountStepDefinition.user_successfully_fills_out_the_details_form()"
});
formatter.result({
  "duration": 5447722900,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountStepDefinition.user_clicks_on_the_Register_button()"
});
formatter.result({
  "duration": 2054171600,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountStepDefinition.user_s_account_would_be_created_successfully()"
});
formatter.result({
  "duration": 61089100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hive91@day.com",
      "offset": 35
    },
    {
      "val": "Autumn2014!",
      "offset": 56
    }
  ],
  "location": "CreateAccountStepDefinition.user_is_able_to_log_in_with_valid_and(String,String)"
});
formatter.result({
  "duration": 5900572000,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountStepDefinition.find_the_most_expensive_dress()"
});
formatter.result({
  "duration": 2516179900,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountStepDefinition.add_it_to_the_cart()"
});
formatter.result({
  "duration": 7009620200,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountStepDefinition.logs_out_successfully()"
});
formatter.result({
  "duration": 2520200300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hive91@day.com",
      "offset": 53
    },
    {
      "val": "Autumn2014!",
      "offset": 74
    }
  ],
  "location": "CreateAccountStepDefinition.user_is_able_to_log_back_in_successfully_with_valid_and(String,String)"
});
formatter.result({
  "duration": 3767104100,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountStepDefinition.ensure_that_the_dress_is_still_in_the_cart()"
});
formatter.result({
  "duration": 39012200,
  "error_message": "junit.framework.AssertionFailedError\r\n\tat junit.framework.Assert.fail(Assert.java:55)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:22)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:31)\r\n\tat stepDefinition.CreateAccountStepDefinition.ensure_that_the_dress_is_still_in_the_cart(CreateAccountStepDefinition.java:174)\r\n\tat ✽.And ensure that the dress is still in the cart.(C:/Dev2/Jumar_project/src/main/java/Features/createAccount.feature:20)\r\n",
  "status": "failed"
});
});