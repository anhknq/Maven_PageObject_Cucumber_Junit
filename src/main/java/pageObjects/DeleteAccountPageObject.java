package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class DeleteAccountPageObject extends AbstractPage {
	private WebDriver driver;

	public DeleteAccountPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void enterAccountID(String accountID) {
			inputToDynamicTextbox(driver, "accountno", accountID);
	}

}
