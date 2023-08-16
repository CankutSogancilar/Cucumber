Feature: Entrance Exams Functionality

  Background:
    Given Navigate to Campus
    And Enter username and password
    And Click on Login Button

  Scenario Outline: Create an Entrance exam
    And Go to Entrance Exams page
    And Click on add button
    And Fill the Create Exam Form with
      | <Exam Name> |
    And Create a description
      | <Description> |
    And Create a note
      | <Note> |
    When Click on save button
    Then Success message should be displayed
    Examples: Data for Create Entrance Exam Scenario
      | Exam Name       | Description        | Note                              |
      | Edasss 80008     | Eda 88             | We are coming to the market soon. |
      | Edasss 80880008   | Eda 88 rocks       | Get prepared .                    |
      | Edasss 80000888  | Eda 88 is best     | Cankut doesn't give up .          |
      | Edasss 800800888 | i am almost ready. | We will be better than anyone .   |


