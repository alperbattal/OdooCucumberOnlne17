@title_verification
Feature: Title Verification

  Background:
    Given user is on the login page
    Then user can click on login button
    Then User can login with username "salesmanager60@info.com" and password "salesmanager"


    Scenario: user is able to verify title on page
      Given user is on "Contacts"
      Then user verifies that the title is "Contacts"
      Given user is on "Discuss"
      Then user verifies that the title is "#Inbox"
      Given user is on "Calendar"
      Then user verifies that the title is "Meetings (Week 52)"
      Given user is on "Notes"
      Then user verifies that the title is "Notes"
      Given user is on "CRM"
      Then user verifies that the title is "Pipeline"
      Given user is on "Sales"
      Then user verifies that the title is "Quotations"
      Given user is on "Website"
      Then user verifies that the title is "Dashboard"

