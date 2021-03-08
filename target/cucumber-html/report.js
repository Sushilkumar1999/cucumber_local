$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/test/LoginWithParam.feature");
formatter.feature({
  "name": "Login into amazon website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Positive scenario to test login functinonality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "user has opened amazon wevsite on chrome browser",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters correct \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should be able to login",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "abcd@xyz.com",
        "abc123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Positive scenario to test login functinonality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has opened amazon wevsite on chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_StepDef.user_has_opened_amazon_wevsite_on_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters correct \"abcd@xyz.com\" and \"abc123\"",
  "keyword": "When "
});
formatter.match({
  "location": "Login_StepDef.user_enters_correct_something_and_something(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_StepDef.user_should_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});