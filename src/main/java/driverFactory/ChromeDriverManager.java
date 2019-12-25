package driverFactory;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriverManager extends DriverManager {

	@Override
	protected void createDriver() {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();

		// Browser in Incognito / In Private mode
		//options.addArguments("--incognito");

		// DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		// capabilities.setCapability(ChromeOptions.CAPABILITY, options);

		// Disable developer mode extensions popup in Chrome
		options.addArguments("--disable-extensions");

		// Disable Automation InfoBar
		options.addArguments("disable-infobars");

		// Disable Automation InfoBar on Chrome lastest
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));

		// Disable Notifications Popup
		options.addArguments("--disable-notifications");

		// Disable Geo Location Popup
		options.addArguments("disable-geolocation");

		// Disable Save password Popup
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		options.setExperimentalOption("prefs", prefs);

		driver = new ChromeDriver(options);

	}

}
