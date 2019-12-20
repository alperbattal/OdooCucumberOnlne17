@login
Feature: Login

  Background:
    Given user is on the login page
    Then user can click on login button

  Scenario: User is able to login with valid credentials
    Then User can login with username "salesmanager60@info.com" and password "salesmanager"

  Scenario: User is not able to login with invalid username
    Then User enter username "salesmanager60@info.com" and password "password"
    And User verifies that "Wrong login/password" is displayed

  Scenario: User is not able to login with invalid password
    Then User enter username "salesmanager" and password "salesmanager"
    And User verifies that "Wrong login/password" is displayed

  Scenario: user is able to reset password
    Then User can reset the password by clicking the reset button

  Scenario: user is able to create a new account
    Then User can click on no account button to create a new account
