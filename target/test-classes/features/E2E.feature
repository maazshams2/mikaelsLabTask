Feature: End to End tests

@E2E
Scenario: User signs up, updates profile and password and finally deletes account
  Given       [SignUp] User signs up
  When        [Account] User navigates to My Account
  And         [Account] User updates profile information
  And         [Home] User logouts from application
  Then        [Home] Verify user is logged out from application

@E2E
Scenario: User logins to application and logouts
  Given       [Login] User logins to application
  When        [Account] User navigates to My Account
  And         [Account] User updates password
  And         [Account] User deletes newly created account
  Then        [Home] Verify account is deleted
