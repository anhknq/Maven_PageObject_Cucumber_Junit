package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProvider.FileReaderManager;
import managers.PageFactoryManager;
import pageObjects.DynamicPageObject;

public class DynamicPageSteps {
	WebDriver driver;
	DynamicPageObject dynamicPage;
	TestContext testContext;

	public DynamicPageSteps(TestContext context) throws InterruptedException {
		driver = Hooks.openAndQuitBrowser();
		dynamicPage = PageFactoryManager.getDynamicPage(driver);
		testContext = context;
	}

//	 #---------------ACTION------------#
//	 #Textbox	
	@When("^input to \"([^\"]*)\" textbox with \"([^\"]*)\"$")
	public void inputToTextboxWith(String textboxName, String valueToSendKey) {
		dynamicPage.inputToDynamicTextbox(driver, textboxName, valueToSendKey);
	}

//	#TextArea	
	@When("^input to \"([^\"]*)\" textarea with \"([^\"]*)\"$")
	public void inputToTextareaWith(String textAreaName, String valueToSendKey) {
		dynamicPage.inputToDynamicArea(driver, textAreaName, valueToSendKey);
	}

//  #DropdownList	
	@When("^select item in \"([^\"]*)\" dropdownlist with \"([^\"]*)\"$")
	public void selectItemInDropdownlistWith(String dropdownName, String selectedValue) {
		dynamicPage.selectItemInDynamicDropdown(driver, dropdownName, selectedValue);
	}

//  #Radio Button	
	@When("^select \"([^\"]*)\" radio button$")
	public void selectRadioButton(String radioButtonValue) {
		dynamicPage.clickToDynamicRadioButton(driver, radioButtonValue);
	}

//	#Button	
	@When("^click \"([^\"]*)\" button$")
	public void clickButton(String buttonValue) {
		dynamicPage.clickToDynamicButton(driver, buttonValue);
	}

//	#Link & open page	
	@Given("^open \"([^\"]*)\" page$")
	public void openPage(String pageName) {
		dynamicPage.openDynamicPageLinks(driver, pageName);
	}
	
	@Given("^open Login page$")
	public void openLoginPage() {
		dynamicPage.openPageUrl(driver, FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}

//	#---------------VERIFY------------#
	@Then("^verify message on page \"([^\"]*)\" displayed$")
	public void verifyMessageOnPageDisplayed(String pageName) {
		String message = null;
		switch (pageName) {
		case "New Customer":
			message = "Customer Registered Successfully!!!";
			break;
		case "Edit Customer":
			message = "Customer details updated Successfully!!!";
			break;
		case "New Account":
			message = "Account Generated Successfully!!!";
			break;
		case "Edit Account":
			message = "Account details updated Successfully!!!";
			break;
		case "Withdrawal":
			message = "Transaction details of Withdrawal for Account ";
			break;
		case "Fund Transfer":
			message = "Fund Transfer Details";
			break;
		case "Balance Enquiry":
			message = "Balance Details for Account ";
			break;
		}
		dynamicPage.isDynamicPageOrMessageDisplayed(driver, message);
	}

	@Then("^verify alert message \"([^\"]*)\" displayed and accept$")
	public void verifyAlertMessageDisplayedAndAccept(String expectedMessage) {
		dynamicPage.isAlertDisplayedAndAcceptAlert(driver, expectedMessage);
	}

//	#---------------WAIT------------#
	@When("^sleep (\\d+) seconds$")
	public void sleepSeconds(int timeInSecond) {
		dynamicPage.sleepInSecond(driver, timeInSecond);
	}

}
