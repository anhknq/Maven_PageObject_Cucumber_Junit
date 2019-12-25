package stepDefinitions;

import org.openqa.selenium.WebDriver;

import enums.Context;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.PageFactoryManager;
import pageObjects.DynamicPageObject;
import shareContexts.ShareDataContext;

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

//	#Link	
	@Given("^open \"([^\"]*)\" page$")
	public void openPage(String pageName) {
		dynamicPage.openDynamicPageLinks(driver, pageName);
	}

//	#Update
	@Then("^update \"([^\"]*)\" balance increase (\\d+)$")
	public void updateBalanceIncrease(String index, int amount) {
		// fieldToUpdate : = {Account ID, Account type, Balance}
		int balance;
		if (index.equalsIgnoreCase("First")) {
			balance = Integer.parseInt(ShareDataContext.ACCOUNT_FIRST.get("Balance")) + amount;
			ShareDataContext.ACCOUNT_FIRST.replace("Balance", String.valueOf(balance));
		} else if (index.equalsIgnoreCase("Second")) {
			balance = Integer.parseInt(ShareDataContext.ACCOUNT_SECOND.get("Balance")) + amount;
			ShareDataContext.ACCOUNT_SECOND.replace("Balance", String.valueOf(balance));
		}
	}

	@Then("^update \"([^\"]*)\" balance decrease (\\d+)$")
	public void updateBalanceDecrease(String index, int amount) {
		// fieldToUpdate : = {Account ID, Account type, Balance}
		int balance;
		try {
			if (index.equalsIgnoreCase("First")) {
				balance = Integer.parseInt(ShareDataContext.ACCOUNT_FIRST.get("Balance")) - amount;
				ShareDataContext.ACCOUNT_FIRST.replace("Balance", String.valueOf(balance));
			} else if (index.equalsIgnoreCase("Second")) {
				balance = Integer.parseInt(ShareDataContext.ACCOUNT_SECOND.get("Balance")) - amount;
				ShareDataContext.ACCOUNT_SECOND.replace("Balance", String.valueOf(balance));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("^update \"([^\"]*)\" of Account \"([^\"]*)\" with \"([^\"]*)\"$")
	public void updateOfAccountWith(String fieldName, String index, String valueToUpdate) {
		if (index.equalsIgnoreCase("First")) {
			ShareDataContext.ACCOUNT_FIRST.replace(fieldName, valueToUpdate);
		} else if (index.equalsIgnoreCase("Second")) {
			ShareDataContext.ACCOUNT_SECOND.replace(fieldName, valueToUpdate);
		}
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

	@Then("^verify message \"([^\"]*)\" displayed with Account ID \"([^\"]*)\"$")
	public void verifyMessageDisplayedWithAccountID(String message, String index) {
		if (index.equalsIgnoreCase("First")) {
			message = message + ShareDataContext.ACCOUNT_FIRST.get("Account ID");
		} else if (index.equalsIgnoreCase("Second")) {
			message = message + ShareDataContext.ACCOUNT_SECOND.get("Account ID");
		}
		dynamicPage.isDynamicPageOrMessageDisplayed(driver, message);
	}

	@Then("^verify alert message \"([^\"]*)\" displayed and accept$")
	public void verifyAlertMessageDisplayedAndAccept(String expectedMessage) {
		dynamicPage.isAlertDisplayedAndAcceptAlert(driver, expectedMessage);
	}

	@Then("^verify data in table row \"([^\"]*)\" equals \"([^\"]*)\"$")
	public void verifyDataInTableRowEquals(String rowName, String expectedValue) {
		dynamicPage.isDataInTableRowEquals(driver, rowName, expectedValue);
	}

	@Then("^verify data in table row \"([^\"]*)\" unchanged$")
	public void verifyDataInTableRowUnchanged(String rowName) {
		String expectedValue = "";
		if (rowName.equalsIgnoreCase("Customer ID")) {
			expectedValue = ShareDataContext.CUSTOMER_FIX_INFO.get("Customer ID");
		} else if (rowName.equalsIgnoreCase("Customer Name")) {
			expectedValue = ShareDataContext.CUSTOMER_FIX_INFO.get("Customer Name");
		} else if (rowName.equalsIgnoreCase("Gender")) {
			expectedValue = ShareDataContext.CUSTOMER_FIX_INFO.get("Gender");
		} else if (rowName.equalsIgnoreCase("Birthdate")) {
			expectedValue = ShareDataContext.CUSTOMER_FIX_INFO.get("Date of Birth");
		}

		dynamicPage.isDataInTableRowEquals(driver, rowName, expectedValue);
	}

	@Then("^verify data in table row \"([^\"]*)\" email$")
	public void verifyDataInTableRowEmail(String rowName) {
		String expectedEmail = (String) testContext.scenarioContext.getContext(Context.EMAIL_ID);
		dynamicPage.isDataInTableRowEquals(driver, rowName, expectedEmail);
	}

	@Then("^verify data in table row \"([^\"]*)\" date$")
	public void verifyDataInTableRowDate(String rowName) {
		dynamicPage.isDataInTableRowEquals(driver, rowName, dynamicPage.getToday());
	}

	@Then("^verify data in table row \"([^\"]*)\" with \"([^\"]*)\" of Account \"([^\"]*)\"$")
	public void verifyDataInTableRowWithFieldOfAccount(String rowName, String value, String index) {
		String expectedValue = "";
		if (index.equalsIgnoreCase("First")) {
			expectedValue = ShareDataContext.ACCOUNT_FIRST.get(value);
		} else if (index.equalsIgnoreCase("Second")) {
			expectedValue = ShareDataContext.ACCOUNT_SECOND.get(value);
		}
		dynamicPage.isDataInTableRowEquals(driver, rowName, expectedValue);
	}

//	#---------------WAIT------------#
	@When("^sleep (\\d+) seconds$")
	public void sleepSeconds(int timeInSecond) {
		dynamicPage.sleepInSecond(driver, timeInSecond);
	}

}
