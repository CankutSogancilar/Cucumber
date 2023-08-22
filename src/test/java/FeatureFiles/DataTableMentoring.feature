Feature: Contact Us
  As a User I want to be able to contact

  Scenario: Contact form Example
    Given Navigate to Exercise Page
    And Click on the contact Us button
    And Fill the form with this data
      | Eda1888            |
      | eda1888@gmail.com  |
      | Datatable          |
      | This is my Message |
    And Click submit button
    Then Verify form is submitted

