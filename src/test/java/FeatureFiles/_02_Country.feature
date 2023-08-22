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

  Background:
    Given Navigate to Campus
    And Enter username and password
    And Click on Login Button
    And Navigate to Country page

  @Smoke
  Scenario: Create a new country
    When Create a new country
    Then Success message should be displayed

  @Smoke
  Scenario: Delete a country
    And Delete a country
    Then Success message should be displayed

  @Regression
  Scenario: Create a country with Parameters
    And Click on add button
    And Enter "EdaS8" as country name and "edas8" as country code
    When Click on save button
    Then Success message should be displayed


        #TODO Update the country you created
  @Regression
  Scenario: Delete a country
    And Delete a country
    Then Success message should be displayed



