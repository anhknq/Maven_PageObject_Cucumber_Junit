package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import managers.PageFactoryManager;
import pageObjects.FundTransferPageObject;

public class FundTransferPageSteps {
	WebDriver driver;
	FundTransferPageObject fundTransferPage;
	TestContext testContext;

	public FundTransferPageSteps(TestContext context) {
		driver = Hooks.openAndQuitBrowser();
		fundTransferPage = PageFactoryManager.getFundTransferPage(driver);
		testContext = context;
	}

}