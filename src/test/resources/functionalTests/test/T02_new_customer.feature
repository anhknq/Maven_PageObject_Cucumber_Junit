@newcustomer
Feature: ADD NEW CUSTOMER
  As a user
  I want to create a new customer
    So that verify create new customer function work well

  Scenario: Login to system
    When enter Login info
    And click Login button at Login page

  Scenario Outline: Create new customer and check created successfully
    Given read data NewCustomer_Input
    And open "New Customer" page
    When enter New Customer details <index>
    And click "Submit" button
    And sleep 3 seconds
    Then verify message on page "New Customer" displayed
    And verify registered Customer details <index>
    And save New Customer Info

    Examples: Index of Customer in list
      | index |
      |     0 |
