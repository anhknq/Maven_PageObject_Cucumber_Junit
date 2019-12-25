package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.HomePageUI;

public class HomePageObject extends AbstractPage{
	WebDriver driver;
	
	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean isWelcomeMessageDisplayed(String message) {
		waitForElementVisible(driver, HomePageUI.WELLCOME_MESSAGE);
		String actualText = getTextInElement(driver, HomePageUI.WELLCOME_MESSAGE);
		return actualText.equals(message);
	}
}
