package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import testData.Customer;

public class EditCustomerPageObject extends AbstractPage {
	private WebDriver driver;
	String randomEmail;

	public EditCustomerPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void enterCustomerID(String customerID) {
		inputToDynamicTextbox(driver, "cusid", customerID);
		
	}
	
	public void enterEditCustomerDetails(Customer customer) {
		randomEmail = String.format(customer.getEmail(), randomDataTest());
		inputToDynamicArea(driver, "addr", customer.getAddress());
		inputToDynamicTextbox(driver, "city", customer.getCity());
		inputToDynamicTextbox(driver, "state", customer.getState());
		inputToDynamicTextbox(driver, "pinno", customer.getPin());
		inputToDynamicTextbox(driver, "telephoneno", customer.getMobileNumber());
		inputToDynamicTextbox(driver, "emailid", randomEmail);
	}

	public void verifyRegisteredCustomerDetails(Customer customerToEdit, Customer customer) {
		isDataInTableRowEquals(driver, "Customer Name", customerToEdit.getCustomerName());
		isDataInTableRowEquals(driver, "Gender", customerToEdit.getGender());
		isDataInTableRowEquals(driver, "Birthdate", customerToEdit.getDateOfBirth());
		isDataInTableRowEquals(driver, "Address", customer.getAddress());
		isDataInTableRowEquals(driver, "City", customer.getCity());
		isDataInTableRowEquals(driver, "State", customer.getState());
		isDataInTableRowEquals(driver, "Pin", customer.getPin());
		isDataInTableRowEquals(driver, "Mobile No.", customer.getMobileNumber());
		isDataInTableRowEquals(driver, "Email", randomEmail);
	}

	public Customer getEditCustomerInfo() {
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
