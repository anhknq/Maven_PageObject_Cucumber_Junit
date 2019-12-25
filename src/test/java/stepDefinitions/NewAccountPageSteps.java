package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProvider.FileReaderManager;
import managers.PageFactoryManager;
import pageObjects.NewAccountPageObject;
import testData.Account;
import testData.Customer;

public class NewAccountPageSteps{
	WebDriver driver;
	NewAccountPageObject newAccountPage;
	List<Account> newAccountList;
	String customerID;
	Customer firstCustomer;

	public NewAccountPageSteps() {
		driver = Hooks.openAndQuitBrowser();
		newAccountPage = PageFactoryManager.getNewAccountPage(driver);
	}
	
	@When("^enter New Account details (\\d+)$")
	public void enterNewAccountDetails(int index) {
		customerID = FileReaderManager.getInstance().getJsonReader().getCustomerIDByEmail(0, 0);
		newAccountList = FileReaderManager.getInstance().getJsonReader().getNewAccountData();
		newAccountPage.enterNewAccountDetails(customerID,newAccountList.get(index));
	}

	@Then("^verify Created Account details (\\d+)$")
	public void verifyCreatedAccountDetails(int index) {
		firstCustomer = FileReaderManager.getInstance().getJsonReader().getCustomerByEmail(0, 0);
		newAccountPage.verifyCreatedAccountDetails(firstCustomer,newAccountList.get(index));
	}

	@Then("^save New Account Info$")
	public void saveNewAccountInfo() {
		Account account = newAccountPage.saveNewAccountInfo();
		FileReaderManager.getInstance().getJsonWriter().addNewAccount(account);
	}

}
