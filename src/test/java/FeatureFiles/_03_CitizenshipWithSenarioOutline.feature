Feature: Citizenship Functionality

  Background:
    Given Navigate to Campus
    And Enter username and password
    And Click on Login Button
    And Navigate to Citizenship page

  Scenario Outline: Create a Citizenship
    And Click on add button
    Then Enter "<CitizenshipName>" as citizenship name and "<CitizenshipShortName>" as short name
    When Click on save button
    Then Success message should be displayed
    Examples:
      | CitizenshipName | CitizenshipShortName |
      | USA11112        | U1                   |
      | USA22223        | U2                   |
      | USA33334        | U3                   |
      | USA44445        | U4                   |

    #TODO: Create Delete Citizenship sceneraio by using Scenerio Outline and delete the Citizenship you created in the first scenario

  Scenario Outline: Delete a citizenship
    And Search for citizenship with the name "<CitizenshipName>" and shortname "<CitizenshipShortName>"
    When Delete citizenship
    Then Success message should be displayed
    Examples: Data for delete citizenship scenario
      | CitizenshipName | CitizenshipShortName |
      | USA11112        | U1                   |
      | USA22223        | U2                   |
      | USA33334        | U3                   |
      | USA44445        | U4                   |







