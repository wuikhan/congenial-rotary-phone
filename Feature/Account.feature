@Practice
Feature: Verify Accounts tab is present
  I want to make sure that Account tab is present on home screen

  Scenario: Verify Accounts tab is present after I log in
    Given I open "chrome" browser
    And I go to "qa" environment
    And I enter "test.user@gmail.com.test" username
    And I enter "Pa55word" password
    When I click the "Login" button
    Then I should see the "Accounts" link
    And I quit the browser


