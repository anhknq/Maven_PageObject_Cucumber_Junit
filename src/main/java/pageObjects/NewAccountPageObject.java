package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import testData.Account;
import testData.Customer;

public class NewAccountPageObject extends AbstractPage {
	private WebDriver driver;

	public NewAccountPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void enterCustomerID(String customerID) {
		inputToDynamicTextbox(driver, "cusid", customerID);
	}

	public void enterNewAccountDetails(String customerID, Account account) {
		inputToDynamicTextbox(driver, "cusid", customerID);
		selectItemInDynamicDropdown(driver, "selaccount", account.getAccountType());
		inputToDynamicTextbox(driver, "inideposit", String.valueOf(account.getInitialDeposit()));
	}

	public void verifyCreatedAccountDetails(Customer firstCustomer, Account account) {
		isDataInTableRowEquals(driver, "Customer ID", firstCustomer.getCustomerID());
		isDataInTableRowEquals(driver, "Customer Name", firstCustomer.getCustomerName());
		isDataInTableRowEquals(driver, "Email", firstCustomer.getEmail());
		isDataInTableRowEquals(driver, "Account Type", account.getAccountType());
		isDataInTableRowEquals(driver, "Date of Opening", getCurrentDay());
		isDataInTableRowEquals(driver, "Current Amount", String.valueOf(account.getInitialDeposit()));
	}

	public Account saveNewAccountInfo() {
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
