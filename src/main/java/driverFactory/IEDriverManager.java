package driverFactory;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IEDriverManager extends DriverManager {

	@SuppressWarnings("deprecation")
	@Override
	protected void createDriver() {
		WebDriverManager.iedriver().arch32().setup(); // 64 bit causes Sendkey slowly on IE, 32 bit can use for both OS
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		driver = new InternetExplorerDriver(capabilities);
	}
}