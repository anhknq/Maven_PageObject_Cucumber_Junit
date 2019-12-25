package driverFactory;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxDriverManager extends DriverManager {
	private final String workingDir = System.getProperty("user.dir");

	@Override
	protected void createDriver() {
		// C1:System.setProperty("webdriver.gecko.driver",".\\resources\\geckodriver.exe");
		// C2:WebDriverManager.firefoxdriver().version("47.0.2").setup();
		// C3: get lastest version
		WebDriverManager.firefoxdriver().setup();

		// Disable log in Firefox lastest
		// 1- Disable firefox log
		System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
		// 2- Add log to text file for tracking later
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, workingDir + "\\FirefoxUILog.txt");

		// Browser in Incognito / In Private mode
		// FirefoxOptions options = new FirefoxOptions();
		// options.addArguments("-private");

		driver = new FirefoxDriver();
		// driver = new FirefoxDriver(options);

	}

}
