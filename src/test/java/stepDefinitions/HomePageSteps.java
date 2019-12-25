package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import managers.PageFactoryManager;
import pageObjects.HomePageObject;

public class HomePageSteps {
	WebDriver driver;
	HomePageObject homePage;

	public HomePageSteps() {
		driver = Hooks.openAndQuitBrowser();
		homePage = PageFactoryManager.getHomePage(driver);
	}

	@Then("^Verify Home page displayed with message \"([^\"]*)\"$")
	public void verifyHomePageDisplayedWithMessage(String message) {
		homePage.isWelcomeMessageDisplayed(message);
	}
}
