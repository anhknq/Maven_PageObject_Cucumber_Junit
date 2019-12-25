@deposit
Feature: DEPOSIT
  As a user
  I want to tranfer money into an account
    So that verify deposit function work well

  Scenario: Login to system
    When enter Login info
    And click Login button at Login page

  Scenario Outline: Transfer money into a current account and check account balance equal 55,000
    Given open "Deposit" page
    When enter Deposit details <index>
    And click "Submit" button
    Then verify message on page Deposit displayed <index>
    And update Balance of Account <index>
    And verify Deposit details <index>
    And save Transaction info

    Examples: Transfer index
      | index |
      |     0 |
      |     1 |
