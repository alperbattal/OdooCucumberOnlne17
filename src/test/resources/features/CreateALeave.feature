@create_a_leave
Feature: Create A Leave Request

  Background:
    Given user is on the login page
    Then user can click on login button
    Then User can login with username "imm60@info.com" and password "inventorymanager"
    And user navigates to "Leaves" module

  Scenario: User is able to create a new leave request
    Then user clicks on Create button
    And user fills the table and clicks save button
      | Description    | Leave Type  | From       | Till       |
      | Need a day off | Sick Leaves | 08/01/2020 | 08/16/2020 |
    Then user verifies the success message as "You've successfully created a leave request!"


