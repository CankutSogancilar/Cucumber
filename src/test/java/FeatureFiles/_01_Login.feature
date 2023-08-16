Feature: Login Functionality
  As a user I want to be able to login with my valid credentials
  so I can reach my Info

  @smoke
  Scenario: Login with valid username and password
    Given Navigate to Campus
    And Enter username and password
    When Click on Login Button
    Then User should Login successfully

