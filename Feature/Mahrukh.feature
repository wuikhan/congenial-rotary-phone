
Feature: Verify the accounts tab
  I want to make sure that the account tab appears after user logs in

  Scenario: Dashboard is visible after a successfull login attempt
    Given I open "chrome" browser
    And I go to "qa" environment
    And I enter "test.user@gmail.com.test" username
    And I enter "Pa55word" password
    When I click the "Login" button
    Then I should see the "Accounts" link
    And I quit the browser
    
    @sal4
    Scenario: verify Account name field in the account object 
    
    Given I open "chrome" browser
    And I go to "qa" environment
    And I enter "test.user@gmail.com.test" username
    And I enter "Pa55word" password
    When I click the "Login" button
    Then I should see the "Accounts" link
    And I click on the "Accounts" tab  
    When I click the "new" button
    When I click the "save" button
    And I should see the text "Review all error messages below to correct your data"
    And I enter  "jhd768" for "acc2" field
    When I click the "save" button
    
    
    
    
    
    
    