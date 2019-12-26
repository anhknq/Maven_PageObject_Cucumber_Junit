package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProvider.FileReaderManager;
import enums.Context;
import managers.PageFactoryManager;
import pageObjects.DeleteCustomerPageObject;
import testData.Customer;

public class DeleteCustomerPageSteps {
	WebDriver driver;
	DeleteCustomerPageObject deleteCustomerPage;
	Customer customer;
	String customerID;
	TestContext testContext;

	public DeleteCustomerPageSteps(TestContext context) {
		driver = Hooks.openAndQuitBrowser();
		deleteCustomerPage = PageFactoryManager.getDeleteCustomerPage(driver);
		testContext = context;
	}

	@When("^enter CustomerID at Delete Customer page$")
	public void enterCustomerIDAtDeleteCustomerPage() {
		customer = FileReaderManager.getInstance().getJsonReader().getCustomerInUsersByEmail(0, 0);
		customerID = customer.getCustomerID();
		deleteCustomerPage.entercustomerID(customerID);
		testContext.scenarioContext.setContext(Context.CUSTOMER_ID, customerID);
	}

	@Then("^delete customer$")
	public void deleteCustomer() {
		FileReaderManager.getInstance().getJsonWriter().deleteCustomer(customerID);
	}
}
