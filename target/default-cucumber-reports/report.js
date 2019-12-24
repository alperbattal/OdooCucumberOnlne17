$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/verifyTitle.feature");
formatter.feature({
  "name": "Title Verification",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@title_verification"
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
formatter.scenario({
  "name": "user is able to verify title on page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@title_verification"
    }
  ]
});
formatter.step({
  "name": "user is on \"Contacts\"",
  "keyword": "Given "
});
formatter.match({
  "location": "titleStepDefinitions.user_is_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that the title is \"Contacts\"",
  "keyword": "Then "
});
formatter.match({
  "location": "titleStepDefinitions.user_verifies_that_the_title_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on \"Discuss\"",
  "keyword": "Given "
});
formatter.match({
  "location": "titleStepDefinitions.user_is_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that the title is \"#Inbox\"",
  "keyword": "Then "
});
formatter.match({
  "location": "titleStepDefinitions.user_verifies_that_the_title_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on \"Calendar\"",
  "keyword": "Given "
});
formatter.match({
  "location": "titleStepDefinitions.user_is_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that the title is \"Meetings (Week 52)\"",
  "keyword": "Then "
});
formatter.match({
  "location": "titleStepDefinitions.user_verifies_that_the_title_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on \"Notes\"",
  "keyword": "Given "
});
formatter.match({
  "location": "titleStepDefinitions.user_is_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that the title is \"Notes\"",
  "keyword": "Then "
});
formatter.match({
  "location": "titleStepDefinitions.user_verifies_that_the_title_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on \"CRM\"",
  "keyword": "Given "
});
formatter.match({
  "location": "titleStepDefinitions.user_is_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that the title is \"Pipeline\"",
  "keyword": "Then "
});
formatter.match({
  "location": "titleStepDefinitions.user_verifies_that_the_title_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on \"Sales\"",
  "keyword": "Given "
});
formatter.match({
  "location": "titleStepDefinitions.user_is_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that the title is \"Quotations\"",
  "keyword": "Then "
});
formatter.match({
  "location": "titleStepDefinitions.user_verifies_that_the_title_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on \"Website\"",
  "keyword": "Given "
});
formatter.match({
  "location": "titleStepDefinitions.user_is_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that the title is \"Dashboard\"",
  "keyword": "Then "
});
formatter.match({
  "location": "titleStepDefinitions.user_verifies_that_the_title_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});