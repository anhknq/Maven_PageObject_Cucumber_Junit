package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import managers.PageFactoryManager;
import pageUIs.DynamicPageUI;
import testData.User;

public class LoginPageObject extends AbstractPage {
	private WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String getLoginPageUrl() {
		return getPageUrl(driver);
	}

	public boolean isLoginPageDisplayed() {
		waitForElementVisible(driver, DynamicPageUI.DYNAMIC_MENU_LINK, "here");
		return isControlDisplayed(driver, DynamicPageUI.DYNAMIC_MENU_LINK, "here");
	}

	public RegisterPageObject clickHereLink() {
		waitForElementVisible(driver, DynamicPageUI.DYNAMIC_MENU_LINK, "here");
		clickToElement(driver, DynamicPageUI.DYNAMIC_MENU_LINK, "here");
		return PageFactoryManager.getRegisterPage(driver);
	}

	public void inputToUserIDTextbox(String userName) {
		waitForElementVisible(driver, DynamicPageUI.DYNAMIC_TEXTBOX, "uid");
		sendKeysToElement(driver, DynamicPageUI.DYNAMIC_TEXTBOX, userName, "uid");
	}

	public void inputToPasswordTextbox(String password) {
		waitForElementVisible(driver, DynamicPageUI.DYNAMIC_TEXTBOX, "password");
		sendKeysToElement(driver, DynamicPageUI.DYNAMIC_TEXTBOX, password, "password");
	}

	public HomePageObject clickLoginButton() {
		waitForElementVisible(driver, DynamicPageUI.DYNAMIC_TEXTBOX, "btnLogin");
		clickToElement(driver, DynamicPageUI.DYNAMIC_TEXTBOX, "btnLogin");
		return PageFactoryManager.getHomePage(driver);
	}

	public void enterLoginInfo(User user) {
		inputToUserIDTextbox(user.getUserID());
		inputToPasswordTextbox(user.getPassword());
	}
}
