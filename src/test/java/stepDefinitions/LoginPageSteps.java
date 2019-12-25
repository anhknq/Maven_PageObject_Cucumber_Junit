package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import dataProvider.FileReaderManager;
import enums.Context;
import managers.PageFactoryManager;
import pageObjects.LoginPageObject;
import testData.RegisterEmail;
import testData.User;

public class LoginPageSteps {
	WebDriver driver;
	LoginPageObject loginPage;
	TestContext testContext;

	public LoginPageSteps(TestContext context) {
		driver = Hooks.openAndQuitBrowser();
		loginPage = PageFactoryManager.getLoginPage(driver);
		testContext = context;
	}

	@Given("^get Login page Url$")
	public void getLoginPageUrl() {
		testContext.scenarioContext.setContext(Context.LOGIN_URL, loginPage.getLoginPageUrl());
	}

	@Given("^click Here link$")
	public void clickHereLink() {
		loginPage.clickHereLink();
	}
	
	@When("^enter Login info$")
	public void enterLoginInfo() {
		List<RegisterEmail> emails = FileReaderManager.getInstance().getJsonReader().getEmailData();
		String email = emails.get(0).getEmailID();
		User user = FileReaderManager.getInstance().getJsonReader().getUserByEmail(email);
		loginPage.enterLoginInfo(user);
	}

	@When("^click Login button at Login page$")
	public void clickLoginButtonAtLoginPage() {
		loginPage.clickLoginButton();
	}
	
}
