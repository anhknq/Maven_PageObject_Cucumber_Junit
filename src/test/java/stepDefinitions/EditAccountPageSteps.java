package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProvider.FileReaderManager;
import enums.Context;
import managers.PageFactoryManager;
import pageObjects.EditAccountPageObject;
import testData.Account;
import testData.Customer;

public class EditAccountPageSteps {
	WebDriver driver;
	EditAccountPageObject editAccountPage;
	Account accountToEdit;
	TestContext testContext;

	public EditAccountPageSteps(TestContext context) {
		driver = Hooks.openAndQuitBrowser();
		editAccountPage = PageFactoryManager.getEditAccountPage(driver);
		testContext = context;
	}
       	
	@Given("^enter AccountID at Edit Account page$")
	public void enterAccountIDAtEditAccountPage() {
		accountToEdit = FileReaderManager.getInstance().getJsonReader().getAccountData().get(0);
		editAccountPage.enterAccountID(accountToEdit.getAccountID());
	}

	@Given("^enter Deleted AccountID at Edit Account page$")
	public void enterDeletedAccountIDAtEditAccountPage() {
		editAccountPage.enterAccountID((String) testContext.scenarioContext.getContext(Context.ACCOUNT_ID));
	}
	
	@When("^enter Edit Account details$")
	public void enterEditAccountDetails() {
		editAccountPage.enterEditAccountDetails(accountToEdit);
	}

	@Then("^verify Updated Account details$")
	public void verifyUpdatedAccountDetails() {
		Customer customer = FileReaderManager.getInstance().getJsonReader().getCustomerByCustomerID(accountToEdit.getCustomerID());
		editAccountPage.verifyUpdatedAccountDetails(customer,accountToEdit);
	}

	@Then("^save Edit Account Info$")
	public void saveEditAccountInfo() {
		Account acc = editAccountPage.saveEditAccountInfo();
		FileReaderManager.getInstance().getJsonWriter().updateEditAccount(acc, acc.getAccountID());
	}

}
