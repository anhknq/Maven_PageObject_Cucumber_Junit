@deleteaccount
Feature: DELETE ACCOUNT
  As a user
  I want to delete accounts
    So that verify delete account function work well

  Scenario: Login to system
    When enter Login info
    And click Login button at Login page

  @paymentflow
  Scenario Outline: Delete all account of an customer and check deleted successfully
    #delete all accounts of 1st customer of 1st email in list User
    Given open "Delete Account" page
    When enter AccountID at Delete Account page
    And click "Submit" button
    Then verify alert message "Do you really want to delete this Account?" displayed and accept
    And verify alert message "Account Deleted Sucessfully" displayed and accept
    And delete account
    Given open "Edit Account" page
    When enter Deleted AccountID at Edit Account page
    And click "Submit" button
    Then verify alert message "Account does not exist" displayed and accept

    Examples: Account index
      | index |
      |     0 |
      |     1 |
