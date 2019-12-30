$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/notes.feature");
formatter.feature({
  "name": "Create new note",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@notes"
    }
  ]
});
formatter.scenario({
  "name": "Verify new note is created",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@notes"
    }
  ]
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
  "name": "user logs in as username",
  "keyword": "And "
});
formatter.match({
  "location": "NotesStepDefinition.user_logs_in_as_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on \"Notes\" title",
  "keyword": "Then "
});
formatter.match({
  "location": "NotesStepDefinition.user_click_on_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on \"Create\" button",
  "keyword": "And "
});
formatter.match({
  "location": "NotesStepDefinition.user_click_on_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user create new note",
  "keyword": "Then "
});
formatter.match({
  "location": "NotesStepDefinition.user_create_new_note()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});