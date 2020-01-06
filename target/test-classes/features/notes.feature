@notes
  Feature: Create new note
    Scenario: Verify new note is created

      Given user is on the login page

      And user logs in as username

      Then user click on "Notes" title

      And user click on "Create" button

      Then user create new note
