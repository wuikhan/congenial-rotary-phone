Feature: Verify the Accounts elements
  I want to make sure that the Accounts links appears after user logs in

  Scenario: Accounts is visible after a successfull login attempt
   Given I open "chrome" browser
    And I go to "qa" environment
    And I enter "test.user@gmail.com.test" username
    And I enter "Pa55word" password
    When I click the "Login" button
    Then I should see the "Accounts" link
    And I quit the browser