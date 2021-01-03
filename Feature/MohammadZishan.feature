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
	@Sal4
  Scenario: Verify Account Name field in the Account Object 
   
    Given I open "chrome" browser
    And I go to "qa" environment
    And I enter "test.user@gmail.com.test" username
    And I enter "Pa55word" password
    When I click the "Login" button
    Then I should see the "Accounts" link
    And I click the "Accounts" tab
    And I click the "new" button 
    And I click the "save" button
    And I should see the text "Review all error messages below to correct your data"
    And I enter "abc123" text for "acc2" field 
    When I click the "save" button
    And I quit the browser
  