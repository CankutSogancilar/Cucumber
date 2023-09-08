Feature: Database Testing for States Function

  Background:
    Given Navigate to Campus
    And Enter username and password
    And Click on Login Button

    Scenario: States testing with JDBC
      Given Navigate to States pages
      When Send the query "select name from states"
      Then check if they match with the names on the UI

