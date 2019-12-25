package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProvider.FileReaderManager;
import enums.Context;
import managers.PageFactoryManager;
import pageObjects.DeleteAccountPageObject;
import testData.Account;

public class DeleteAccountPageSteps {
	WebDriver driver;
	DeleteAccountPageObject deleteAccountPage;
	List<Account> accountList;
	String accountID;
	TestContext testContext;

	public DeleteAccountPageSteps(TestContext context) {
		driver = Hooks.openAndQuitBrowser();
		deleteAccountPage = PageFactoryManager.getDeleteAccountPage(driver);
		testContext = context;
	}

	@When("^enter AccountID at Delete Account page (\\d+)$")
	public void enterAccountIDAtDeleteAccountPage(int index) {
		String customerID = FileReaderManager.getInstance().getJsonReader().getCustomerByEmail(0, 0).getCustomerID();
		accountList = FileReaderManager.getInstance().getJsonReader().getAccountByCustomerID(customerID);
		System.out.println("----------"+accountList.size());
		accountID = accountList.get(0).getAccountID();
		deleteAccountPage.enterAccountID(accountList.get(index));
		testContext.scenarioContext.setContext(Context.ACCOUNT_ID, accountID);
	}

	@Then("^delete account (\\d+)$")
	public void deleteAccount(int index) {
		FileReaderManager.getInstance().getJsonWriter().deleteAccount(accountList.get(0));
	}
}
