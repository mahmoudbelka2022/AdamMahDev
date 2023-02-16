Feature: Sign up Functionality

  Scenario: Successful User Sign Up
    Given I am on the sign up page
    When User enters firstname lastname email password and number
    And User click on sign up button
    Then I should see a success message