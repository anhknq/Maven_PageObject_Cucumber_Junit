package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import managers.PageFactoryManager;
import pageObjects.WithdrawalPageObject;

public class WithdrawalPageSteps {
	WebDriver driver;
	WithdrawalPageObject withdrawalPage;
	TestContext testContext;

	public WithdrawalPageSteps(TestContext context) {
		driver = Hooks.openAndQuitBrowser();
		withdrawalPage = PageFactoryManager.getWithdrawalPage(driver);
		testContext = context;
	}

}