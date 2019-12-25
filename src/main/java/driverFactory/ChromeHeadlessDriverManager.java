package driverFactory;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import commons.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeHeadlessDriverManager extends DriverManager {

	@Override
	protected void createDriver() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("window-size=" + Constants.HEADLESS_RESOLUTION);
		driver = new ChromeDriver(options);

	}

}
