package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.DynamicPageUI;
import testData.Customer;

public class NewCustomerPageObject extends AbstractPage{
	WebDriver driver;
	String randomEmail;
	
	public NewCustomerPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public void inputToDayOfBirth(String dateOfBirth) {
		waitForElementVisible(driver, DynamicPageUI.DYNAMIC_TEXTBOX, "dob");
		removeAtribute(driver, "type", DynamicPageUI.DYNAMIC_TEXTBOX, "dob");
		sendKeysToElement(driver, DynamicPageUI.DYNAMIC_TEXTBOX, dateOfBirth, "dob");
	}
	
	public String getCustomerIDInTable(WebDriver driver) {
		waitForElementVisible(driver, DynamicPageUI.DYNAMIC_DATA_IN_TABLE, "Customer ID");
		return getTextInElement(driver, DynamicPageUI.DYNAMIC_DATA_IN_TABLE, "Customer ID");
	}
	
	public void enterNewCustomerDetails(Customer customer) {
		randomEmail = String.format(customer.getEmail(), randomDataTest());
		inputToDynamicTextbox(driver, "name", customer.getCustomerName());
		clickToDynamicRadioButton(driver, customer.getGender());
		inputToDayOfBirth(customer.getDateOfBirth());
		inputToDynamicArea(driver, "addr", customer.getAddress());
		inputToDynamicTextbox(driver, "city", customer.getCity());
		inputToDynamicTextbox(driver, "state", customer.getState());
		inputToDynamicTextbox(driver, "pinno", customer.getPin());
		inputToDynamicTextbox(driver, "telephoneno", customer.getMobileNumber());
		inputToDynamicTextbox(driver, "emailid", randomEmail);
		inputToDynamicTextbox(driver, "password", customer.getPassword());
	}
	
	public void verifyRegisteredCustomerDetails(Customer customer) {
		isDataInTableRowEquals(driver, "Customer Name", customer.getCustomerName());
		isDataInTableRowEquals(driver, "Gender", customer.getGender());
		isDataInTableRowEquals(driver, "Birthdate", customer.getDateOfBirth());
		isDataInTableRowEquals(driver, "Address", customer.getAddress());
		isDataInTableRowEquals(driver, "City", customer.getCity());
		isDataInTableRowEquals(driver, "State", customer.getState());
		isDataInTableRowEquals(driver, "Pin", customer.getPin());
		isDataInTableRowEquals(driver, "Mobile No.", customer.getMobileNumber());
		isDataInTableRowEquals(driver, "Email", randomEmail);
	}
	
	public Customer saveNewCustomerInfo() {
		Customer customer = new Customer();
		customer.setCustomerID(getDynamicDataInTable(driver, "Customer ID"));
		customer.setCustomerName(getDynamicDataInTable(driver, "Customer Name"));
		customer.setGender(getDynamicDataInTable(driver, "Gender"));
		customer.setDateOfBirth(getDynamicDataInTable(driver, "Birthdate"));
		customer.setAddress(getDynamicDataInTable(driver, "Address"));
		customer.setCity(getDynamicDataInTable(driver, "City"));
		customer.setState(getDynamicDataInTable(driver, "State"));
		customer.setPin(getDynamicDataInTable(driver, "Pin"));
		customer.setMobileNumber(getDynamicDataInTable(driver, "Mobile No."));
		customer.setEmail(getDynamicDataInTable(driver, "Email"));
		return customer;
	}
}
