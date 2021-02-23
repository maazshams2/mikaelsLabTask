$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/E2E.feature");
formatter.feature({
  "name": "End to End tests",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User signs up, updates profile and password and finally deletes account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@E2E"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "[SignUp] User signs up",
  "keyword": "Given "
});
formatter.match({
  "location": "SignUp.signup_User_signs_up()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "[Account] User navigates to My Account",
  "keyword": "When "
});
formatter.match({
  "location": "Account.account_User_navigates_to_My_Accounts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "[Account] User updates profile information",
  "keyword": "And "
});
formatter.match({
  "location": "Account.account_User_updates_profile_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "[Home] User logouts from application",
  "keyword": "And "
});
formatter.match({
  "location": "Home.home_User_logouts_from_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "[Home] Verify user is logged out from application",
  "keyword": "Then "
});
formatter.match({
  "location": "Home.home_Verify_user_is_logged_out_from_application()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User logins to application and logouts",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@E2E"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "[Login] User logins to application",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.login_User_logins_to_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "[Account] User navigates to My Account",
  "keyword": "When "
});
formatter.match({
  "location": "Account.account_User_navigates_to_My_Accounts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "[Account] User updates password",
  "keyword": "And "
});
formatter.match({
  "location": "Account.account_User_updates_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "[Account] User deletes newly created account",
  "keyword": "And "
});
formatter.match({
  "location": "Account.account_User_deletes_newly_created_account()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using class name\u003dalert-info\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027CRKRL-SHAMSMAA1\u0027, ip: \u0027172.24.64.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByClassName(RemoteWebDriver.java:412)\r\n\tat org.openqa.selenium.By$ByClassName.findElement(By.java:389)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat pages.e2e.PageAccount.getAlertInfo(PageAccount.java:99)\r\n\tat stepDefinition.Account.account_User_deletes_newly_created_account(Account.java:51)\r\n\tat ✽.[Account] User deletes newly created account(src/test/resources/features/E2E.feature:16)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "[Home] Verify account is deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "Home.home_Verify_account_is_deleted()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});