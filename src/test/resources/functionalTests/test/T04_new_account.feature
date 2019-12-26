@newaccount
Feature: ADD NEW ACCOUNT
  As a user
  I want to create 2 new accounts
    So that verify create new account function work well

  Scenario: Login to system
    When enter Login info
    And click Login button at Login page

  @paymentflow
  Scenario Outline: Create two accounts and check created successfully, then verify 'Current Amount' and 'Initial Deposit' are equal
    Given read data NewAccount
    And open "New Account" page
    When enter New Account details <index>
    And click "submit" button
    Then verify message on page "New Account" displayed
    And verify Created Account details <index>
    And save New Account Info

    Examples: Index of Account in list
      | index |
      |     0 |
      |     1 |
#each row 'index' = 1 new account
#total of rows 'index' must <= with total of records in NewAccount.json
#or it will throw error 'out of boundary'