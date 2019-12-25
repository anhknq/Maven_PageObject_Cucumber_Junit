package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.DynamicPageUI;

public class DynamicPageObject extends AbstractPage {

	WebDriver driver;

	public DynamicPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void inputToDynamicTextbox(WebDriver driver, String textboxName, String valueToSendKey) {
		waitForElementVisible(driver, DynamicPageUI.DYNAMIC_TEXTBOX, textboxName);
		sendKeysToElement(driver, DynamicPageUI.DYNAMIC_TEXTBOX, valueToSendKey, textboxName);
	}

	public void inputToDynamicArea(WebDriver driver, String textAreaName, String valueToSendKey) {
		waitForElementVisible(driver, DynamicPageUI.DYNAMIC_TEXTAREA, textAreaName);
		sendKeysToElement(driver, DynamicPageUI.DYNAMIC_TEXTAREA, valueToSendKey, textAreaName);
	}

	public void clickToDynamicRadioButton(WebDriver driver, String radioButtonValue) {
		waitForElementVisible(driver, DynamicPageUI.DYNAMIC_RADIO_BUTTON, radioButtonValue);
		clickToElement(driver, DynamicPageUI.DYNAMIC_RADIO_BUTTON, radioButtonValue);
	}

	public void clickToDynamicButton(WebDriver driver, String buttonValue) {
		waitForElementVisible(driver, DynamicPageUI.DYNAMIC_BUTTON, buttonValue);
		clickToElement(driver, DynamicPageUI.DYNAMIC_BUTTON, buttonValue);
	}

	public void selectItemInDynamicDropdown(WebDriver driver, String dropdownName, String selectedValue) {
		waitForElementVisible(driver, DynamicPageUI.DYNAMIC_DROPDOWNLIST, dropdownName);
		selectItemInDropdown(driver, DynamicPageUI.DYNAMIC_DROPDOWNLIST, selectedValue, dropdownName);
	}

	public String getDynamicDataInTable(WebDriver driver, String rowName) {
		waitForElementVisible(driver, DynamicPageUI.DYNAMIC_DATA_IN_TABLE, rowName);
		return getTextInElement(driver, DynamicPageUI.DYNAMIC_DATA_IN_TABLE, rowName);
	}

	public void openDynamicPageLinks(WebDriver driver, String pageName) {
		waitForElementVisible(driver, DynamicPageUI.DYNAMIC_MENU_LINK, pageName);
		clickToElement(driver, DynamicPageUI.DYNAMIC_MENU_LINK, pageName);
	}

	public boolean isDynamicPageOrMessageDisplayed(WebDriver driver, String message) {
		waitForElementVisible(driver, DynamicPageUI.DYNAMIC_PAGE_HEADING, message);
		return isControlDisplayed(driver, DynamicPageUI.DYNAMIC_PAGE_HEADING, message);
	}

}
