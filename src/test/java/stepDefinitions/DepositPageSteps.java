package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
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
	Account firstAccount;
	String firstAccountID;

	public DepositPageSteps() {
		driver = Hooks.openAndQuitBrowser();
		depositPage = PageFactoryManager.getDepositPage(driver);
	}

	@Given("^read data Transaction input$")
	public void readDataTransactionInput() {
		transList = FileReaderManager.getInstance().getJsonReader().getTransactionInput();
		firstAccount = FileReaderManager.getInstance().getJsonReader().getAccountsData().get(0);
		firstAccountID = firstAccount.getAccountID();
	}
	
	@When("^enter Deposit details (\\d+)$")
	public void enterDepositDetails(int index) {
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
		int balance = depositPage.updateBalanceIncrease(firstAccount, transList.get(index));
		FileReaderManager.getInstance().getJsonWriter().updateBalance(firstAccountID,balance);
	}

	@Then("^save Transaction info$")
	public void saveTransactionInfo() {
		Transaction trans = depositPage.getDepositInfo();
		FileReaderManager.getInstance().getJsonWriter().addNewTransaction(trans);
	}

}
