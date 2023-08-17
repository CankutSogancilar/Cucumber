Feature: Fee Functionality


  Background:
    Given Navigate to Campus
    And Enter username and password
    And Click on Login Button
    And Navigate to Fees page

  @SmokeTest
  Scenario: Create a Fee
    And Click on add button
    And Fill  the add fee form
      | Cankutssss18   |
      | cankutssss 888 |
      | csss88888      |
      | 88888888       |
    Then Success message should be displayed

    #Create a csenario to delete all fees created in the first scenario
  # Use Data Table