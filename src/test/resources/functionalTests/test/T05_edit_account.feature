@editaccount
Feature: EDIT ACCOUNT
  As a user
  I want to edit an account
    So that verify edit account function work well

  Scenario: Login to system
    When enter Login info
    And click Login button at Login page

  @paymentflow
  Scenario: Edit first account and check type of Account is 'Current'
    Given open "Edit Account" page
    And enter AccountID at Edit Account page
    And click "Submit" button
    When enter Edit Account details
    And click "Submit" button
    And sleep 5 seconds
    Then verify message on page "Edit Account" displayed
    And verify Updated Account details
    And save Edit Account Info
