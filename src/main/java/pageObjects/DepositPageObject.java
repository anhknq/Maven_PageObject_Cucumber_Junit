package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import testData.Account;
import testData.Transaction;

public class DepositPageObject extends AbstractPage {
	private WebDriver driver;
	int balance;

	public DepositPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void enterDepositDetails(String accountID, Transaction transaction) {
		inputToDynamicTextbox(driver, "accountno", accountID);
		inputToDynamicTextbox(driver, "ammount", String.valueOf(transaction.getAmount()));
		inputToDynamicTextbox(driver, "desc", transaction.getDescription());
	}

	public void isSuccessMessageDisplayed(String accountID) {
		isDynamicPageOrMessageDisplayed(driver, "Transaction details of Deposit for Account " + accountID);
	}

	public int updateBalanceIncrease(Account acc, Transaction trans) {
		balance = acc.getCurrentAmount()+trans.getAmount();
		return balance;
	}
	
	public void verifyDepositDetails(String accountID,Transaction trans) {
		isDataInTableRowEquals(driver, "Account No", accountID);
		isDataInTableRowEquals(driver, "Amount Credited", String.valueOf(trans.getAmount()));
		isDataInTableRowEquals(driver, "Type of Transaction", "Deposit");
		isDataInTableRowEquals(driver, "Description", trans.getDescription());
		isDataInTableRowEquals(driver, "Current Balance", String.valueOf(balance));
	}

	public Transaction saveDepositInfo() {
		Transaction trans = new Transaction();
		trans.setTransactionID(getDynamicDataInTable(driver, "Transaction ID"));
		trans.setAccountID(getDynamicDataInTable(driver, "Account No"));
		trans.setAmount(Integer.parseInt(getDynamicDataInTable(driver, "Amount Credited")));
		trans.setTransactionType(getDynamicDataInTable(driver, "Type of Transaction"));
		trans.setDescription(getDynamicDataInTable(driver, "Description"));
		return trans;
	}


}
