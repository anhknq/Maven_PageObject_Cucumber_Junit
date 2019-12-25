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
	
	#Link
	And open "Page Name" page 
	
	#Update 
	And update "<Payees>" balance increase 1000 
	And update "<Payers>" balance decrease 1000 
	And update "Account type" of Account "<index>" with "Current" 
	
	#Regex
	
	
	#---------------VERIFY------------#
	And verify message on page "heading table or message" displayed 
	And verify message "Balance Details for Account " displayed with Account ID "<index>" 
	And verify alert message "" displayed and accept 
	And verify data in table row "rowName" equals "value" 
	And verify data in table row "Customer ID" unchanged 
	And verify data in table row "Email" email 
	And verify data in table row "Date of Opening" date 
	And verify data in table row "Account ID" with "Balance" of Account "<index>" 
	# ACCOUNT_FIRST = {Account ID, Account type, Balance}
	
	#---------------WAIT------------#
	And sleep 5 seconds 
