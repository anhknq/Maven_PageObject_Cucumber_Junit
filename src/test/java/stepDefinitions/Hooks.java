package stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

import com.google.common.io.Files;
import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import dataProvider.FileReaderManager;

public class Hooks {
	private static WebDriver driver;
	private static final Logger log = Logger.getLogger(Hooks.class.getName());

	private final String workingDir = System.getProperty("user.dir");

	@Before(order = 2)
	public void deleteAllFileScreenshot() {
		deleteAllFileInFolder();
	}

	@Before(order = 1)
	public void beforeScenario(Scenario scenario) {
		Reporter.assignAuthor("Quynh Anh");
	}

	@Before(order = 0)
	public synchronized static WebDriver openAndQuitBrowser() {
		if (driver == null) {
			try {
				driver = new managers.WebDriverManager().getDriver();

			} // Browser crash
			catch (UnreachableBrowserException e) {
				driver = new ChromeDriver();

			} // driver crash
			catch (WebDriverException e) {
				driver = new ChromeDriver();
			}
			// Code này luôn luôn được chạy dù pass hay fail
			finally {
				Runtime.getRuntime().addShutdownHook(new Thread(new BrowserCleanup()));
			}
			driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
		}
		return driver;
	}

	@After
	public void afterScenario(Scenario scenario) {
		if (scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			try {
				Calendar calendar = Calendar.getInstance();
				SimpleDateFormat formater = new SimpleDateFormat("dd_DD_yyyy_hh_mm_ss");

				TakesScreenshot ts = ((TakesScreenshot) driver);
				// testContext.getWebDriverManager().getDriver());
				byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);

				// This takes a screenshot from the driver at save it to the specified location
				File sourcePath = ts.getScreenshotAs(OutputType.FILE);

				// Building up the destination path for the screenshot to save
				File destinationPath = new File(workingDir + "/target/cucumber-extent-reports/"
						+ screenshotName + "_" + formater.format(calendar.getTime()) + ".png");
				// Copy taken screenshot from source location to destination location
				Files.copy(sourcePath, destinationPath);

				// This attach the specified screenshot to the test
				Reporter.addScreenCaptureFromPath(destinationPath.toString());

				// attach screenshot to Cucumber reporting
				scenario.embed(screenshot, "image/png");

			} catch (IOException e) {
				e.getMessage();
			}
		}
	}

	private void deleteAllFileInFolder() {
		try {
			String pathFolderDownload = workingDir + "/target/cucumber-extent-reports/";
			File file = new File(pathFolderDownload);
			File[] listOfFiles = file.listFiles();
			for (int i = 0; i < listOfFiles.length; i++) {
				if (listOfFiles[i].isFile()) {
					new File(listOfFiles[i].toString()).delete();
				}
			}
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}

	public static void close() {
		try {
			if (driver != null) {
				openAndQuitBrowser().quit();
				log.info("------------- Closed the browser -------------");
			}
		} catch (UnreachableBrowserException e) {
			System.out.println("Can not close the browser");
		}
	}

	private static class BrowserCleanup implements Runnable {
		public void run() {
			close();
		}
	}

}