package commons;

import java.util.Random;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageUIs.DynamicPageUI;

public class AbstractPage {

	// API------------------------------------------------------------------------------------------------
	public String getPageUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}

	public void openPageUrl(WebDriver driver, String url) {
		driver.get(url);
	}

	public String getAtributeValue(WebDriver driver, String locator, String atribute) {
		element = driver.findElement(By.xpath(locator));
		return element.getAttribute(atribute);
	}

	public boolean isControlDisplayed(WebDriver driver, String locator, String... dynamicValue) {
		locator = String.format(locator, (Object[]) dynamicValue);
		return driver.findElement(By.xpath(locator)).isDisplayed();
	}

	public void clickToElement(WebDriver driver, String locator, String... dynamicValue) {
		locator = String.format(locator, (Object[]) dynamicValue);
		element = driver.findElement(By.xpath(locator));
		if (driver.toString().contains("internet explorer")) {
			clickToElementByJS(driver, locator);
			sleepInSecond(driver, 5);
		} else {
			try {
				element.click();
			} catch (Exception e) {
				clickToElementByJS(driver, locator);
			}
		}
	}

	public void sendKeysToElement(WebDriver driver, String locator, String valuesToSendKey, String... dynamicValue) {
		locator = String.format(locator, (Object[]) dynamicValue);
		WebElement element = driver.findElement(By.xpath(locator));
		element.clear();
		element.sendKeys(valuesToSendKey);
	}

	public String getTextInElement(WebDriver driver, String locator, String... dynamicValue) {
		locator = String.format(locator, (Object[]) dynamicValue);
		highlightElement(driver, locator);
		return driver.findElement(By.xpath(locator)).getText();
	}

	public void selectItemInDropdown(WebDriver driver, String locator, String itemText, String... dynamicValue) {
		locator = String.format(locator, (Object[]) dynamicValue);
		element = driver.findElement(By.xpath(locator));
		select = new Select(element);
		select.selectByVisibleText(itemText);
	}

	public void clickToLink(WebDriver driver, String locator, String... dynamicValue) {
		locator = String.format(locator, (Object[]) dynamicValue);
		if (driver.toString().equalsIgnoreCase("internet explorer")) {
			driver.get(getAtributeValue(driver, locator, "href"));
		} else {
			clickToElement(driver, locator);
		}
	}

	public void uploadMultiplefiles(WebDriver driver, String locator, String... fileNames) {
		String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\uploadFiles";
		String fullPath = "";
		for (String file : fileNames) {
			fullPath = fullPath + filePath + file + "\n";
		}
		fullPath = fullPath.trim();
		sendKeysToElement(driver, locator, fullPath);
	}

	// wait&sleep------------------------------------------------------------------------------------------
	public void waitForElementVisible(WebDriver driver, String locator, String... dynamicValue) {
		locator = String.format(locator, (Object[]) dynamicValue);
		waitExplicit = new WebDriverWait(driver, longTimeout);
		waitExplicit.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	}

	public void sleepInSecond(WebDriver driver, long timeInSecond) {
		try {
			Thread.sleep(timeInSecond * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// Javascript-----------------------------------------------------------------------------------------
	public void removeAtribute(WebDriver driver, String atribute, String locator, String... dynamicValue) {
		locator = String.format(locator, (Object[]) dynamicValue);
		element = driver.findElement(By.xpath(locator));
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].removeAttribute('" + atribute + "');", element);
	}

	public void clickToElementByJS(WebDriver driver, String locator) {
		js = (JavascriptExecutor) driver;
		element = driver.findElement(By.xpath(locator));
		js.executeScript("arguments[0].click();", element);
	}

	public void highlightElement(WebDriver driver, String locator) {
		js = (JavascriptExecutor) driver;
		element = driver.findElement(By.xpath(locator));
		String originalStyle = element.getAttribute("style");
		js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2])", element, "style",
				"border: 3px solid red; border-style: dashed; background-color: yellow");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2])", element, "style", originalStyle);
	}

	// Alert----------------------------------------------------------------------------------------------
	public void waitForAlertPresent(WebDriver driver) {
		waitExplicit = new WebDriverWait(driver, longTimeout);
		waitExplicit.until(ExpectedConditions.alertIsPresent());
	}

	public String getTextAlert(WebDriver driver) {
		return driver.switchTo().alert().getText();
	}

	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
		sleepInSecond(driver, 2);
	}

	public boolean isAlertDisplayedAndAcceptAlert(WebDriver driver, String expectedMessage) {
		waitForAlertPresent(driver);
		String alertMessage = getTextAlert(driver);
		acceptAlert(driver);
		return alertMessage.equals(expectedMessage);
	}

	// Verify---------------------------------------------------------------------------------------------
	public boolean isDataInTableRowEquals(WebDriver driver, String rowName, String expectedValue) {
		waitForElementVisible(driver, DynamicPageUI.DYNAMIC_DATA_IN_TABLE, rowName);
		return getTextInElement(driver, DynamicPageUI.DYNAMIC_DATA_IN_TABLE, rowName).equals(expectedValue);
	}

	// Commons--------------------------------------------------------------------------------------------
	public String randomDataTest() {
		Random random = new Random();
		return String.valueOf(random.nextInt(99999));
	}

	public String getCurrentDay() {
		DateTime nowUTC = new DateTime(DateTimeZone.UTC);
		int day = nowUTC.getDayOfMonth();
		if (day < 10) {
			String dayValue = "0" + day;
			return dayValue;
		}
		return day + "";
	}

	public String getCurrentMonth() {
		DateTime now = new DateTime(DateTimeZone.UTC);
		int month = now.getMonthOfYear();
		if (month < 10) {
			String monthValue = "0" + month;
			return monthValue;
		}
		return month + "";
	}

	public String getCurrentYear() {
		DateTime now = new DateTime(DateTimeZone.UTC);
		return now.getYear() + "";
	}

	public String getToday() {
		return getCurrentYear() + "-" + getCurrentMonth() + "-" + getCurrentDay();
	}

	// Dynamic--------------------------------------------------------------------------------------------
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

	private WebDriverWait waitExplicit;
	private int longTimeout = Constants.LONG_TIME_OUT;
	private JavascriptExecutor js;
	private WebElement element;
	private Select select;

}
