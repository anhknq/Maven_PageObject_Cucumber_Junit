package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import testData.Account;
import testData.Customer;

public class EditAccountPageObject extends AbstractPage{
	private WebDriver driver;

	public EditAccountPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void enterAccountID(String accountID) {
		inputToDynamicTextbox(driver, "accountno", accountID);
	}

	public void enterEditAccountDetails(Account accountToEdit) {
		selectItemInDynamicDropdown(driver, "a_type", "Current");
	}

	public void verifyUpdatedAccountDetails(Customer customer, Account accountToEdit) {
		isDataInTableRowEquals(driver, "Account ID", accountToEdit.getAccountID());
		isDataInTableRowEquals(driver, "Customer ID", accountToEdit.getCustomerID());
		isDataInTableRowEquals(driver, "Customer Name", customer.getCustomerName());
		isDataInTableRowEquals(driver, "Email", customer.getEmail());
		isDataInTableRowEquals(driver, "Account Type", accountToEdit.getAccountType());
		isDataInTableRowEquals(driver, "Date of Opening", accountToEdit.getDateOfOpening());
		isDataInTableRowEquals(driver, "Current Amount", String.valueOf(accountToEdit.getCurrentAmount()));
	}

	public Account saveEditAccountInfo() {
		Account acc = new Account();
		acc.setCustomerID(getDynamicDataInTable(driver, "Customer ID"));
		acc.setAccountID(getDynamicDataInTable(driver, "Account ID"));
		acc.setAccountType(getDynamicDataInTable(driver, "Account Type"));
		acc.setDateOfOpening(getDynamicDataInTable(driver, "Date of Opening"));
		acc.setCurrentAmount(Integer.valueOf(getDynamicDataInTable(driver, "Current Amount")));
		acc.setInitialDeposit(Integer.valueOf(getDynamicDataInTable(driver, "Current Amount")));
		return acc;
	}
}
