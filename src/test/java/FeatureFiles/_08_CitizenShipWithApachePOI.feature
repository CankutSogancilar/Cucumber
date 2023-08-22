Feature: Citizenship with Apache POI

  Background:
    Given Navigate to Campus
    And Enter username and password
    And Click on Login Button
    And Navigate to Citizenship page

    Scenario: Create a new Citizenship
      When Create a citizenship with Apache POI

