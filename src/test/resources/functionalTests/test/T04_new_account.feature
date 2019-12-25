@newaccount
Feature: ADD NEW ACCOUNT
  As a user
  I want to create 2 new accounts
    So that verify create new account function work well

  Scenario: Login to system
    When enter Login info
    And click Login button at Login page

  Scenario Outline: Create two accounts and check created successfully, then verify 'Current Amount' and 'Initial Deposit' are equal
    Given open "New Account" page
    And enter New Account details <index>
    And click "submit" button
    Then verify message on page "New Account" displayed
    And verify Created Account details <index>
    And save New Account Info

    Examples: Index of Account in list
      | index |
      |     0 |
      |     1 |
