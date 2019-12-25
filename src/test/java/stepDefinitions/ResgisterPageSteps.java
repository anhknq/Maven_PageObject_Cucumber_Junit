package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProvider.FileReaderManager;
import enums.Context;
import managers.PageFactoryManager;
import pageObjects.RegisterPageObject;
import testData.RegisterEmail;
import testData.User;

public class ResgisterPageSteps extends AbstractPage{

	WebDriver driver;
	RegisterPageObject registerPage;
	TestContext testContext;
	String emailID;
	List<RegisterEmail> emails;

	public ResgisterPageSteps(TestContext context) {
		driver = Hooks.openAndQuitBrowser();
		registerPage = PageFactoryManager.getRegisterPage(driver);
		testContext = context;
	}

	@Then("^verify Register page displayed$")
	public void verifyRegisterPageDisplayed() {
		registerPage.isRegisterPageDisplayed();
	}
	
	@When("^read data RegisterEmail$")
	public void readDataRegisterEmail() {
		emails = FileReaderManager.getInstance().getJsonReader().getEmailData();
	}
	
	@When("^enter email$")
	public void enterEmail() {
		emailID = emails.get(0).getEmailID();
		registerPage.inputToEmailTextbox(emailID);
	}

	@When("^click Submit button at Register page$")
	public void clickSubmitButtonAtRegisterPage() {
		registerPage.clickSubmitButton();
	}

	@Then("^get Login info$")
	public void getLoginInfo() {
		User user = registerPage.getLoginInfo();
		user.setRegisterEmail(emailID);
		FileReaderManager.getInstance().getJsonWriter().addNewUser(user);
	}

	@Given("^open Login page$")
	public void openLoginPage() {
		registerPage.openLoginPageUrl((String) testContext.scenarioContext.getContext(Context.LOGIN_URL));
	}

}
