@register
Feature: REGISTER
  As a user
  I want to register an account
  So that verify register function work well

  Scenario: Register and Login to system
    Given get Login page Url
    When click Here link
    Then verify Register page displayed
    When read data RegisterEmail
    And enter email
    And click Submit button at Register page
    Then get Login info
    Given open Login page
    When enter Login info
    And click Login button at Login page
