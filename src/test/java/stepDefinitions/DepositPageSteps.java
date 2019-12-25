package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProvider.FileReaderManager;
import managers.PageFactoryManager;
import pageObjects.DepositPageObject;
import testData.Account;
import testData.Transaction;

public class DepositPageSteps {
	WebDriver driver;
	DepositPageObject depositPage;
	List<Transaction> transList;
	String firstAccountID;

	public DepositPageSteps() {
		driver = Hooks.openAndQuitBrowser();
		depositPage = PageFactoryManager.getDepositPage(driver);
	}

	@When("^enter Deposit details (\\d+)$")
	public void enterDepositDetails(int index) {
		transList = FileReaderManager.getInstance().getJsonReader().getTransactionInput();
		firstAccountID = FileReaderManager.getInstance().getJsonReader().getAccountData().get(0).getAccountID();
		depositPage.enterDepositDetails(firstAccountID, transList.get(index));
	}

	@Then("^verify message on page Deposit displayed (\\d+)$")
	public void verifyMessageOnPageDepositDisplayed(int index) {
		depositPage.isSuccessMessageDisplayed(firstAccountID);
	}

	@Then("^verify Deposit details (\\d+)$")
	public void verifyDepositDetails(int index) {
		depositPage.verifyDepositDetails(firstAccountID, transList.get(index));
	}

	@Then("^update Balance of Account (\\d+)$")
	public void updateBalanceOfAccount(int index) {
		Account acc = FileReaderManager.getInstance().getJsonReader().getAccountByAccountID(firstAccountID);
		int balance = depositPage.updateBalanceIncrease(acc, transList.get(index));
		FileReaderManager.getInstance().getJsonWriter().updateBalance(firstAccountID,balance);
		System.out.println("balance-------------"+balance);
	}

	@Then("^save Transaction info$")
	public void saveTransactionInfo() {
		Transaction trans = depositPage.saveDepositInfo();
		FileReaderManager.getInstance().getJsonWriter().addNewTransaction(trans);
	}

}
