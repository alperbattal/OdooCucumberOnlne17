@Sales
Feature: Sales

  Background: open login page and login as sales manager
    Given user is on the login page
    Then user can click on login button
    Then User can login with username "salesmanager60@info.com" and password "salesmanager"


  Scenario: Verify column names

    Given user navigates to "Sales"
    And user verifies that column names are displayed
      | Quotation Number |
      | Quotation Date   |
      | Customer         |
      | Salesperson      |
      | Total            |
      | Status           |

