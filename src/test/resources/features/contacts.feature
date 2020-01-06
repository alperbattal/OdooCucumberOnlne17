@contacts
Feature:Create contacts

  Background:
    Given user is on the login page
    Then user can click on login button
    Then User can login with username "salesmanager60@info.com" and password "salesmanager"

  Scenario:Create a contacts

    Then user navigates to "Contacts"
    And user verifies that "Contacts" page subtitle is displayed
    Then user can click on create button
    And user adds new  contacts information

      | Name  | Phone     | Email           | Language |
      | Mary  |2343908907 | mary@hotmail.com| English  |


