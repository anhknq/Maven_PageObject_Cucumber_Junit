@deletecustomer
Feature: DELETE CUSTOMER
  As a user
  I want to delete a customer
    So that verify edit customer function work well

  Scenario: Login to system
    When enter Login info
    And click Login button at Login page

  @paymentflow
  Scenario: Delete first customer and check deleted successfully
    Given open "Delete Customer" page
    When enter CustomerID at Delete Customer page
    And click "Submit" button
    Then verify alert message "Do you really want to delete this Customer?" displayed and accept
    And verify alert message "Customer deleted Successfully" displayed and accept
    And delete customer
    Given open "Edit Customer" page
    When enter Deleted CustomerID at Edit Customer page
    And click "Submit" button
    Then verify alert message "Customer does not exist!!" displayed and accept
