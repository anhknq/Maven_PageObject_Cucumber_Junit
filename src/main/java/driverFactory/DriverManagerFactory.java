package driverFactory;

import enums.DriverType;

public class DriverManagerFactory {
	public static DriverManager getManager(DriverType driverType) {
		DriverManager driverManager = null;
		switch (driverType) {
		case CHROME:
			driverManager = new ChromeDriverManager();
			break;
		case FIREFOX:
			driverManager = new FirefoxDriverManager();
			break;
		case FIREFOXHEADLESS:
			driverManager = new FirefoxHeadlessDriverManager();
			break;
		case INTERNETEXPLORER:
			driverManager = new IEDriverManager();
			break;
		case EDGE:
			driverManager = new EdgeDriverManager();
			break;
		case CHROMEHEADLESS:
			driverManager = new ChromeHeadlessDriverManager();
			break;
		}
		return driverManager;
	}
}
