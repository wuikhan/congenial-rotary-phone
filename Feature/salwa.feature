

Feature: verify the account tab
  I want to make sure account tab is showing when I log in.

  Scenario: Accounts tab is visible after successful login.
    Given I open "chrome" browser
    And I go to "qa" environment
    And I enter "test.user@gmail.com.test" username
    And I enter "Pa55word" password
    When I click the "Login" button
    Then I should see the "Accounts" link
    And I quit the browser

  