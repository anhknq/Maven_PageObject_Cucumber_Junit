package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProvider.FileReaderManager;
import managers.PageFactoryManager;
import pageObjects.NewCustomerPageObject;
import testData.Customer;
import testData.RegisterEmail;

public class NewCustomerPageSteps {

	WebDriver driver;
	NewCustomerPageObject newCustomerPage;
	List<Customer> newCustomerList;

	public NewCustomerPageSteps() throws InterruptedException {
		driver = Hooks.openAndQuitBrowser();
		newCustomerPage = PageFactoryManager.getNewCustomerPage(driver);
	}

	@Given("^read data NewCustomer_Input$")
	public void readDataNewCustomer_Input() {
		newCustomerList = FileReaderManager.getInstance().getJsonReader().getNewCustomerData();
	}

	@When("^enter New Customer details (\\d+)$")
	public void enterNewCustomerDetails(int index) {
			newCustomerPage.enterNewCustomerDetails(newCustomerList.get(index));
	}

	@Given("^save New Customer Info$")
	public void saveNewCustomerInfo() {
		Customer cus = newCustomerPage.saveNewCustomerInfo();
		RegisterEmail email = FileReaderManager.getInstance().getJsonReader().getEmailData().get(0);
		FileReaderManager.getInstance().getJsonWriter().addNewCustomer(cus, email.getEmailID());
	}

	@Then("^verify registered Customer details (\\d+)$")
	public void verifyRegisteredCustomerDetails(int index) {
		newCustomerPage.verifyRegisteredCustomerDetails(newCustomerList.get(index));
	}
}
