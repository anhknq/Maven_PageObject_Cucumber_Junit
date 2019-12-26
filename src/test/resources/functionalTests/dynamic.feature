@dynamic
Feature: Bank Guru
  I want to use this template for my feature file

  Scenario: Common (Dynamic) step
    #---------------ACTION------------#
    #Textbox
    And input to "textboxName" textbox with "input value"
    #TextArea
    And input to "textAreaName" textarea with "input value"
    #DropdownList
    And select item in "dropdownName" dropdownlist with "selected value"
    #Radio Button
    And select "radioButtonValue" radio button
    #Button
    And click "buttonValue" button
    #Link & open page
    And open "Page Name" page
    And open Login page
    #Regex
    #---------------VERIFY------------#
    And verify message on page "heading table or message" displayed
    And verify alert message "" displayed and accept
    # ACCOUNT_FIRST = {Account ID, Account type, Balance}
    #---------------WAIT------------#
    And sleep 5 seconds
