package runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import dataProvider.FileReaderManager;
import com.vimalselvam.cucumber.listener.Reporter;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/functionalTests/test", 
		glue = { "stepDefinitions" }, 
		plugin = { "pretty", "html:target/site/cucumber-report-default", "json:target/site/cucumber.json", 
				   "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/cucumber-extent-reports/report.html" }, 
		monochrome = true,
		dryRun = false,
		snippets = SnippetType.CAMELCASE,
		tags = {"@paymentflow"}
		)

public class CucumberTestRunner {
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
	    Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	    Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
	    Reporter.setSystemInfo("Selenium", "3.7.0");
	    Reporter.setSystemInfo("Maven", "3.5.2");
	    Reporter.setSystemInfo("Java Version", "1.8.0_151");
	}
}