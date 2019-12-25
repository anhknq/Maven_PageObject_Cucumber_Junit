package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import testData.Account;

public class DeleteAccountPageObject extends AbstractPage {
	private WebDriver driver;

	public DeleteAccountPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void enterAccountID(Account account) {
			inputToDynamicTextbox(driver, "accountno", account.getAccountID());
	}

}
