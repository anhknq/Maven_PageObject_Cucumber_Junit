package cucumber;

import managers.WebDriverManager;

public class TestContext {
	private WebDriverManager webDriverManager;
	public ScenarioContext scenarioContext;

	public TestContext() {
		webDriverManager = new WebDriverManager();
		scenarioContext = new ScenarioContext();
	}

	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}

	public ScenarioContext getScenarioContext() {
		return scenarioContext;
	}

}