package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import managers.PageFactoryManager;
import pageUIs.DynamicPageUI;
import testData.User;

public class RegisterPageObject extends AbstractPage {
	WebDriver driver;

	public RegisterPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isRegisterPageDisplayed() {
		waitForElementVisible(driver, DynamicPageUI.DYNAMIC_TEXTBOX, "emailid");
		return isControlDisplayed(driver, DynamicPageUI.DYNAMIC_TEXTBOX, "emailid");
	}

	public void inputToEmailTextbox(String emailID) {
		waitForElementVisible(driver, DynamicPageUI.DYNAMIC_TEXTBOX, "emailid");
		sendKeysToElement(driver, DynamicPageUI.DYNAMIC_TEXTBOX,emailID, "emailid");
	}

	public void clickSubmitButton() {
		waitForElementVisible(driver, DynamicPageUI.DYNAMIC_TEXTBOX, "btnLogin");
		clickToElement(driver, DynamicPageUI.DYNAMIC_TEXTBOX, "btnLogin");
	}

	public String getUserIDInfo() {
		waitForElementVisible(driver, DynamicPageUI.DYNAMIC_DATA_IN_TABLE, "User ID :");
		return getTextInElement(driver, DynamicPageUI.DYNAMIC_DATA_IN_TABLE, "User ID :");
	}

	public String getPasswordInfo() {
		waitForElementVisible(driver, DynamicPageUI.DYNAMIC_DATA_IN_TABLE, "Password :");
		return getTextInElement(driver, DynamicPageUI.DYNAMIC_DATA_IN_TABLE, "Password :");
	}
	
	public LoginPageObject openLoginPageUrl(String loginPageUrl) {
		openPageUrl(driver, loginPageUrl);
		return PageFactoryManager.getLoginPage(driver);
	}
	
	public User getLoginInfo() {
		User user = new User();
		user.setUserID(getUserIDInfo());
		user.setPassword(getPasswordInfo());
		return user;
	}
}
