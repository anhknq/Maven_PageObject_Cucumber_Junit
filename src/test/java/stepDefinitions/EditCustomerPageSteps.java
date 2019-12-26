package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProvider.FileReaderManager;
import enums.Context;
import managers.PageFactoryManager;
import pageObjects.EditCustomerPageObject;
import testData.Customer;

public class EditCustomerPageSteps {

	WebDriver driver;
	EditCustomerPageObject editCustomerPage;
	List<Customer> editCustomerList;
	Customer customerToEdit;
	TestContext testContext;

	public EditCustomerPageSteps(TestContext context) {
		driver = Hooks.openAndQuitBrowser();
		editCustomerPage = PageFactoryManager.getEditCustomerPage(driver);
		testContext = context;
	}

	@Given("^read data EditCustomer$")
	public void readDataEditCustomer() {
		editCustomerList = FileReaderManager.getInstance().getJsonReader().getEditCustomerData();
	}
	
	@When("^enter CustomerID at Edit Customer page (\\d+)$")
	public void enterCustomerIDAtEditCustomerPage(int indexOfCustomerInList) {
		customerToEdit = FileReaderManager.getInstance().getJsonReader().getCustomerInUsersByEmail(0, indexOfCustomerInList);
		editCustomerPage.enterCustomerID(customerToEdit.getCustomerID());
	}
	
	@Given("^enter Deleted CustomerID at Edit Customer page$")
	public void enterDeletedCustomerIDAtEditCustomerPage() {
		editCustomerPage.enterCustomerID((String) testContext.scenarioContext.getContext(Context.CUSTOMER_ID));
	}

	@When("^enter Edit Customer details (\\d+)$")
	public void enterEditCustomerDetails(int index) {
		editCustomerPage.enterEditCustomerDetails(editCustomerList.get(index));
	}

	@Then("^verify Updated Customer details (\\d+)$")
	public void verifyUpdatedCustomerDetails(int index) {
		editCustomerPage.verifyRegisteredCustomerDetails(customerToEdit, editCustomerList.get(index));
	}
	
	@Then("^save Edit Customer Info$")
	public void saveEditCustomerInfo() {
		Customer cus = editCustomerPage.getEditCustomerInfo();
		FileReaderManager.getInstance().getJsonWriter().updateEditCustomer(cus, cus.getCustomerID());
	}

}
