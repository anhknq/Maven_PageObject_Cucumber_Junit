@payment
Feature: PAYMENT FLOW
  As a user
  I want to create a new customer and edit this customer
  I want to create new accounts for this customer and edit these accounts
  I want to transfer and withdraw money between these accounts and check account balance
  Finally, I want to delete these accounts and this customer.
    So that verify all functions above work well

  Scenario: Register and Login to system
    Given I get Login page Url
    And I click to Here link
    Then Verify Register page displayed
    When I input to EmailID textbox with random email
    And I click to Submit button at Register page
    Then I get Login info
    Given I open Login page again
    And I fill in Login form
    And I click to Login button at Login page

  Scenario Outline: Create new customer account and check created successfully
    Given I open "New Customer" page
    When I input to "name" textbox with data "<Customer Name>"
    And I select "f" radio button
    And I input to Date of Birth textbox with data "<Date of Birth>"
    And I input to "addr" textarea with data "<Address>"
    And I input to "city" textbox with data "<City>"
    And I input to "state" textbox with data "<State>"
    And I input to "pinno" textbox with data "<PIN>"
    And I input to "telephoneno" textbox with data "<Mobile Number>"
    And I input to "emailid" textbox with "1" random email "<E-mail>"
    # 0 = fix value | 1 = random but no space | 2 = random but no special characters
    And I input to "password" textbox with data "<Password>"
    And I sleep in "10" seconds
    And I click to "Submit" button
    Then Verify message "Customer Registered Successfully!!!" displayed success
    And Verify data in table row "Customer Name" equals "<Customer Name>"
    And Verify data in table row "Gender" equals "<Gender>"
    And Verify data in table row "Birthdate" equals "<Date of Birth>"
    And Verify data in table row "Address" equals "<Address>"
    And Verify data in table row "City" equals "<City>"
    And Verify data in table row "State" equals "<State>"
    And Verify data in table row "Pin" equals "<PIN>"
    And Verify data in table row "Mobile No." equals "<Mobile Number>"
    And Verify data in table row "Email" email
    And I get Customer Info
      | Customer Name   | Gender   | Date of Birth   |
      | <Customer Name> | <Gender> | <Date of Birth> |

    Examples: New customer info
      | Customer Name | Gender | Date of Birth | Address                     | City  | State | PIN    | Mobile Number | E-mail                    | Password   |
      | Ann           | female | 1989-01-01    | PO Box 911 8331 Duis Avenue | Tampa | FL    | 466250 |    4555442476 | automation%s!!!@gmail.com | automation |

  Scenario Outline: Edit Customer account and check edited successfully
    Given I open "Edit Customer" page
    Then Verify message "Edit Customer Form" displayed success
    When I input to "cusid" textbox with CustomerID
    And I click to "Submit" button
    Then Verify message "Edit Customer" displayed success
    When I input to "addr" textarea with data "<Address>"
    And I input to "city" textbox with data "<City>"
    And I input to "state" textbox with data "<State>"
    And I input to "pinno" textbox with data "<PIN>"
    And I input to "telephoneno" textbox with data "<Mobile Number>"
    And I input to "emailid" textbox with "1" random email "<E-mail>"
    And I sleep in "10" seconds
    And I click to "Submit" button
    Then Verify message "Customer details updated Successfully!!!" displayed success
    And Verify data in table row "Customer ID" unchanged
    And Verify data in table row "Customer Name" unchanged
    And Verify data in table row "Gender" unchanged
    And Verify data in table row "Birthdate" unchanged
    And Verify data in table row "Address" equals "<Address>"
    And Verify data in table row "City" equals "<City>"
    And Verify data in table row "State" equals "<State>"
    And Verify data in table row "Pin" equals "<PIN>"
    And Verify data in table row "Mobile No." equals "<Mobile Number>"
    And Verify data in table row "Email" email

    Examples: Edit customer info
      | Address            | City    | State | PIN    | Mobile Number | E-mail                     |
      | 1883 Cursus Avenue | Houston | Texas | 166455 |    5555442476 | new_automation%s@gmail.com |

  Scenario Outline: Create two accounts and check created successfully, then verify 'Current Amount' and 'Initial Deposit' are equal
    Given I open "New Account" page
    Then Verify message "Add new account form" displayed success
    When I input to "cusid" textbox with CustomerID
    And I select item in "selaccount" dropdownlist with data "<Account type>"
    And I input to "inideposit" textbox with data "<Initial deposit>"
    And I click to "submit" button
    Then Verify message "Account Generated Successfully!!!" displayed success
    And Verify data in table row "Customer ID" unchanged
    And Verify data in table row "Customer Name" unchanged
    And Verify data in table row "Email" email
    And Verify data in table row "Account Type" equals "<Account type>"
    And Verify data in table row "Date of Opening" date
    And Verify data in table row "Current Amount" equals "<Initial deposit>"
    And I get Account Info
      | index   | Account type   | Initial deposit   |
      | <index> | <Account type> | <Initial deposit> |

    Examples: New account info
      | index  | Account type | Initial deposit |
      | First  | Savings      |           50000 |
      | Second | Savings      |           10000 |

  Scenario Outline: Edit first account and check type of Account is 'Current'
    Given I open "Edit Account" page
    Then Verify message "Edit Account Form" displayed success
    When I input to "accountno" textbox with Account ID "<index>"
    And I click to "Submit" button
    Then Verify message "Edit Account Entry Form" displayed success
    When I select item in "a_type" dropdownlist with data "<Account type>"
    And I click to "Submit" button
    Then Verify message "Account details updated Successfully!!!" displayed success
    And I update field "Account type" of Account "<index>" with data "<Account type>"
    And Verify data in table row "Account ID" with field "Account ID" of Account "<index>"
    And Verify data in table row "Customer ID" unchanged
    And Verify data in table row "Customer Name" unchanged
    And Verify data in table row "Email" email
    And Verify data in table row "Account Type" equals "<Account type>"
    And Verify data in table row "Date of Opening" date
    And Verify data in table row "Current Amount" with field "Balance" of Account "<index>"

    Examples: Edit account info
      | index | Account type |
      | First | Current      |

  Scenario Outline: Transfer money into a current account and check account balance equal 55,000
    Given I open "Deposit" page
    Then Verify message "Amount Deposit Form" displayed success
    And I input to "accountno" textbox with Account ID "<index>"
    And I input to "ammount" textbox with data "<Amount>"
    And I input to "desc" textbox with data "<Description>"
    And I click to "Submit" button
    Then Verify message "Transaction details of Deposit for Account " displayed success with Account ID "<index>"
    And I update Balance of Account "<Payees account no>" increase <Amount>
    And Verify data in table row "Account No" with field "Account ID" of Account "<index>"
    And Verify data in table row "Amount Credited" equals "<Amount>"
    And Verify data in table row "Type of Transaction" equals "Deposit"
    And Verify data in table row "Description" equals "<Description>"
    And Verify data in table row "Current Balance" with field "Balance" of Account "<index>"

    Examples: Transfer info
      | index | Amount | Description |
      | First |   5000 | deposit     |

  Scenario Outline: Withdraw money from a current account and check account balance equal 40,000
    Given I open "Withdrawal" page
    Then Verify message "Amount Withdrawal Form" displayed success
    When I input to "accountno" textbox with Account ID "<index>"
    And I input to "ammount" textbox with data "<Amount>"
    And I input to "desc" textbox with data "<Description>"
    And I click to "Submit" button
    Then Verify message "Transaction details of Withdrawal for Account " displayed success with Account ID "<index>"
    And I update Balance of Account "<Payers account no>" decrease <Amount>

    Examples: Withdraw info
      | index | Amount | Description |
      | First |  15000 | withdraw    |

  Scenario Outline: Transfer the money into another account and check transfer amount equal 10,000
    Given I open "Fund Transfer" page
    Then Verify message "Fund transfer" displayed success
    When I input to "payersaccount" textbox with Account ID "<Payers account no>"
    And I input to "payeeaccount" textbox with Account ID "<Payees account no>"
    And I input to "ammount" textbox with data "<Amount>"
    And I input to "desc" textbox with data "<Description>"
    And I click to "Submit" button
    Then Verify message "Fund Transfer Details" displayed success
    And I update Balance of Account "<Payers account no>" decrease <Amount>
    And I update Balance of Account "<Payees account no>" increase <Amount>
    And Verify data in table row "From Account Number" with field "Account ID" of Account "Payers account no"
    And Verify data in table row "To Account Number" with field "Account ID" of Account "Payees account no"
    And Verify data in table row "Amount" equals "<Amount>"
    And Verify data in table row "Description" equals "<Description>"

    Examples: 
      | Payers account no | Payees account no | Amount | Description |
      | First             | Second            |  10000 | Transfer    |

  Scenario Outline: Check current account balance equal 30,000
    Given I open "Balance Enquiry" page
    Then Verify message "Balance Enquiry Form" displayed success
    When I input to "accountno" textbox with Account ID "<index>"
    And I click to "Submit" button
    Then Verify message "Balance Details for Account " displayed success with Account ID "<index>"
    And Verify data in table row "Account No" with field "Account ID" of Account "<index>"
    And Verify data in table row "Type of Account" with field "Account type" of Account "<index>"
    And Verify data in table row "Balance" with field "Balance" of Account "<index>"

    Examples: 
      | index |
      | First |

  Scenario Outline: Delete all account of this customer account and check deleted successfully
    Given I open "Delete Account" page
    Then Verify message "Delete Account Form" displayed success
    When I input to "accountno" textbox with Account ID "<index>"
    And I click to "Submit" button
    Then Verify alert message "Do you really want to delete this Account?" displayed and accept
    And Verify alert message "Account Deleted Sucessfully" displayed and accept
    Given I open "Edit Account" page
    Then Verify message "Edit Account Form" displayed success
    When I input to "accountno" textbox with Account ID "<index>"
    And I click to "Submit" button
    Then Verify alert message "Account does not exist" displayed and accept

    Examples: 
      | index  |
      | First  |
      | Second |

  Scenario: Delete exist customer account and check deleted successfully
    Given I open "Delete Customer" page
    Then Verify message "Delete Customer Form" displayed success
    When I input to "cusid" textbox with CustomerID
    And I click to "Submit" button
    Then Verify alert message "Do you really want to delete this Customer?" displayed and accept
    Then Verify alert message "Customer deleted Successfully" displayed and accept
    Given I open "Edit Customer" page
    Then Verify message "Edit Customer Form" displayed success
    When I input to "cusid" textbox with CustomerID
    And I click to "Submit" button
    Then Verify alert message "Customer does not exist!!" displayed and accept
