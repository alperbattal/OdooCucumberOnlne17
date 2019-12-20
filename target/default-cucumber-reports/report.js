$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "loginStepDefinitions.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinitions.user_can_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User is able to login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "User can login with username \"salesmanager60@info.com\" and password \"salesmanager\"",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinitions.user_can_login_with_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "loginStepDefinitions.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinitions.user_can_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User is not able to login with invalid username",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "User enter username \"salesmanager60@info.com\" and password \"password\"",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinitions.user_enter_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies that \"Wrong login/password\" is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "loginStepDefinitions.user_verifies_that_is_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "loginStepDefinitions.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinitions.user_can_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User is not able to login with invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "User enter username \"salesmanager\" and password \"salesmanager\"",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinitions.user_enter_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies that \"Wrong login/password\" is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "loginStepDefinitions.user_verifies_that_is_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "loginStepDefinitions.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinitions.user_can_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user is able to reset password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "User can reset the password by clicking the reset button",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinitions.user_can_reset_the_password_by_clicking_the_reset_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "loginStepDefinitions.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinitions.user_can_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user is able to create a new account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "User can click on no account button to create a new account",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinitions.user_can_click_on_no_account_button_to_create_a_new_account()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});