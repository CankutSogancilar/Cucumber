#Go to Campus
#log in
#Enter username and password
#Click on Set up
#Click on Parameter
#Click on countries
#Click on add button
#Fill the form
#Click on save button
#Assert that you see success message

  Feature: Country Functionality
    As a user, I want to be able to create, delete and update countries
  so that I can update the country list

  Scenario: Create a new country
    Given Navigate to Campus
    And Enter username and password
    And Click on Login Button
    And Navigate to Country page
    When Create a new country
    Then Success message should be displayed

    Scenario: Delete a country
      Given Navigate to Campus
      And Enter username and password
      And Click on Login Button
      And Navigate to Country page
      And Delete a country
      Then Success message should be displayed

