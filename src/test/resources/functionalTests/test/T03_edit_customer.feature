@editcustomer
Feature: EDIT CUSTOMER
  As a user
  I want to edit a customer
    So that verify Edit function work well

  Scenario: Login to system
    When enter Login info
    And click Login button at Login page

  Scenario Outline: Edit customer and check edited successfully
    Given read data EditCustomer
    And open "Edit Customer" page
    When enter CustomerID at Edit Customer page <index>
    And click "Submit" button
    And enter Edit Customer details <index>
    And click "Submit" button
    And sleep 5 seconds
    Then verify message on page "Edit Customer" displayed
    And verify Updated Customer details <index>
    And save Edit Customer Info

    Examples: Index of Customer in list
      | index |
      |     0 |
