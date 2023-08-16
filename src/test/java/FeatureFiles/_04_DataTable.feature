Feature: Data Table Example

  @Smoke @Regression
  Scenario: Single Data Table
    Given Go to the WebPage
    And Fill the form with valid data
      | John            |
      | Snow            |
      | 2345 Winter St. |
      | 5326985         |
    Then Save the form

                            # Data Table vs Scenario Outline
  # Data Table sends all the data to one step at once and runs the scenario only once
  # Scenario outline sends the data one by one for each time and runs the all sceneraio for all data sets

  Scenario: Multiple Data Tables
    Given Go to the WebPage
    And Fill the form with valid data
      | John            |
      | Snow            |
      | 2345 Winter St. |
      | 5326985         |
    And Enter valid information
      | Name      | John             |
      | Last Name | Snow             |
      | Address   | 2356 Spring Ave. |
      | Phone     | 8654123658       |
    Then Save the form